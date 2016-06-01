/**
 * 
 */
package com.cfsa.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

/**
 * @author mmishra
 *
 */
public class ClientPage extends Page {

	;
	@FindBy(how = How.XPATH, using = "//input[@id='clientName']")
	// @FindBy(how = How.XPATH, using = "//input[@id='asdf']")
	WebElement NewClientName;

	@FindBy(how = How.XPATH, using = "//span[text()='Select Industry']/..")
	WebElement SelectIndustryDropdown;

	@FindBy(how = How.XPATH, using = "//span[text()='Select Sector']/..")
	WebElement SelectSectorDropdown;

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
				return null != (driver.findElement(By
						.xpath("//input[@id='clientName']")));
			}
		});
	}// end of waitForPageToLoad method

	public void selectMultipleValues(String[] values) {
		Select select = new Select(CountrySpecific);
		for (String str : values) {
			select.selectByVisibleText(str);

		}
	}// end of selectMultipleValues

	public void sendkeys() {

		NewClientName.sendKeys("Deloitte");
	}

	// public void selectIndustry(String industry){
	// Select dropdown = new Select(SelectIndustryDropdown);
	//
	// dropdown.selectByVisibleText(industry);
	// }
	//
	// public void selectSector(String sector){
	// Select dropdown = new Select(SelectSectorDropdown);
	//
	// dropdown.selectByVisibleText(sector);
	// }
	//
	// public void selectGeography(String geography){
	// Select dropdown = new Select(CountrySpecificDropdown);
	//
	// dropdown.selectByVisibleText(geography);
	// }
	//
	//
	// public void sendkeysForusinessUnit(String businessUnit){
	// Select dropdown = new Select(BusinessUnit);
	//
	// dropdown.selectByVisibleText(businessUnit);
	// }
	// public void clickOnCancel(){
	//
	// CancelBtn.click();
	//
	// }

}// end of class

