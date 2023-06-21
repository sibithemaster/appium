package com.sibibase;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AndroidBasetest {

	
	AndroidDriver androidDriver;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException
	{
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("SibiEmulator");
		options.setApp("//Users//abdulrahuman//eclipse-workspace//AppiumPixel//src//test//java//utils//ApiDemos-debug.apk");
		
		 androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), options);
	
		 androidDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	public void longPressAction(WebElement element)
	{
		  
		// Java
		   ((JavascriptExecutor) androidDriver).executeScript("mobile: longClickGesture", ImmutableMap.of(
		       "elementId", ((RemoteWebElement) element).getId(),
		       "duration",2000
		   ));
	}
	
	public void swiping(WebElement element,String string)
	{
		((JavascriptExecutor) androidDriver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			    "elementId",element,
			    "direction", "left",
			    "percent", 0.75
			));
	}
//	@AfterClass
//	public void tearDown()
//	{
//		androidDriver.quit();
//	}
	
}
