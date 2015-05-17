package com.cucumber.automation.web.pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cucumber.automation.utils.DriverFactory;

public class LoginPage extends DriverFactory {

	/**
	 * All locators will be mentioned here
	 * 
	 * For this example i am not using properties file for reading locators
	 */

	By SigninLink = By.linkText("Sign in");
	By marketingSection = By.className("marketing-section-signup");
	By loginSection = By.className("auth-form-body");
	By SigninButton = By.name("commit");
	By errorMessage = By.xpath("//div[@id='site-container']/div/div");

	/**
	 * All functions related to behavior will follow now
	 */
	public void ishomepageDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(SigninLink));

		driver.findElement(SigninLink).isDisplayed();
		driver.findElement(marketingSection).isDisplayed();
	}

	public void clickSigninLink() {
		driver.findElement(SigninLink).click();
	}

	public void isloginsectionDisplayed() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(loginSection));
		waitVar.until(ExpectedConditions.presenceOfElementLocated(SigninButton));
	}

	public void clickSigninButton() {
		driver.findElement(SigninButton).click();
	}

	public void verifyErrorMessage(String msg) {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(errorMessage));

		assertEquals(msg, driver.findElement(errorMessage).getText());
	}
}
