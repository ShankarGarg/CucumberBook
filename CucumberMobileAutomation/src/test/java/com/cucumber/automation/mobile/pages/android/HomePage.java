package com.cucumber.automation.mobile.pages.android;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.cucumber.automation.utils.AppiumFactory;

public class HomePage extends AppiumFactory {

	/**
	 * All locators will be mentioned here
	 * 
	 * For this example i am not using properties file for reading locators
	 */
    By homePageImage = By.id("com.xebia.eventsapp:id/home_banner_imageView");
    By agendaButton = By.id("com.xebia.eventsapp:id/home_agenda_title");
    
    By backButton = By.id("android:id/home");
	

	/**
	 * All functions related to behavior will follow now
	 */
    public void verifyHomePage(){
        waitVar.until(ExpectedConditions.presenceOfElementLocated(homePageImage));
		assertTrue(driver.findElement(homePageImage).isDisplayed());
    }
    
    public void verifyHomePageOptions(){
    	waitVar.until(ExpectedConditions.presenceOfElementLocated(homePageImage));
		waitVar.until(ExpectedConditions.elementToBeClickable(agendaButton));
		 
		assertTrue(driver.findElement(agendaButton).isDisplayed());
    }
    
    public void clickAgenda(){
    	driver.findElement(agendaButton).click();
    }
}
