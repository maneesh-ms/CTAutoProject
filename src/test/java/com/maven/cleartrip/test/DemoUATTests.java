package com.maven.cleartrip.test;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.maven.cleartrip.framework.BaseTest;

public class DemoUATTests extends BaseTest{

	@Severity(SeverityLevel.NORMAL)
	@Link("https://example.org")
	@Test(priority = 0, description="Verify the Home page link")
	public void CheckHomeLinkText()
	{
		String home_link_text = this
				.openBrowser()
				.openManageApp()
				.getHomeLinkText();
		Assert.assertEquals(home_link_text,"Home");

	}

	@Severity(SeverityLevel.NORMAL)
	@Link("https://example.org")
	@Test(priority = 0, description="Verify the Flight page link")
	public void CheckFlightLinkText()
	{
		String flight_link_text = this
				.openBrowser()
				.openManageApp()
				.getFlightsLinkText();
		Assert.assertEquals(flight_link_text,"Flights");
	}

	@Severity(SeverityLevel.NORMAL)
	@Link("https://example.org")
	@Test(priority = 0, description="Verify the Cruise page link")
	public void CheckCruiseLinkText()
	{
		String cruise_link_text = this
				.openBrowser()
				.openManageApp()
				.getFlightsLinkText();
		Assert.assertEquals(cruise_link_text,"Cruises");
	}

}
