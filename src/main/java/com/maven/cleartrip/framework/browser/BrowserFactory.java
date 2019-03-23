package com.maven.cleartrip.framework.browser;

import com.maven.cleartrip.framework.configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by manems on 3/23/2019.
 */
public class BrowserFactory {

    private WebDriver desiredBbrowser;

    public BrowserFactory(Configuration config){
        if (config.getBrowser().equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",config.getChromDriverPath());
            desiredBbrowser = new ChromeDriver();
        }
        else if (config.getBrowser().equals("firefox")) {
            System.setProperty("webdriver.firefox.marionette", config.getFirefoxDriverPath());
            desiredBbrowser = new FirefoxDriver();
        }
    }

    public WebDriver getDesiredBrowser() {
        return desiredBbrowser;
    }
}
