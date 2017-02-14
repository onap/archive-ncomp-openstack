
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.ncomp.openstack.controller.tools 

import org.openecomp.ncomp.sirius.manager.JavaHttpClient;
import org.openecomp.ncomp.sirius.manager.Jetty8Client;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.Subject;
import org.openecomp.ncomp.sirius.manager.server.Response
import org.openecomp.ncomp.core.NamedEntity
import org.openecomp.ncomp.core.User
import org.openecomp.ncomp.openstack.*
import org.openecomp.ncomp.openstack.core.*
import org.openecomp.ncomp.openstack.location.*
import org.openecomp.ncomp.openstack.compute.*
import org.openecomp.ncomp.openstack.location.OpenStackLocation
import org.openecomp.ncomp.openstack.location.OpenStackProject
import org.openecomp.ncomp.openstack.neutron.CreateNetworkRequest;
import org.openecomp.ncomp.openstack.neutron.NeutronFactory;
import org.openecomp.ncomp.openstack.neutron.NeutronObject;
import org.openecomp.ncomp.openstack.neutron.NeutronPackage;
import org.openecomp.ncomp.openstack.neutron.NeutronRequest
import org.openecomp.ncomp.webservice.utils.FileUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.HttpExchange;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.io.Buffer;
import org.eclipse.jetty.io.BufferUtil;
import org.eclipse.jetty.io.ByteArrayBuffer
import org.json.JSONObject
import org.json.JSONArray

import static org.openecomp.ncomp.utils.PropertyUtil.getPropertiesFromClasspath


class OpenStackUtil {   
	public static final Logger logger = Logger.getLogger(OpenStackUtil.class);
	public static final Logger plogger = Logger.getLogger("org.openecomp.ncomp.openstack.OpenStackUtil.polling");
	Properties props
	List<OpenStackControllerProject> projects = []   
	ManagementServer server 
	OpenStackLocation loc // used for polling
	OpenStackLocation realLocation // location in controller state.
	boolean debug = false
	int serverCreationTimeout 
	public long pollingFrequency = 300000

