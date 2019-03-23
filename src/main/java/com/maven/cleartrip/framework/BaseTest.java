package com.maven.cleartrip.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.maven.cleartrip.framework.browser.BrowserFactory;
import com.maven.cleartrip.framework.configuration.Configuration;
import com.maven.cleartrip.framework.configuration.ConfigurationFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {

    private WebDriver this_browser_driver;

    public WebDriver getDriver(){
        return this_browser_driver;
    }

    public UrlPlacer openBrowser() {
        this.this_browser_driver = new BrowserFactory(new ConfigurationFactory().getConfiguration()).getDesiredBrowser();
        return new UrlPlacer(this_browser_driver);

    }

}
