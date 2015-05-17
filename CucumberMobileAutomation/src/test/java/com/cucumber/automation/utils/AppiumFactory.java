package com.cucumber.automation.utils;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppiumFactory {

	public static AndroidDriver driver = null;
	public static WebDriverWait waitVar = null;

	/**
	 * This function is to invoke Appium
	 * 
	 * @throws MalformedURLException
	 * @throws InterruptedException
	 */
	public void createDriver() throws MalformedURLException {

		// set up appium
		final File classpathRoot = new File(System.getProperty("user.dir"));
		final File appDir = new File(classpathRoot, "src/test/resources/apps");
		final File app = new File(appDir, "com.xebia.eventsapp_2.1.apk");

		final DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformVersion", "4.4");
		capabilities.setCapability("app", app.getAbsolutePath());

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);

		waitVar = new WebDriverWait(driver, 90);

	}

	/**
	 * This function is to close driver instance
	 */
	public void teardown() {
		driver.quit();
	}
}