	public OpenStackUtil(OpenStackLocation loc1, ManagementServer server1, String file = "openstack.properties") {
		props = getPropertiesFromClasspath(file);
		EPackage p1 = LocationPackage.eINSTANCE;
		debug = Boolean.parseBoolean(props.getProperty("server.debug","false"));
		serverCreationTimeout = Integer.parseInt(props.get("serverCreationTimeout","120"))
		pollingFrequency = Integer.parseInt(props.get("pollingFrequency","300000"))
		server = server1
		realLocation = loc1
		loc = EcoreUtil.copy(loc1)
		loc.projects.each { p ->
			projects += new OpenStackControllerProject(p)
		}
		System.err.println "OPENSTACK: debug=$debug pollingFrequency=$pollingFrequency"
		logger.info("Found ${projects.size()} projects".toString())
		if (!projects.find { it.tenantName == "admin"}) {
			logger.warn("Missing Admin Openstack project")
		}
	}
	static main(args) {
		// BROKEN WITH THE NEW SETUP. Need to create Location object
		// ALWAYS USE GMT.
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		OpenStackUtil openstack = new OpenStackUtil()
		switch ("T") {
			case "T":
			CreateNetworkRequest r = NeutronFactory.eINSTANCE.createCreateNetworkRequest()
			r.name = "someone-test"
			r.tenant_id = openstack.projects[0].tenantId
			openstack.projects[0].create(r)
			break
			case "P":
			openstack.poll()
			println openstack.server.ecore2json(openstack.loc, 100, null, false).toString(2)
			break
			case "S": openstack.projects[0].createServer(); break
		}
		
	}
	public OpenStackLocation poll() {
		if (loc.keystoneUrl == null) {
			logger.warn("No keystoneUrl for $loc.name")
			return
		}
		plogger.info "Starting Logging"
		if (props.get("noPoll","no") == "yes") return null
		loc.images.clear()
		def oldFlavors = []
		loc.flavors.each { f -> oldFlavors += f }
		loc.flavors.clear()
		
		if (projects.size() == 0) {
			logger.warn("No project to poll")
			return
		}
		
		projects[0].updateGeneric(loc,"image")
		try {
			projects[0].updateGeneric(loc,"flavor")
		} 
		catch (e) {
		}
		if (loc.flavors.size() == 0) {
			logger.warn("Empty Flavor list, using old")
			System.err.println("Empty Flavor list, using old")
			oldFlavors.each { f -> loc.flavors.add(f) }
		}
		projects.each {OpenStackControllerProject p ->
			p.poll()
		}
		realLocation.mergeLocation(loc)
		server.save()
//		plogger.debug("${server.ecore2json(loc, 100, null, false).toString(2)}".toString()) 
		plogger.info "Done Logging"
		
		return loc
	}
	static def object2json(o,boolean fix = false) {
		switch (o) {
		case JSONObject: return o
		case EObject: return ManagementServer.ecore2json(o, 100, null, false)
		case List:
			def j = [] as JSONArray
			o.each { j.put(object2json(it,fix)) }
			return j
		case Map:
			def j = [:] as JSONObject
			o.each { String k,v ->
				if (v == null) return
				if (!fix)  {j.put(k,object2json(v)); return}
				switch (k) {
				case "addresses":
					def a = [] as JSONArray
					j.put(k,a)
					v.each { k1, v1 ->
						a.put(object2json([ name : k1, ips : v1],fix))
					}
					break
				case "metadata":
					def a = [] as JSONArray
					j.put(k,a)
					v.each { k1, v1 ->
						a.put(object2json([ key : k1, value :v1],fix))
					}
					break
				case ~/.*:.*/:
					// eg OS-EXT-STS:vm_state
					j.put(k.replace("-", "_").replace(":", "_"),object2json(v,fix))
//					String[] a = k.split(":")
//					String nn = a[1]
//					def j1 = [:] as JSONObject
//					j1.put(nn,object2json(v,fix))
//					j.put(a[0].replace("-", "_").toLowerCase(),j1)
					break
				default: j.put(k,object2json(v,fix))
				}
			}
			return j
		case boolean: case Boolean:
		case int: case Integer:
		case long: case Long:
		case double: case Double:
		case JSONObject.Null:
		case null:
		case String: return o; break
		case GString: return o.toString(); break
		default: logger.warn "Unable to convert: $o".toString()
		}
	  }
	def json2object (o) {
		switch (o) {
			case JSONObject:
				def m = [:]
				o.map.each { n,v -> m[n] = json2object(v) }
				return m
			case JSONArray:
				def a = []
				o.myArrayList.each { a += json2object(it) }
				return a
			case boolean: case Boolean:
			case int: case Integer:
			case long: case Long:
			case double: case Double:
			case null:
			case JSONObject.NULL:
			case String: return o; break
			case GString: return o.toString(); break
			default: logger.warn "Unable to convert to object: $o ${o.getClass().name}".toString()
		}
	}
	//{"flavor": {"vcpus": 1, "disk": 10, "name": "someone.test", "os-flavor-access:is_public": true, "rxtx_factor": 1, "OS-FLV-EXT-DATA:ephemeral": 33, "ram": 200, "id": 10001, "swap": 0}}
	def x = [:]
	def createFlavor(String projectName, VirtualMachineType vmType) {
          OpenStackControllerProject p
          p = projects.find {OpenStackControllerProject p1 -> p1.tenantName == projectName}
          if (p == null) return "No project with name $projectName"
		  def fName = vmType.name
		  def i = null
		  switch (loc.version) {
			  case OpenStackVersion.FOLSOM: // old BSA version
		          def flavors = p.httpJsonTransaction([url : "${p.urls['nova']}/flavors"],false)
		          x.flavors = flavors
		          def existingId = null
				  synchronized (loc) {
			          i = loc.flavorId + 1
			          flavors.flavors.each { ff -> 
			            def j = Integer.parseInt(ff.id)
			            // if (debug) System.err.println "Existing Flavors: id=$ff.id name=$ff.name"
			            if (i <= j) i = j + 1
			            if (fName == ff.name) existingId = ff.id 
			          }
					  loc.flavorId = i
					  server.save()
				  }
				  break;
		  }
          def req = [
            url : "${p.urls['nova']}/flavors",
            method : "POST",
            body : [ flavor : [
                  vcpus: vmType.numberOfCores,
                  disk: vmType.rootDiskSizeGB,
                  name: fName,
                  "os-flavor-access:is_public": true,
                  rxtx_factor: 1,
                  "OS-FLV-EXT-DATA:ephemeral": vmType.diskSizeGB,
                  ram: vmType.memorySizeMB,
                  swap: 0]
              ]
           ]
		   if (i != null) req.body.flavor.identity = i
           x.req = req
           def res = p.httpJsonTransaction(req,false)
           x.res = res
	}
	def createSecurityGroup(String projectName, VirtualMachineType vmType) {
          OpenStackControllerProject p
          p = projects.find {OpenStackControllerProject p1 -> p1.tenantName == projectName}
          if (p == null) return "No project with name $projectName"
          def gName = vmType.name 
          def req = [
            url : "${p.urls['nova']}/os-security-groups",
            method : "POST",
            body : [ security_group : [ name: gName, description : "Automatically created"  ] ]
           ]
           x.req = req
           def res = p.httpJsonTransaction(req,false)
		   // {"security_group_rule": {"from_port": 22, "ip_protocol": "tcp", "to_port": 22, "parent_group_id": 12, "cidr": "0.0.0.0/0", "group_id": null}}
		   vmType.incomingSecurityRules.each { SecurityRule r ->
			   def id = res.security_group.id
			   def req2 = [
				   url : "${p.urls['nova']}/os-security-group-rules",
				   method : "POST",
				   body : [ security_group_rule : [ 
					   from_port: r.portRangeStart,
					   to_port: r.portRangeEnd,
					   ip_protocol: r.ipProtocol.toString(),
					   cidr: r.prefix,
					   parent_group_id: id,
				   ] ]
				 ]
			   def res2 = p.httpJsonTransaction(req2,false)
		   }
           x.res = res
	}
	def delete(String projectName, String type, String name) {
		if (debug) System.err.println "DELETING $projectName $type $name"
		OpenStackControllerProject p
		p = projects.find {OpenStackControllerProject p1 -> p1.tenantName == projectName}
		if (p == null) return "No project with name $projectName"
		def types = "${type}s"
		def idName = "id"
		def oName = "name"
		def api = "nova"
		def dtypes = types
		def nameAttr = loc.version == OpenStackVersion.FOLSOM ? "display_name" : "name"
		switch (type) {
			case "volume": oName = nameAttr; api = "cinder"; break
			case "flavor": types = "$types/detail"; break
			case "security_group": types = "os-security-groups"; dtypes = types; break
			case "keypair": 
				p.httpJsonTransaction([url : "${p.urls[api]}/os-$types/$name", method:"DELETE"],false,true,true,false)
				if (debug) System.err.println "$type name=$name deleted"
				return
		}
		def l = p.httpJsonTransaction([url : "${p.urls[api]}/$types"],false)
		if (debug) System.err.println "l=$l"
		if (debug) System.err.println "DELETE LIST:"
		l["${type}s"].each { if (debug) System.err.println it }
		if (debug) System.err.println "type=$type types=$types oName=$oName name=$name idName=$idName"
		def fl = l["${type}s"].findAll { it[oName] == name }
		if (debug) System.err.println "DELETEING LIST: $fl"
		if (fl.size() == null) return "No $type with name $name"
		fl.each { f ->
			p.httpJsonTransaction([url : "${p.urls[api]}/$dtypes/${f[idName]}", method:"DELETE"],false,true,true,false)
			if (debug) System.err.println "$type name=$name id=${f[idName]} deleted"
		}
	}
	
