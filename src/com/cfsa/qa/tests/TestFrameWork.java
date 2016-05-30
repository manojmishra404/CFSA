package com.cfsa.qa.tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.cfsa.qa.utils.FileHandeling;
import com.cfsa.qa.utils.Log;

public class TestFrameWork implements ITestListener {

	protected static WebDriver driver;
	protected static InternetExplorerDriverService service;

	// public String browserName = FileHandeling.getConfigValue("browser");

	@BeforeTest
	public void openBroswer() throws Exception {
		String browserName = FileHandeling.getConfigValue("browser");
		// open broswer logics for opening broswer Firefox or chrome after
		// reading config
		if (browserName.equalsIgnoreCase("chrome")) {
			// start chrome driver instance
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			Log.InfoLog("Chrome Browser opened.");

		} else if (browserName.equalsIgnoreCase("FIREFOX")) {
			// start firefox driver instance
			FirefoxBinary binary = new FirefoxBinary(new File(
					"C:/Program Files (x86)/Mozilla Firefox/firefox.exe"));
			ProfilesIni profile = new ProfilesIni();
			FirefoxProfile ffprofile = profile.getProfile("default");

			driver = new FirefoxDriver(binary, ffprofile);
			Log.InfoLog("Firefox Browser opened.");

			/* driver= new FirefoxDriver(); */
		}

	}

	@AfterTest
	public void closeBroswer() {
		driver.quit();
		Log.InfoLog("Browser Closed");
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
