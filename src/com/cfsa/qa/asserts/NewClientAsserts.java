package com.cfsa.qa.asserts;

import org.openqa.selenium.support.PageFactory;

import com.cfsa.qa.pages.ClientPage;
import com.cfsa.qa.pages.DashboardPage;
import com.cfsa.qa.tests.TestFrameWork;

public class NewClientAsserts extends TestFrameWork {

	public void verifyClientCancelBtn() throws Exception {

		DashboardPage dp = PageFactory
				.initElements(driver, DashboardPage.class);
		dp.clickOnClientButton();

		Thread.sleep(5000);

		ClientPage clientPage = PageFactory.initElements(driver,
				ClientPage.class);
		clientPage.sendkeys();

		// clientPage.selectIndustry("Consumer & Industrial Products");
		// Thread.sleep(5000);
		// clientPage.selectSector("Aerospace & Defense");
		// Thread.sleep(5000);
		// clientPage.selectGeography("Global");
		// clientPage.sendkeysForusinessUnit("Deloitte Consulting Unit");
		// Thread.sleep(5000);
		// clientPage.clickOnCancel();
		// Thread.sleep(5000);

	}

}