	// {"volume": {"status": "creating", "availability_zone": "nova:lab2-bsa-02-bay04", 
	// "display_description": null, "snapshot_id": null, "user_id": null, "size": 2, 
	// "display_name": "someone.test", "imageRef": null, "attach_status": "detached", 
	// "volume_type": null, "project_id": null, "metadata": {}}}
	def createVolume (OpenstackRequestNewServer req) {
		OpenStackControllerProject p
		p = projects.find {OpenStackControllerProject p1 -> p1.tenantName == req.projectName}
		if (p == null) return "No project with name $projectName"
		def reqV = [url : "${p.urls['cinder']}/volumes/detail"]
		def resV = p.httpJsonTransaction(reqV,false)
//		System.out.println("VVVVVVVVVVVVVVVVVV: ${reqV}")
//		System.out.println("VVVVVVVVVVVVVVVVVV: ${resV}")
		def nameAttr = loc.version == OpenStackVersion.FOLSOM ? "display_name" : "name"
		def existingVol = resV.volumes.find { vol -> 
			( vol["display_name"] ?: vol["name"] ) == req.name	
		}
		if (existingVol != null) {
			if (debug) System.err.println "EXISTING VOLUME: ${existingVol}"
			switch (loc.version) {
			case OpenStackVersion.FOLSOM:
				if (existingVol.availability_zone != "nova:$req.hypervisor") 
					return [status:"error",message:"existing volume on wrong hypervisor: $existingVol.availability_zone"]
			}
			if ("$existingVol.size" != "$req.vmType.volumeSizeGB") 
				return [status:"error",message:"existing volume has wrong size: $existingVol.size"]
			if (existingVol.status != "available")
				return [status:"error",message:"existing volume is not available: $existingVol.status"]
			return [status: "ok", volume: existingVol]
		}
		def req1 = [
			url : "${p.urls['cinder']}/volumes",
			method : "POST",
			body : [ volume : [
				display_name: req.name,
				size: req.vmType.volumeSizeGB]
			  ]
		   ]
		if (req.hypervisor != null) {
			req1.body.volume.availability_zone = "nova:$req.hypervisor"
		}
       def res1 = p.httpJsonTransaction(req1,false,false)
//	   System.out.println("VVVVVVVVVVVVVVVVVV req1: ${req1}")
//	   System.out.println("VVVVVVVVVVVVVVVVVV res1: ${res1}")
	   def volume = res1.volume ?: null
	   // wait for the new volume to be available. Wait at most 10 seconds.
	   (1..10).each {
		   if (volume == null || volume.status == "available") return
		   sleep 1000
		   res1 = p.httpJsonTransaction([url : "${p.urls['cinder']}/volumes/$volume.id"],false,false)
//		   System.out.println("VVVVVVVVVVVVVVVVVV res1 LOOP: ${res1}")
		   volume = res1.volume ?: null
	   }
	   if (volume == null) return [status:"error",message:res1]
	   if (volume.status != "available") return [status:"error",message:"new volume did not become available"]
	   return [status: "ok", volume: volume]
	}
	// {"server": {"name": "someone.test", "imageRef": "9a460998-6501-4008-9eed-a510cf9a13bc", 
	// "availability_zone": "nova:lab3-bsa-03-bay03", "key_name": "someone", "flavorRef": "2", 
	// "max_count": 1, "min_count": 1, "networks": [], 
	// "security_groups": [{"name": "default"}, {"name": "ssh"}]}}
  	def createServer (OpenstackRequestNewServer req) {
		OpenStackControllerProject p
		def loc = realLocation
		p = projects.find {OpenStackControllerProject p1 -> p1.tenantName == req.projectName}
		if (p == null) throw new RuntimeException( "No project with name $req.projectName" )
		if (req.vmType == null) throw new RuntimeException("Null VmType")
		String flavorName = req.vmType.flavorName ?: req.vmType.name
		def flavor = loc.flavors.find { it.name == flavorName }
		if (flavor == null) {
			System.err.println "flavors $loc.name: ${loc.flavors.collect {it.name}}"
			throw new RuntimeException("No flavor with name '$flavorName'")
		}
        if (req.vmType.imageName == null) req.vmType.imageName = req.vmType.name
		def image = loc.images.find { it.name == req.vmType.imageName }
		if (image == null) throw new RuntimeException( "No image with name $req.vmType.imageName")
		def keypair = p.project.keypairs.find { it.name == req.user }
		if (req.user != null && keypair == null) throw new RuntimeException( "No key pair with name $req.user")
		def req1 = [
			url : "${p.urls['nova']}/servers",
			method : "POST",
			body : [ server : [
					name: req.name,
					imageRef: image.id,
					key_name: req.user,
					flavorRef: flavor.id,
					max_count: 1, min_count: 1, networks: [],
					security_groups: [[name: "default"]],
					config_drive: true,
				],
			]
		] 
		if (! loc.supportsSecurityGroups) req1.body.server.remove('security_groups')
		req.networks.each {network -> req1.body.server.networks += [uuid:network]}
		req.ports.each {port -> req1.body.server.networks += [port:port]}
		if (req.hypervisor != null) {			
			req1.body.server.availability_zone = "nova:$req.hypervisor"
		}
		if (req.user_data != null) {			
			req1.body.server.user_data = req.user_data
		}
		x["req"] = req1
		logger.info "create server request: ${object2json(req1).toString(2)}"  
		def server = p.httpJsonTransaction(req1,false)
		logger.info "create server return: ${object2json(server).toString(2)}"
		if (! server.server) {
			throw new RuntimeException("create server failed: ${object2json(server).toString(2)}")
		}
		def vol
		if (req.vmType.volumeSizeGB > 0) {
			vol = createVolume(req)
//			System.err.println "VOLUME= $req $vol "
			if (vol.status != "ok") {
				 throw new RuntimeException("create volume failed: $vol.message")
			}
		}
		String sid = server.server.id
		// wait upto 2 minutes for status to become ACTIVE
		def status = "??"
		(1..serverCreationTimeout/5).each {
			if (status == "ACTIVE") return
			sleep 5000
			def x = p.httpJsonTransaction([url : "${p.urls['nova']}/servers/$sid"])
//			if (debug) System.err.println "Waiting status=$x.server.status"
			status = x.server.status
		}
		logger.info "Done waiting status=$status"
		if (status != "ACTIVE") { 
			throw new RuntimeException("create server failed to get ACTIVE: ${object2json(server).toString(2)}")
		}
//		if (debug) System.err.println object2json(server).toString(2)
		if (req.vmType.volumeSizeGB > 0) {
//			if (debug) System.err.println object2json(vol.volume).toString(2)
			def attach = [
				url : "${p.urls['nova']}/servers/$sid/os-volume_attachments",
				method : "POST",
				body : [ volumeAttachment: [volumeId: vol.volume.id, device: "/dev/vdc"]]
			]
			server["volume"] = vol
//			if (debug) System.err.println "attach request: ${object2json(attach).toString(2)}"
			def a = p.httpJsonTransaction(attach,false)
//			if (debug) System.err.println object2json(a).toString(2)
			server["volume_attach"] = a
		}
		if (req.vmType.incomingSecurityRules.size() > 0  && loc.supportsSecurityGroups) {
			def addSecurityGroup = [
				url : "${p.urls['nova']}/servers/$sid/action",
				method : "POST",
				body : [ addSecurityGroup: [name: "$req.vmType.name"]]
			]
			def res4 = p.httpJsonTransaction(addSecurityGroup,false,true,true,false)
		}
		if (req.vmType.needPublicIp) {
			sleep 10000
			server["ip"] = addFloatingIp(req.projectName, sid, req.floatingIp)
		}
		x["res"] = server 
//		if (debug) System.err.println object2json(server).toString(2)
		return server
	}
	def createKeypair (String projectName, User user) {
		  OpenStackControllerProject p
		  p = projects.find {OpenStackControllerProject p1 -> p1.tenantName == projectName}
		  if (p == null) return "No project with name $projectName"
		  def req1 = [
			  url : "${p.urls['nova']}/os-keypairs",
			  method : "POST",
			  body : [ keypair : [
				  name: user.name,
				  public_key: user.publicKey]
				]
			 ]
		 def k = p.httpJsonTransaction(req1,false)
//		 if (debug) System.err.println k
		 return k
	}
	def addFloatingIp(String projectName,sid,requestIp) {
		OpenStackControllerProject p
		p = projects.find {OpenStackControllerProject p1 -> p1.tenantName == projectName}
		if (p == null) return "No project with name $projectName"
		def res = p.httpJsonTransaction([url : "${p.urls['nova']}/os-floating-ips"],false)
		def ip = null
//		if (debug) System.err.println object2json(res).toString(2)
		res.floating_ips.each { x ->
			if (debug) System.err.println "AAAAAAAAAA ${object2json(x).toString(2)} ${x['instance_id']}"
			if (requestIp != null && requestIp != "$x.ip") return
			if ("${x['instance_id']}" == "null") ip = x.ip
		}
		if (requestIp != null && ip == null) {
			throw new RuntimeException("Unable to find requested floating IP: $requestIp")
		}
		if (ip == null) {
			res = p.httpJsonTransaction([method:"POST", url : "${p.urls['nova']}/os-floating-ips"],false)
//			if (debug) System.err.println object2json(res).toString(2)
			ip = res.floating_ip.ip	
			if (debug) System.err.println "Using new ip: $ip"
		} else {
			if (debug) System.err.println "Using old ip: $ip"
		}
		def req = [
			url : "${p.urls['nova']}/servers/$sid/action",
			method : "POST",
			body : [ addFloatingIp: [address: ip]]
		]
//		if (debug) System.err.println object2json(req).toString(2)
		p.httpJsonTransaction(req,false,true,true,false)
		return ip
	}
	def action(req) {
		switch (req) { 
			case OpenstackRequestDelete: delete(req.projectName,req.objectType, req.objectName); break
			case OpenstackRequestKeyPair: createKeypair(req.projectName,req.user); break
			case OpenstackRequestFlavor: createFlavor(req.projectName,req.vmType); break
			case OpenstackRequestSecurityGroup: createSecurityGroup(req.projectName,req.vmType); break
			case OpenstackRequestNewServer: 
				def r = createServer(req)
				logger.info "createServer returns: $r" 
				break;
		}
	}
	Response serverAction(OpenstackRequestServerAction req) {
		OpenStackControllerProject p
		p = projects.find {OpenStackControllerProject p1 -> p1.tenantName == req.projectName}
		if (p == null) {
			logger.warn "serverAction with null $req.projectName"
			throw new RuntimeException("no Openstack project $req.projectName")
		}
		Server s = p.project.servers.find { it.name == req.name }
		if (s == null) {
			logger.warn "serverAction unable to find VM with name $req.name in $req.projectName"
			throw new RuntimeException("unable to find VM with name $req.name in $req.projectName")
		}
		def url = "${p.urls['nova']}/servers/$s.ID/action"
		def res
		switch (req.action) {
			case "stop":
			case "start":
			  res = p.httpJsonTransaction([url:url,method:"POST",body:["os-$req.action":"null"]],false,true,true,false)
			  break;
			case "pause":
			case "unpause":
			case "suspend":
			case "resume":
			case "lock":
			case "unlock":
			  res = p.httpJsonTransaction([url:url,method:"POST",body:["$req.action":"null"]],false,true,true,false)
			  break;
			case "reboot":
			  res = p.httpJsonTransaction([url:url,method:"POST",body:[reboot:[type:"SOFT"]]],false,true,true,false)
			  break;
			case "hardReboot":
			  res = p.httpJsonTransaction([url:url,method:"POST",body:[reboot:[type:"HARD"]]],false,true,true,false)
			  break;
			case "reset-state":
			  res = p.httpJsonTransaction([url:url,method:"POST",body:['os-resetState':[state:"error"]]],false,true,true,false)
			  break;
			case "reset-state-active":
			  res = p.httpJsonTransaction([url:url,method:"POST",body:['os-resetState':[state:"active"]]],false,true,true,false)
			  break;
			default:
			  logger.error "unknown nova command $req.action";
			  return
		}
		if (res == null) {
			logger.warn "ran nova command $req.action on $req.name succesfully"
			return
		}
		logger.error "ran nova command $req.action on $req.name: $res"
	}
	
