package com.maven.cleartrip.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
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
import java.util.Properties;

public class AppStarter {

	protected WebDriver driver = null;


	public AppStarter() {
		Properties properties = new Properties();
		File file = new File(getClass().getClassLoader().getResource("config/config.properties").getFile());
		FileInputStream fileInput = null;

		try {fileInput = new FileInputStream(file);}
		catch (FileNotFoundException e) {e.printStackTrace();}

		//load properties file
		try {properties.load(fileInput);}
		catch (IOException e) {e.printStackTrace();}

		String chrome_driver_location = this.getClass().getClassLoader().getResource("browser_drivers/chromedriver.exe").getPath();
		if (properties.getProperty("browser").equals("firefox")){
			System.out.println("Starting the test in firefox.");
			driver = new FirefoxDriver();
		}
		else if(properties.getProperty("browser").equals("chrome")) {
			System.out.println("Starting the test in chrome.");
			System.setProperty("webdriver.chrome.driver", chrome_driver_location);
			driver = new ChromeDriver();
		}
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
