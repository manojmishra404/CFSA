package com.cfsa.qa.tests;

import com.cfsa.qa.utils.FileHandeling;

public class Login extends  TestFrameWork{
    public void toCFSA()
    {
        driver.get(FileHandeling.getConfigValue("cfsa_url"));
        driver.manage().window().maximize();
    }
    public void toCFPA()
    {
       driver.get("");
    }

}
