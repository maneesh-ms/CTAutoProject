package com.maven.cleartrip.framework;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.maven.cleartrip.framework.BaseTest;

public class AppStarter {

	protected WebDriver driver = null;

	public AppStarter() {
		System.out.println("Starting the test in default chrome..");
		String chrome_driver_location = this.getClass().getClassLoader().getResource("browser_drivers/chromedriver.exe").getPath();
		System.setProperty("webdriver.chrome.driver", chrome_driver_location);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void openDemoUAT() {
		driver.get("http://www.newtours.demoaut.com/");
	}

	//Method that closes browser
	public void closeDemoUAT() {
		driver.quit();
	}
}
