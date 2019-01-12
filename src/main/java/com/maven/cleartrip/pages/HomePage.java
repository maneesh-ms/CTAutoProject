package com.maven.cleartrip.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.maven.cleartrip.framework.BasePage;

public class HomePage extends BasePage {

	public HomePage()
	{
		super();
	}

	String home_link = "//a[@href='mercurywelcome.php']";
	String flights_link="//a[@href='mercuryreservation.php']";
	String cruise_link="//a[@href='mercurycruise.php']";

	public String getHomeLinkText() {
		return getElement(home_link).getAttribute("innertext");
	}

	public String getFlightsLinkText() {
		return getElement(flights_link).getAttribute("innertext");
	}

	public String getCruiseLinkText() {
		return getElement(cruise_link).getAttribute("innertext");
	}

}
