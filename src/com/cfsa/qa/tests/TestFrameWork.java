package com.cfsa.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestFrameWork implements ITestListener {

protected WebDriver webDriver;
    protected  WebDriver driver;

    @BeforeTest
    public void openBroswer(){
        //open broswer logics for opening broswer Firefox or chrome after reading config
        driver =new FirefoxDriver();
    }
    @AfterTest
    public void closeBroswer(){
        driver.quit();
    }








    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {

    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }










}
