package com.maven.cleartrip.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by manems on 1/12/2019.
 */
public class BasePage {

    WebDriver this_browser_driver;
    public BasePage(WebDriver driver){
        this.this_browser_driver = driver;
    }
    //method to replace use of findElement
    public WebElement getElement(String locator)
    {
        return this_browser_driver.findElement(By.xpath(locator));
    }

}
