package com.cfsa.qa.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.cfsa.qa.utils.Log;


public class Test1 extends TestFrameWork{
	

    @Test
    public void testcase1()
    {
    Log.InfoLog("Test Case started");
    new Login().toCFSA();


    }
    @Test
    public void testcase2()
    {
    	
    }

}