	OpenStackControllerProject findProject(String name) {
		return projects.find {OpenStackControllerProject p1 -> p1.tenantName == name}
	}


class OpenStackControllerProject {
	HttpClient httpClient
	def tokens = null
	String password
	String username
	String tenantName
	String tenantId
	String keystoneUrl
	OpenStackProject project
	def urls = [:]
	public OpenStackControllerProject(OpenStackProject project1) {
		project = project1
		tenantName = project.name
		username = project.adminUser
		password = props.get("${loc.name}.password.$username".toString())
		if (password == null) {
			// BSA setup 
			password = props.get("project.${project.name}.password".toString())
		}
		if (password == null) {
			logger.warn("No password for $loc.name $project.name")
			System.err.println "No password for $loc.name $project.name $username"
		}
		password = JavaHttpClient.decryptPassword(password)
		tenantId = project.tenantId
		keystoneUrl = loc.keystoneUrl
//		if (debug) System.err.println "u=$username pw=$password tenantId=$tenantId"
		// Remove the refs are supported.
//		logger.info "${server.ecore2json(loc, 100, null, false).toString(2)}".toString()
//		if (debug) System.err.println "${server.ecore2json(project, 100, null, false).toString(2)}"
		httpClient = new HttpClient()
		httpClient.start();
		updateTokens()
	}
	public void poll() {
//		updateImages()
//		updateGeneric(loc,"image")
//		updateGeneric(loc,"flavor")
		updateServers()
		updateHypervisor()
		try { updateSecurityGroups() } catch (e) { println "updateSecurityGroups failed: $e" }
		updateVolumes()
		updateKeypairs()
		if (urls['neutron'] != null) { 
			updateGenericNeutron(project, "network")
			updateGenericNeutron(project, "subnet")
			updateGenericNeutron(project, "router")
			updateGenericNeutron(project, "port")
			updateGenericNeutron(project, "security_group")
			updateGenericNeutron(project, "floatingip")
		}
		server.save()
	}
	/**
	 * Polls the Openstack Nova API for all the nova state (e.g, servers, images,..)
	 * for a project.
	 */
	def synchronized void updateTokens() {
		if (keystoneUrl == null) {
			logger.warn("No keystoneUrl for $loc.name")
			return
		}
		if (password == null) {
			logger.warn("No password for $loc.name")
			return
		}
		def req = [ url : "$keystoneUrl/tokens", method : "POST",
			body :[ auth : [passwordCredentials : [username: username, password: password], tenantId: tenantId]]
		]
		
 		// RACKSPACE
		if (project.apiKey != null) {
			req.body.auth =  ["RAX-KSKEY:apiKeyCredentials" : [username: username, apiKey: JavaHttpClient.decryptPassword(project.apiKey)]]
		}
		// {"auth": {"RAX-KSKEY:apiKeyCredentials": {"username": "ft123456", "apiKey": "dae41ba7484d4f8482"}}}

		tokens = httpJsonTransaction(req,,false,false,false)
		if (debug) System.err.println object2json(tokens).toString(2)
		if (! tokens.access) {
			if (debug) System.err.println "Unabled to access tenant: $tenantName : ${object2json(tokens).toString(2)}"
			logger.fatal "Unabled to access tenant: $tenantName : ${object2json(tokens).toString(2)}"
			return;
		}
		tokens.access.serviceCatalog.each { it ->
			def u = it.endpoints.get(0).publicURL
			it.endpoints.each { x ->
				if (x['region'] == project.region) 
					u = x.publicURL
			}
			urls[it.name] = u
			if (debug) System.err.println "serviceCatalog $it.name -> ${urls[it.name]}"
		}
		// RACKSPACE
		[ 	images :"cloudImages", 
			nova:"cloudServersOpenStack", 
			neutron: "cloudNetworks", 
			cinder: "cloudBlockStorage"]. each { n, v ->
			if (urls[n] == null && urls[v] != null) {
				System.err.println "Using $v service for $n"
				if (n == "neutron" && urls[v].endsWith("/v2.0"))
					urls[v] = urls[v].replace("/v2.0","")
				urls[n] = urls[v]
			}
			if (urls[n] != null) {
				System.err.println "No $n service"
			}
		}
	}
	def void updateImages() {
		def req1 = [url : "${urls['nova']}/images"]
		def res1 = httpJsonTransaction(req1)
//		if (debug) System.err.println object2json(res1).toString(2)
		loc.images.clear()
		res1.images.each { s ->
			def req2 = [url : s.links[0].href]
			def res2 = httpJsonTransaction(req2)
			logger.debug(object2json(res2).toString(2))
			createFromJson(server, new Subject(loc, "images"),object2json(res2.image,true)) ;
		}
	}
	def void updateKeypairs() {
		def req1 = [url : "${urls['nova']}/os-keypairs"]
		def res1 = httpJsonTransaction(req1)
		project.keypairs.clear()
		res1.keypairs.each { s ->
			createFromJson(server, new Subject(project, "keypairs"),object2json(s.keypair,true)) ;
		}
	}
	def void updateGeneric(o,name) {
		def req1 = [url : "${urls['nova']}/${name}s"]
		def res1 = httpJsonTransaction(req1)
//		if (debug) System.err.println object2json(res1).toString(2)
		o["${name}s"].clear()
		res1["${name}s"].each { s ->
//			logger.info("getting ${s.links[0].href}")
			def req2 = [url : s.links[0].href]
			def res2 = httpJsonTransaction(req2)
//			logger.debug( object2json(res2).toString(2))
//			if (debug) System.err.println "o=$o name=$name"
			createFromJson(server, new Subject(o, "${name}s"),object2json(res2[name],true)) ;
		}
	}
	def void updateGenericNeutron(o,name) {
		def req1 = [url : "${urls['neutron']}/v2.0/${name.replace('_','-')}s"]
		def res1 = httpJsonTransaction(req1)
//		if (debug) System.err.println object2json(res1).toString(2)
		o["${name}s"].clear()
		res1["${name}s"].each { s ->
			if (s.tenant_id != null && s.tenant_id != tenantId) return
			JSONObject json = OpenStackUtil.object2json(s,true)
//			if (debug) System.err.println json.toString(2)
//			if (debug) System.err.println "o=$o id=$s.id"
			if (s.name == null || s.name == "" || name == "security_group") json.put("name", s.id)
			createFromJson(server, new Subject(o, "${name}s"),json) ;
		}
	}
	def createFromJson(ManagementServer server,subject,JSONObject json) {
		server.create(subject,json,false)
	}

