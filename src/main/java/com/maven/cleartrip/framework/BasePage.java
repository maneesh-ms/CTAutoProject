package com.maven.cleartrip.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.lang.reflect.Constructor;

/**
 * Created by manems on 1/12/2019.
 */
public class BasePage {

    WebDriver this_browser_driver;
    public BasePage(WebDriver driver){
        this.this_browser_driver = driver;
    }
    //method to replace use of findElement

    public void goToUrl(String url){
        this_browser_driver.get(url);
    }

    public WebElement getElement(String locator)
    {
        return this_browser_driver.findElement(By.xpath(locator));
    }


    public <T> T createPage(Class<T> pageClass){
        T newPageObject = null;
        try {

            Constructor<T> cons = pageClass.getConstructor(WebDriver.class);
            newPageObject = cons.newInstance(this_browser_driver);

        } catch (Exception e) {
            System.out.println("Unable to create the new class");
        }

        return  newPageObject;

    }

    /*
    public <T> T createPage(Class<T> pageInterface){
        T newPageObject = null;
        try {

            String interfaceName = pageInterface.getName();
            String coreName = interfaceName.replace("Interface","");
            new Reflections(pageInterface.getPackage().toString()).getSubTypesOf(pageInterface);
            Constructor<T> cons = pageInterface
                    .getConstructor(WebDriver.class);
            newPageObject = cons.newInstance(this_browser_driver);

        } catch (Exception e) {
            System.out.println("Unable to create the new class");
        }

        return  newPageObject;

    }
       */

}
