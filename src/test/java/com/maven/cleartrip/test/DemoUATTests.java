package com.maven.cleartrip.test;

import com.maven.cleartrip.framework.AppStarter;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.cleartrip.framework.BaseTest;
import com.maven.cleartrip.pages.HomePage;

public class DemoUATTests extends BaseTest{

	@Test
	public void CheckHomeLinkText()
	{
		AppStarter demouat_launcher = new AppStarter();
		demouat_launcher.openDemoUAT();
		String home_link_test = new HomePage(demouat_launcher.getDriver()).getHomeLinkText();
		Assert.assertEquals(home_link_test,"Home");
		demouat_launcher.closeDemoUAT();
	}
	@Test
	public void CheckFlightLinkText()
	{
		AppStarter demouat_launcher = new AppStarter();
		demouat_launcher.openDemoUAT();
		String flight_link_test = new HomePage(demouat_launcher.getDriver()).getFlightsLinkText();
		Assert.assertEquals(flight_link_test,"Flights");
		demouat_launcher.closeDemoUAT();
	}
	@Test
	public void CheckCruiseLinkText()
	{
		AppStarter demouat_launcher = new AppStarter();
		demouat_launcher.openDemoUAT();
		String cruise_link_test = new HomePage(demouat_launcher.getDriver()).getCruiseLinkText();
		Assert.assertEquals(cruise_link_test,"Cruises");
		demouat_launcher.closeDemoUAT();
	}

}
