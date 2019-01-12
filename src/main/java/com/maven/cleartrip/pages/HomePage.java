package com.maven.cleartrip.pages;

import com.maven.cleartrip.framework.AppStarter;
import com.maven.cleartrip.framework.BasePage;
import com.maven.cleartrip.framework.DemoUATDriver;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	String home_link = "//a[contains(@href,'mercurywelcome')]";
	String flights_link="//a[contains(@href,'mercuryreservation')]";
	String cruise_link="//a[contains(@href,'mercurycruise')]";

	public String getHomeLinkText() {
		return getElement(home_link).getText();
	}

	public String getFlightsLinkText() {
		return getElement(flights_link).getText();
	}

	public String getCruiseLinkText() {
		return getElement(cruise_link).getText();
	}

}
