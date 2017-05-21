package com.company.mobapp.businessObjects;
Seema
import org.testng.Assert;
import org.testng.annotations.Test;

import com.company.mobapp.pageObjects.AmexHomepage_PO;
import com.company.mobapp.pageObjects.LoginPage_PO;
import com.company.mobapp.pageObjects.MyPlanner_PO;
import com.company.mobapp.pageObjects.PlaceOfInterest_PO;
import com.company.mobapp.pageObjects.PlanResultPage_PO;
import com.company.mobapp.pageObjects.PlanningTrip_PO;
import com.infogain.itas.controlObjects.ControlObjects;
import com.infogain.itas.driver.Driver;
import com.infogain.itas.reporting.Reporting;


public class Test_MobileApp extends Driver{

	private LoginPage_PO _login = new LoginPage_PO();
	private AmexHomepage_PO _preferences=new AmexHomepage_PO();
	private PlanningTrip_PO _testtrip=new PlanningTrip_PO();
	private PlanResultPage_PO _testresult=new PlanResultPage_PO();
	private PlaceOfInterest_PO _testpoi=new PlaceOfInterest_PO();
	private MyPlanner_PO _testmyplanner=new MyPlanner_PO();
	ControlObjects _controls = new ControlObjects();

	//If NOT logged in with authorised fb account	
	@Test(priority = 1) //can set always run true annotation
	public void MvpLogin_NewFBacct() {
		// Capture businessObject information for reporting purpose.
		String businessWorkflow = new Object() {
		}.getClass().getEnclosingMethod().getName();
		// Set 'Business Workflow' name to write it into the reporting.csv file.

		Reporting.setBusinessWorkflow(businessWorkflow);
		_login.login_newFBacct();
		//this.Test_AmexHomepage();
	}

	//If already logged in with authorised fb account
	@Test(priority = 1) //can set always run true annotation
    public void MvpLogin_FBacctAdded() {
	// Capture businessObject information for reporting purpose.
	String businessWorkflow = new Object() {
	}.getClass().getEnclosingMethod().getName();
	// Set 'Business Workflow' name to write it into the reporting.csv file.

	Reporting.setBusinessWorkflow(businessWorkflow);
	_login.login_FBacctAdded();
    }


    //Login through MVP App
    @Test(priority = 1) //can set always run true annotation
    public void MvpLogin_thruapp() {
	// Capture businessObject information for reporting purpose.
	String businessWorkflow = new Object() {
	}.getClass().getEnclosingMethod().getName();
	// Set 'Business Workflow' name to write it into the reporting.csv file.

	Reporting.setBusinessWorkflow(businessWorkflow);
	_login.login_app();
    }

    //Verify preferences selection from 'My preferences' option on Homepage
	@Test(priority=2) //can apply depends on method 1
	public void Test_AmexHomepage() {
		// Capture businessObject information for reporting purpose.
		String businessWorkflow = new Object() {}.getClass().getEnclosingMethod().getName();
		// Set 'Business Workflow' name to write it into the reporting.csv file.

		Reporting.setBusinessWorkflow(businessWorkflow);
		_preferences.Set_Preferences();
	}

	//Verify functionality of 'Trip plan' Page
	@Test(priority=3) //can apply depends on method 1
	public void Test_plantrip() {
		// Capture businessObject information for reporting purpose.
		String businessWorkflow = new Object() {}.getClass().getEnclosingMethod().getName();
		// Set 'Business Workflow' name to write it into the reporting.csv file.

		Reporting.setBusinessWorkflow(businessWorkflow);
		_testtrip.plantrip();
	}
	
	//Verify functionality of Result page
	@Test(priority=4) //can apply depends on method 1
	public void Test_planresult() {
		// Capture businessObject information for reporting purpose.
		String businessWorkflow = new Object() {}.getClass().getEnclosingMethod().getName();
		// Set 'Business Workflow' name to write it into the reporting.csv file.

		Reporting.setBusinessWorkflow(businessWorkflow);
		_testresult.selectdestination();
	}
	
	//Verify detailed info about POI
	@Test(priority=5) //can apply depends on method 1
	public void Test_placeOfInterest() {
		// Capture businessObject information for reporting purpose.
		String businessWorkflow = new Object() {}.getClass().getEnclosingMethod().getName();
		// Set 'Business Workflow' name to write it into the reporting.csv file.

		Reporting.setBusinessWorkflow(businessWorkflow);
	_testpoi.poihelp();
	}

	
	//Verify detailed info about POI
		@Test(priority=6) //can apply depends on method 1
		public void Test_myplanner() {
			// Capture businessObject information for reporting purpose.
			String businessWorkflow = new Object() {}.getClass().getEnclosingMethod().getName();
			// Set 'Business Workflow' name to write it into the reporting.csv file.

			Reporting.setBusinessWorkflow(businessWorkflow);
			_testmyplanner.dayplans();
		}

}