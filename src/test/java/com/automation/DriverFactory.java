package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 Driver Class to get driver according to browser
 */
public class DriverFactory {

	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	public static int waitTime = 10;

	public static String browser = "firefox";
	//public static String baseURL = "http://xebia.in/";
	public static String baseURL = "http://newtours.demoaut.com/";
	public static Platform currentOS = Platform.getCurrent();

	public String testName;
	public String ClassName = null;
	public String NewFileNamePath = null;

	protected static void getDriverInstance() {
		// so that multiple windows are not opened
		if (driver == null) {
			createDriver();
		}

	}

	public static void createDriver() {

		System.out.println("Browser= " + browser);
		System.out.println("Platform= " + currentOS);
		System.out.println("URL= " + baseURL);

		createDriver(browser);
		OpenURL(baseURL);
	}

	public static void createDriver(final String browserId) {
		if (browserId.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} 
	}

	public static void OpenURL(String baseURL) {
		driver.manage().window().maximize();

		driver.get(baseURL);

		waitVar = new WebDriverWait(driver, waitTime);
		driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
	}

	public void tearDown() {
		if (!(driver == null)) {
			driver.quit();
			driver = null;
		}
	}
	
	public byte[] returnscreenShot()
	{
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

}