	def void updateHypervisor() {
		if (tenantName != "admin") return
		def req1 = [url : "${urls['nova']}/os-hypervisors/detail"]
		def res1 = null;
		try { res1 = httpJsonTransaction(req1) } catch (e) {
			logger.error "Unable to get Hypervisor information: $e"
			return
		}
//		if (debug) System.err.println object2json(res1).toString(2)
		loc.hypervisors.clear()
		res1.hypervisors.each { s ->
			def json = new JSONObject(s.cpu_info)
			s.cpu_info = json2object(json)
//			if (debug) System.err.println s
//			if (debug) System.err.println object2json(s,true)
//			logger.info(object2json(s).toString(2))
			createFromJson(server, new Subject(loc, "hypervisors"),object2json(s,true))
		}
		loc.hypervisors.each { it.name = it.service.host }
	}

	def void updateSecurityGroups() {
		def req1 = [url : "${urls['nova']}/os-security-groups"]
		def res1 = httpJsonTransaction(req1)
//		if (debug) System.err.println object2json(res1).toString(2)
		project.groups.clear()
		res1.security_groups.each { s ->
//			logger.info(object2json(s).toString(2))
			createFromJson(server, new Subject(project, "groups"),object2json(s,true))
		}
	}

	def void updateVolumes() {
		if (urls['cinder'] == null) return
		def req1 = [url : "${urls['cinder']}/volumes/detail"]
		def res1 = httpJsonTransaction(req1)
//		if (debug) System.err.println object2json(res1).toString(2)
//		System.out.println("VVVVVVVVVVVVVVVVVV poll res1: ${res1}")
		project.volumes.clear() 
		res1.volumes.each { s ->
//			logger.info(object2json(s).toString(2))
			createFromJson(server, new Subject(project, "volumes"),object2json(s,true))
		} 
		if (loc.version == OpenStackVersion.FOLSOM ) 
			project.volumes.each { it.name = it.display_name }
		project.volumes.each { 
			if (it.name == null) it.name = it.display_name
		}
	}

