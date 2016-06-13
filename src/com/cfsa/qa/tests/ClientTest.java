package com.cfsa.qa.tests;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.cfsa.qa.asserts.NewClientAsserts;
import com.cfsa.qa.utils.Log;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ClientTest extends TestFrameWork {

	@Test
	public void testVerifyCreateNewClient() throws Exception {

		System.out.println("<---------testVerifyCreateNewClient----------->");
		Log.InfoLog("testVerifyCreateNewClient started");
		new Login().toCFSA();
		NewClientAsserts newclientAssertsObj = new NewClientAsserts();
		newclientAssertsObj.verifyCreationOfNewClient();
		Log.InfoLog("testVerifyCreateNewClient completed.");

	}

	@Test
	public void testVerifyClientCancelBtn() throws Exception {

		System.out.println("<---------testVerifyClientCancelBtn----------->");
		Log.InfoLog("testVerifyClientCancelBtn started");
		new Login().toCFSA();
		NewClientAsserts newclientAssertsObj = new NewClientAsserts();
		newclientAssertsObj.verifyClientCancelBtn();
		Log.InfoLog("testVerifyClientCancelBtn completed.");
	}

}
