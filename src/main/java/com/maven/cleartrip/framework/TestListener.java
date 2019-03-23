package com.maven.cleartrip.framework;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

/**
 * Created by manems on 3/22/2019.
 */
public class TestListener implements ITestListener{
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + "STARTED");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + "PASS");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println(iTestResult.getName() + "FAIL");
        Object currentClass = iTestResult.getInstance();
        WebDriver driver = ((BaseTest) currentClass).getDriver();
        if (driver instanceof WebDriver){
            saveScreenShot(driver);
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }
    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("############ The start method #################");

        //System.out.println("The methods are " + iTestContext.getAllTestMethods());


    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Attachment(value = "Screenshot of page", type = "image/png")
    public byte[] saveScreenShot(WebDriver driver){
       return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{0}", type = "text/plain")
    public static String saveTextLog(String message){
        return message;
    }


}
