/**
 * 
 */
package com.cfsa.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.cfsa.qa.utils.Log;

/**
 * @author mmishra
 *
 */
public class ClientPage extends Page {

	@FindBy(how = How.XPATH, using = "//input[@id='clientName']")
	// @FindBy(how = How.XPATH, using = "//input[@id='asdf']")
	WebElement newClientName;

	@FindBy(how = How.XPATH, using = "//span[text()='Select Industry']/..")
	WebElement selectIndustryDropdown;

	// @FindBy(how = How.XPATH, using = "//a[contains(text(), industryName)]")
	// WebElement selectIndustryDropdownText;

	@FindBy(how = How.XPATH, using = "//span[text()='Select Sector']/..")
	WebElement selectSectorDropdown;

	@FindBy(how = How.XPATH, using = "//span[text()= 'Select Geography']/../..")
	WebElement countrySpecificDropdown;

	@FindBy(how = How.XPATH, using = "//textarea[@id='businessUnit']")
	WebElement businessUnit;

	@FindBy(how = How.XPATH, using = "//button[@class='btn process-btn']/span")
	WebElement saveClientInfoBtn;

	@FindBy(how = How.XPATH, using = "//button[@class='btn-link']")
	WebElement cancelBtn;

	@FindBy(how = How.XPATH, using = "//select[@class = 'form-control multi-select ng-pristine ng-untouched ng-invalid ng-invalid-required']")
	WebElement countrySpecific;

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

	public void selectMultipleValues(String[] values) throws Exception {
		try {
			Select select = new Select(countrySpecific);
			for (String str : values) {
				Actions builder = new Actions(driver);
				builder.keyDown(Keys.CONTROL)
						.click(driver.findElement(By
								.xpath("//option[contains(text(), '" + str
										+ "' )]"))).keyUp(Keys.CONTROL);

				builder.build().perform();

				// select.selectByVisibleText(str);
				// countrySpecific.sendKeys(Keys.CONTROL);

			}
		} catch (Exception e) {
			Log.errorLog("country specific multi-select element not found: ", e);
			throw new Exception(
					"exception while selecting values from multiselect");
		}
	}// end of selectMultipleValues

	public void enterClientName() {
		try {
			newClientName.sendKeys("Deloitte");
		} catch (Exception e) {
			Log.errorLog("ClintName textbox element not found: ", e);
		}
	}

	public void selectIndustry(String industryName) throws Exception {
		try {
			selectIndustryDropdown.click();
			driver.findElement(
					By.xpath("//a[contains(text(),'" + industryName + "')]"))
					.click();

			// driver.findElement(
			// By.xpath("//a[contains(text(),'" + industryName + "]"))
			// .click();
		} catch (Exception e) {
			Log.errorLog("Industry dropdown element not found: ", e);
			throw new Exception("exception while selecting industry :"
					+ industryName);
		}
	}

	public void selectSector(String sectorValue) throws Exception {
		try {
			selectSectorDropdown.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//a[contains(text(),'" + sectorValue + "')]"))
					.click();
		} catch (Exception e) {
			Log.errorLog("Sector dropdown element not found: ", e);
			throw new Exception("exception while selecting sector :"
					+ sectorValue);
		}
	}

	public void selectGeography(String geographyValue) throws Exception {
		try {
			countrySpecificDropdown.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("//a[contains(text(),'" + geographyValue + "')]"))
					.click();

		} catch (Exception e) {
			Log.errorLog("Geography dropdown element not found: ", e);
			throw new Exception("exception while selecting geography :"
					+ geographyValue);
		}

	}

	public void enterBusinessUnit(String businessUnitText) {
		businessUnit.sendKeys(businessUnitText);
	}

	public void clickOnCancel() throws Exception {
		try {
			cancelBtn.click();
		} catch (Exception e) {
			Log.errorLog("Cancel button not found: ", e);
			throw new Exception("exception while clicking cancel button");
		}
	}

	public void clickOnSaveClientInfo() throws Exception {
		try {
			//if(checkStatusOfSaveClientInfo() == true)
			saveClientInfoBtn.click();
		} catch (Exception e) {
			Log.errorLog("SaveClientInfo button not found: ", e);
			throw new Exception(
					"exception while clicking SaveClientInfo button");
		}
	}

	public boolean isEnabledSaveClientInfoBtn(WebElement element) {
		if (element.isEnabled())
			return true;
		else
			return false;

	}
	
//	public boolean checkStatusOfSaveClientInfo() {
//
//		String status = saveClientInfoBtn.getAttribute("disabled");
//		if(status.equals("disabled"))
//			return false;
//		else return true;
//		
//	}

}// end of class

