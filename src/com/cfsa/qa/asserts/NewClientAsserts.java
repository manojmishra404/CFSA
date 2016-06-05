package com.cfsa.qa.asserts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.cfsa.qa.pages.ClientPage;
import com.cfsa.qa.pages.DashboardPage;
import com.cfsa.qa.tests.TestFrameWork;
import com.cfsa.qa.utils.Log;

public class NewClientAsserts extends TestFrameWork {

	public void verifyClientCancelBtn() throws Exception {

		DashboardPage dp = PageFactory
				.initElements(driver, DashboardPage.class);
		dp.clickOnClientButton();

		Thread.sleep(5000);

		ClientPage clientPage = PageFactory.initElements(driver,
				ClientPage.class);
		clientPage.enterClientName();
		clientPage.selectIndustry("Consumer & Industrial Products");
		clientPage.selectSector("Aerospace & Defense");
		clientPage.selectGeography("Global");
		clientPage.enterBusinessUnit("Deloitte Consulting Unit");
		clientPage.clickOnCancel();
		dp = PageFactory.initElements(driver, DashboardPage.class);
		Assert.assertTrue(dp.clientNameIsDisplayed("Deloitte"));

	}

	public void verifyCreationOfNewClient() throws Exception {
		// try{
		DashboardPage dp = PageFactory
				.initElements(driver, DashboardPage.class);
		dp.clickOnClientButton();

		Thread.sleep(5000);

		ClientPage clientPage = PageFactory.initElements(driver,
				ClientPage.class);
		clientPage.enterClientName();
		clientPage.selectIndustry("Consumer & Industrial Products");
		Thread.sleep(5000);
		clientPage.selectSector("Aerospace & Defense");
		//clientPage.selectGeography("Global");
		 clientPage.selectGeography("Country Specific");
		 clientPage.selectMultipleValues(new
		 String[]{"Afghanistan","Aland Islands"});
		clientPage.enterBusinessUnit("Deloitte Consulting Unit");
		Thread.sleep(5000);
		clientPage.clickOnSaveClientInfo();
		Thread.sleep(5000);
		dp = PageFactory.initElements(driver, DashboardPage.class);
		Assert.assertTrue(dp.clientNameIsDisplayed("Deloitte"));

		// }catch(Exception e){
		// Log.errorLog(null, e);
		// }

	}

}
