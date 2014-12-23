package com.redhat;

import org.kie.api.KieServices;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * 
 * Utility class
 * (Modeled after BRMSUtil class in 
 * https://github.com/jbossdemocentral/brms-coolstore-demo) 
 * 
 * @author bmincey
 *
 */
public class BRMSUtil {
	
	private KieContainer kieContainer = null;
	
	/**
	 * 
	 */
	public BRMSUtil() {
		
		KieServices kieServices = KieServices.Factory.get();
		ReleaseId releaseId = kieServices.newReleaseId("com.redhat", "MyProject", "LATEST");
		kieContainer = kieServices.newKieContainer(releaseId);
		
	}

	/**
	 * 
	 * @return
	 */
	public KieSession getKieSession() {
		return kieContainer.newKieSession();
	}
	
}
