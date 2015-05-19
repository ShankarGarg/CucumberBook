package com.automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 Driver Class to get driver according to browser
 */
public class DriverFactory {

	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;
	public static int waitTime = 10;

	public static String browser = "firefox";
	public static String baseURL = "https://github.com/";
	public static Platform currentOS = Platform.getCurrent();

	public String testName;
	public String ClassName = null;
	public String NewFileNamePath = null;

	public static void createDriver() throws InterruptedException {

		System.out.println("Browser= " + browser);
		System.out.println("Platform= " + currentOS);
		System.out.println("URL= " + baseURL);

		initateDriver();
		OpenURL(baseURL);
		Thread.sleep(2000);
	}

	public static void initateDriver() {
			driver = new FirefoxDriver(); 
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
