/**
 * 
 */
package com.cfsa.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author mmishra
 *
 */
public class DashboardPage extends Page {
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	@CacheLookup
	@FindBy(how = How.XPATH, using = "//span[@class='pull-right new-client-action']/i")
	WebElement NewClientBtn;
	
	
	
	
	public void clickOnClientButton() {
		NewClientBtn.click();

	}// end of method

	@Override
	public void waitForPageToLoad() {
		// TODO Auto-generated method stub
		
	}
	
	public boolean clientNameIsDisplayed(String clientName)
	{
		return isDisplayed(driver.findElement(By.xpath("//span[text()='"+clientName+"' and @class='card-title ng-binding']")));
		
	}

}
