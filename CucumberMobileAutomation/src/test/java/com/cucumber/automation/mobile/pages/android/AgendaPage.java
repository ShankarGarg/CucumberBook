package com.cucumber.automation.mobile.pages.android;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.cucumber.automation.utils.AppiumFactory;

public class AgendaPage extends AppiumFactory {

	// All the locators for Agenda page will be defined here
	By title = By.id("com.xebia.eventsapp:id/action_bar_custom_title");
	By AgendaList = By.className("android.widget.LinearLayout");

	By backButton = By.id("android:id/home");

	// All the behavior of Agenda page will be defined here in functions
	public void verifyAgendaPage() {
		waitVar.until(ExpectedConditions.presenceOfElementLocated(title));

		assertEquals("Agenda", driver.findElement(title).getText());
		assertTrue(driver.findElements(AgendaList).size() >= 0);
	}

	public void clickBack() {
		driver.findElement(backButton).click();
	}

}
