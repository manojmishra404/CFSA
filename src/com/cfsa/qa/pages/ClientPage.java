/**
 * 
 */
package com.cfsa.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * @author mmishra
 *
 */
public class ClientPage extends Page {

	@FindBy(how = How.XPATH, using = "//span[@class='pull-right new-client-action']")
	WebElement NewClientBtn;

	@FindBy(how = How.XPATH, using = "//input[@id='clientName']")
	WebElement NewClientName;

	@FindBy(how = How.XPATH, using = "//span[text()='Select Industry']/../..")
	WebElement SelectIndustryDropdown;

	@FindBy(how = How.XPATH, using = "//span[text()= 'Select Geography']/../..")
	WebElement CountrySpecificDropdown;

	@FindBy(how = How.XPATH, using = "//textarea[@id='businessUnit']")
	WebElement BusinessUnit;

	@FindBy(how = How.XPATH, using = "//button[@class='btn process-btn']")
	WebElement SaveClientInfoBtn;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-link']")
	WebElement CancelBtn;

	@FindBy(how = How.XPATH, using = "//select[@class = 'form-control multi-select ng-pristine ng-untouched ng-invalid ng-invalid-required']")
	WebElement CountrySpecific;

	public ClientPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void waitForPageToLoad() {
		// TODO Auto-generated method stub
		wait.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return null != (NewClientBtn);
			}
		});
	}// end of waitForPageToLoad method

	public void selectMultipleValues(String[] values) {

	}

}// end of class
