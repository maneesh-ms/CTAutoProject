package com.maven.cleartrip.framework;

import com.maven.cleartrip.pages.HomePage;
import com.maven.cleartrip.pages.InterfaceHomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

/**
 * Created by manems on 3/23/2019.
 */
public class UrlPlacer extends BasePage {

    public UrlPlacer(WebDriver driver){
        super(driver);
    }

    @Step("Open the Manage  App")
    public InterfaceHomePage openManageApp() {
        goToUrl("http://www.newtours.demoaut.com/");
        return createPage(HomePage.class);
    }
    @Step("Open the mobility App")
    public InterfaceHomePage OpenMobilityApp() {
        goToUrl("http://www.anotherurl.for.mobile/");
        return createPage(HomePage.class);
    }
}
