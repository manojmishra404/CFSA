package com.cfsa.qa.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.cfsa.qa.asserts.NewClientAsserts;
import com.cfsa.qa.utils.Log;


public class ClientTest extends TestFrameWork{
	
    @Test
    public void testVerifyCreateNewClient() throws Exception
    {
    	
    Log.InfoLog("Test Case started");
    new Login().toCFSA();
    NewClientAsserts newclientAssertsObj=new NewClientAsserts();
    newclientAssertsObj.verifyClientCancelBtn();
    Thread.sleep(1000);
    Log.InfoLog("Test Case completed.");

    }
   // @Test
    public void testcase2()
    {
    	
    }

}
