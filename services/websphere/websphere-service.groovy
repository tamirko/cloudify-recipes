service {
   
    name "WebSphere7"
	icon "websphere_logo.png"
	type "APP_SERVER"
	numInstances 1

	lifecycle{	
		install "websphere_install.groovy"		
		start "websphere_start.groovy"
		stop "websphere_stop.groovy"
		postStop "websphere_uninstall.groovy"
		
		startDetectionTimeoutSecs 720
		startDetection {
			println "websphere-service.groovy: Testing port 8081 ..."
			ServiceUtils.isPortOccupied(8081)							
		}
	}
}	
 

	