	def void updateFloatingIps() {
		def req1 = [url : "${urls['nova']}/os-floating-ips"]
		def res1 = httpJsonTransaction(req1)
//		if (debug) System.err.println object2json(res1).toString(2)
		project.ips.clear()
		res1.floating_ips.each { s ->
//			logger.info(object2json(s).toString(2))
			createFromJson(server, new Subject(project, "ips"),object2json(s,true))
		}
	}
	def void updateServers() {
		def req1 = [url : "${urls['nova']}/servers" ]
		def res1 = httpJsonTransaction(req1)
		project.servers.clear()
//		if (debug) System.err.println OpenStackUtil.object2json(res1).toString(2)
		res1.servers.each { s -> 
			def req2 = [url : s.links[0].href  ]
			def res2 = httpJsonTransaction(req2)
//			if (debug) System.err.println OpenStackUtil.object2json(res2).toString(2)
//			return
//			logger.debug(object2json(res2).toString(2))
			if (res2.server.image == "") res2.server.image = null
			createFromJson(server, new Subject(project, "servers"),object2json(res2.server,true))
//			def req3 = [url : res2.server.image.links[0].href]
//			def res3 = httpJsonTransaction(req3)
//			logger.debug( object2json(res3).toString(2))
//			def req4 = [url : res3.choices[0].links[0].href]
//			def res4 = httpJsonTransaction(req4)
//			logger.debug( object2json(res4).toString(2))
		}
	}
	def NeutronObject create(NeutronRequest req) {
		def ename = req.eClass().name
		def cname = ename.substring(6,ename.length()-7)
		def name = cname.toLowerCase()
		switch (req) {
			case CreateNetworkRequest: name = "network"; cname = "Network"; break 
		}
		JSONObject j = new JSONObject()
		// TODO look at annotations in ecore2json
		JSONObject jj = ManagementServer.ecore2json(req, 100, null, false)
		jj.remove('$class')
		jj.remove('projectName')
		req.eClass().EAllAttributes.each  { EAttribute attr ->
			EAnnotation anno = attr.getEAnnotation("http://openecomp.org/sirius/openstack");
			if (anno == null) return
			String name1 = anno.details.get("name")
			if (name1 != null && jj.has(attr.name)) {
				def v = jj.get(attr.name)
				jj.remove(attr.name)
				jj.put(name1, v)
			}
			name1 = anno.details.get("removeEmptyList")
			if (name1 == "true" && jj.has(attr.name)) {
				def v = jj.get(attr.name)
				switch (v) {
					case JSONArray: 
					if (v.length() == 0) jj.remove(attr.name)
				}
			}
		}
		req.eClass().EAllReferences.each  { EReference ref ->
			EAnnotation anno = ref.getEAnnotation("http://openecomp.org/sirius/openstack");
			if (anno == null) return
			String name1 = anno.details.get("name")
			if (name1 != null && jj.has(ref.name)) {
				def v = jj.get(ref.name) 
				jj.remove(ref.name)
				jj.put(name1, v)
			}
			name1 = anno.details.get("removeEmptyList")
			if (name1 == "true" && jj.has(ref.name)) {
				def v = jj.get(ref.name)
				switch (v) {
					case JSONArray:
					if (v.length() == 0) jj.remove(ref.name)
				}
			}
		}
		j.put(name, jj)
		if (debug) System.err.println jj.toString(2)
		def req1 = [url : "${urls['neutron']}/v2.0/${name.replace('_','-')}s", method:"POST", body:j]
		if (debug) System.err.println req1
		def res1 = httpJsonTransaction(req1)
		if (debug) System.err.println res1
		j = OpenStackUtil.object2json(res1[name],true)
		if (debug) System.err.println j == null ? "NULL" : j.toString(2)
        return server.json2ecore(NeutronPackage.eINSTANCE.getEClassifier(cname),j, false)
	}
	def void deleteNeutron(String type, String name) { 
		project["${type}s"].each { o ->
			if (o.name != name) return
			logger.warn "deleting $type $name $o.id" 
			def req1 = [url : "${urls['neutron']}/v2.0/${type.replace('_','-')}s/$o.id", method:"DELETE"]
			if (debug) System.err.println req1
			def res1 = httpJsonTransaction(req1,false,true,true,false)
			if (debug) System.err.println res1
	 	}
	}
	def httpJsonTransaction(m, boolean polling = true, boolean throwError = true, boolean addAuth = true, boolean expectResponse = true) {
		def exchange = new Exchange()
		if (debug) System.err.println "m=$m"
		def url = m.url ?: "${urls[m.api]}/$m.uri"
		if (loc.bypassIp) {
			url = url.replaceFirst("http://.*:", "http://$loc.bypassIp:")
		}
		exchange.setURL(url);
		if (debug) System.err.println "URL=$url"
		exchange.setMethod(m.method ?: "GET");
		def headers = m.headers ?: [:]
		headers['Content-type'] = 'application/json'
		if (addAuth) {
			headers['X-Auth-Token'] = tokens.access.token.id
			headers['X-Auth-Project-Id'] = project.tenantId
		}
		headers.each { n,v -> 
			exchange.addRequestHeader(n, v);
		if (debug) System.err.println "Header: $n: $v"
		}
		if (m.body) {
			String json = object2json(m.body).toString()
//			logger.info("REQUEST: ${object2json(m.body).toString(2)}")
			if (debug) System.err.println "REQUEST BODY: $json"
//			exchange.setRequestContentSource(new ByteArrayInputStream(json.bytes))
			exchange.setRequestContent(new ByteArrayBuffer(json.bytes));
		}
//		if (debug) System.err.println "Sending request"
		Date start = new Date()
		httpClient.send(exchange)
//		if (debug) System.err.println "Exchange sent"
		int exchangeState = exchange.waitForDone();
		if (debug) System.err.println "Exchange done: $exchangeState"
		if (debug) System.err.println "code=$exchange.code content=$exchange.content"
		if (polling)  plogger.info "content=$exchange.content" 
		else logger.info "content=$exchange.content" 
		def res = exchange.content.toString()
		if (res == "" && ! expectResponse) return null
		if (res == "") {
			def duration = new Date().time - start.time
			throw new RuntimeException("Openstack API returned NULL: $url duration=$duration")
		}
		if (res.startsWith("401 Unauthorize") || res.startsWith("Authentication required")) {
			// keystone auth expired
			logger.info("keystone auth expired, updating tokens and resending request")
			updateTokens();
			return httpJsonTransaction(m, polling, throwError, addAuth)
		}
		if (res.startsWith("404 Not Found")) {
			if (throwError)
				throw new RuntimeException("Openstack API: 404 Not Found")
			return null
		}
		JSONObject json = new JSONObject(res)
		if (exchange.code < 200 || exchange.code >= 300) {
			if (throwError && json.has("expection")) {
				throw new RuntimeException("Openstack API: expection $json")
			}
			if (throwError && json.has("badRequest")) {
				throw new RuntimeException("Openstack API: badRequest $json")
			}
			if (throwError && json.has("itemNotFound")) {
				throw new RuntimeException("Openstack API: itemNotFound $json")
			}
			if (throwError && json.has("NeutronError")) {
				throw new RuntimeException("Openstack API: NeutronError $json")
			}
			if (throwError) {
				throw new RuntimeException("Openstack API: Error $json")
			}
		}

		if (debug) System.err.println json.toString(2)
//		logger.info("RETURNED: ${json.toString(2)}")
		return json2object(json)
	}
	public void associateFloatingIp(String ipId, String portId) {
		def req1 = [url : "${urls['neutron']}/v2.0/floatingips/$ipId", method:"PUT", body:[floatingip:[port_id:portId]]]
		if (debug) System.err.println req1
		def res1 = httpJsonTransaction(req1,false,true,true,false)
		if (debug) System.err.println res1
//		return server.json2ecore(NeutronPackage.eINSTANCE.getEClassifier(cname),j, false)
	}
	

}

private class Exchange extends HttpExchange {
	String version2;
	int code;
	String message;
	String location;
	StringBuffer content = new StringBuffer();
	
	protected void onResponseHeader(Buffer name, Buffer value) {
//			System.out.println("HEADER: " + name + " " + value);
		if (name.toString().equals("Location"))
			location = value.toString();
	}

	protected void onResponseStatus(Buffer httpVersion, int statusCode, Buffer statusMessage) {
//		if (debug) System.err.println "v=$httpVersion code=$statusCode m=$statusMessage"
		version2 = httpVersion.toString();
		code = statusCode;
		message = statusMessage.toString();
	}
	protected void onResponseContent(Buffer content) {
		this.content.append(content.toString());
	}
	
}
}

