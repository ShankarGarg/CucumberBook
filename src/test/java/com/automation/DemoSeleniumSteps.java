package com.automation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

public class DemoSeleniumSteps extends DriverFactory {

	public void login() {

		// wait for the page to load
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("home")));
		waitVar.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		
		// enter username
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("shnakey.garg");

		// enter password
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("P@ssword");

		// click submit
		driver.findElement(By.name("login")).click();

		// wait for home page
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("findflight")));
		waitVar.until(ExpectedConditions.elementToBeClickable(By.name("findFlights")));

	}
	
	public void verifyFlightFinderPage()
	{
		assertTrue(driver.findElement(By.name("findflight")).isDisplayed());
		assertTrue(driver.findElement(By.name("findFlights")).isDisplayed());
	}
	
	public void verifySearchCriteriaPresent()
	{
		assertTrue(driver.findElement(By.name("findflight")).isDisplayed());
	}
	
	public void enterSearchData()
	{
		Select passcount = new Select(driver.findElement(By.name("passCount")));
		passcount.selectByValue("2");
	}
	
	public void clickContinue()
	{
		driver.findElement(By.name("findFlights")).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("reserveFlights")));
	}
	
	public void verifySelectFlightPage()
	{
		assertTrue(driver.findElement(By.name("reserveFlights")).isDisplayed());
	}
	
	public void selectFlight()
	{
		driver.findElement(By.name("reserveFlights")).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.name("bookflight")));
	}
	
	public void verifySummaryPage()
	{
		assertTrue(driver.findElement(By.name("bookflight")).isDisplayed());
	}
	
	public void verifyTextBox()
	{
		assertTrue(driver.findElement(By.name("passFirst0")).isDisplayed());
		assertTrue(driver.findElement(By.name("passLast0")).isDisplayed());
		assertTrue(driver.findElement(By.name("creditnumber")).isDisplayed());
	}
	
	public void enterPassengerDetails(DataTable passenger)
	{
		List<List<String>> passengerDetails = passenger.raw();
		
		driver.findElement(By.name("passFirst0")).sendKeys(passengerDetails.get(1).get(1));
		driver.findElement(By.name("passLast0")).sendKeys(passengerDetails.get(2).get(1));
		driver.findElement(By.name("creditnumber")).sendKeys(passengerDetails.get(3).get(1));
		
	}
	
	public void clickPayment()
	{
		driver.findElement(By.name("buyFlights")).click();
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@src='/images/masts/mast_confirmation.gif']")));
	}
	
	public void verifyFlightConfirmationPage()
	{
		assertTrue(driver.findElement(By.xpath("//*[@src='/images/masts/mast_confirmation.gif']")).isDisplayed());
	}
	//********************************************************************************
	public void verifyXebiaIndiaHomePage()
	{
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.className("row")));
		
		assertEquals("Welcome to Xebia India | Xebia India", driver.getTitle());
	}

	public void verfiyHeader()
	{
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@class='nav navbar-nav']")));
		assertTrue(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).isDisplayed());
	}
	
	public void mouseHover(String text) throws InterruptedException
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText(text))).build().perform();
		
		Thread.sleep(5000);
	}
	
	public void verifyLinkPresent(String text)
	{
		waitVar.until(ExpectedConditions.presenceOfElementLocated(By.linkText(text)));
		
		assertTrue(driver.findElement(By.linkText(text)).isDisplayed());
	}
	
	//**************************************************************************************
}
