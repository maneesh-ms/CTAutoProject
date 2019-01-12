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

public class BasePage {

	protected WebDriver driver = null;   
	
	public BasePage()
	{ 
		System.out.println("Starting the test in default firefox..");
			System.setProperty("webdriver.chrome.driver", getClass().getResource("com\\chromedriver.exe").getPath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();

	}
	public void openDemoUAT() {
		
		driver.get("http://www.newtours.demoaut.com/");
	}
	//Method that closes browser
	public void closeDemoUAT() {

		driver.quit();
	}
	
	//method to replace use of findElement
	public WebElement getElement(String locator)
	{
		return driver.findElement(By.xpath(locator));
	}
}
