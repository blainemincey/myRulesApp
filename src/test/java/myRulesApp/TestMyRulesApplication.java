package myRulesApp;


import org.junit.Test;
import org.kie.api.runtime.KieSession;

import com.redhat.BRMSUtil;

import com.redhat.myproject.Applicant;
import com.redhat.myproject.Application;

/**
 * Test class executed during 'mvn test'.  Tests the rules.
 * 
 * @author bmincey
 *
 */
public class TestMyRulesApplication {

	/**
	 * 
	 */
	@Test
	public void test() {
		
		// Instantiate the KIE Session
		BRMSUtil brmsUtil = new BRMSUtil();
		KieSession kieSession = brmsUtil.getKieSession();

		// Need 2 facts - Applicant and Application
		Applicant applicant = new Applicant();
		Application application = new Application();
		
		// Modify the age for different results
		// age >= 21, the application will be approved
		applicant.setAge(22);
		
		// Log statements before rules fire
		System.out.println("BEFORE RULES FIRED -- Applicant's Age: " + applicant.getAge());
		System.out.println("BEFORE RULES FIRED -- Is application approved? " + application.isApproved());
		
		// Insert facts into KIE session (working memory)
		kieSession.insert(applicant);
		kieSession.insert(application);

		// Fire the rules
		kieSession.fireAllRules();

		// Log statement for after rules fire
		System.out.println("AFTER RULES FIRED -- Is application approved? " + application.isApproved());
	}

}
