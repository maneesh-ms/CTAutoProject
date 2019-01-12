package com.maven.cleartrip.test;

import com.maven.cleartrip.framework.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.cleartrip.framework.BaseTest;
import com.maven.cleartrip.pages.HomePage;

public class DemoUATTests extends BaseTest{

	@Test
	public void CheckHomeLinkText()
	{
		new BasePage().openDemoUAT();
		String home_link_test = new HomePage().getHomeLinkText();
		Assert.assertEquals(home_link_test,"Home");
	}
	@Test
	public void CheckFlightLinkText()
	{
		new BasePage().openDemoUAT();
		String home_link_test = new HomePage().getFlightsLinkText();
		Assert.assertEquals(home_link_test,"Flights");
	}
	@Test
	public void CheckCruiseLinkText()
	{
		new BasePage().openDemoUAT();
		String home_link_test = new HomePage().getCruiseLinkText();
		Assert.assertEquals(home_link_test,"Cruises");
	}
}
