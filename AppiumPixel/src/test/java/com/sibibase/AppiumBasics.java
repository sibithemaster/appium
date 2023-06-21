package com.sibibase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumBy.ByAccessibilityId;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics extends AndroidBasetest{
	
	@Test
	public void AppiumTest() throws MalformedURLException
	{
		//Appium code to Appium server to Mobile
		//Users/abdulrahuman/Library/Android/sdk
		//Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home

//to start the server automatically
//	AppiumDriverLocalService service=new AppiumServiceBuilder().
//withAppiumJS(new File("//Users//abdulrahuman//Downloads//node_modules//appium-xcuitest-driver//node_modules//@babel//generator//lib//node//index.js")).withIPAddress("https://slocalhost").usingPort(4723).build();
		
//	service.start();
//for emulator connection
			
		
		androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
//		
		androidDriver.findElement(AppiumBy.className("android.widget.CheckBox")).click();

		
		androidDriver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		String show = androidDriver.findElement(By.id("android:id/alertTitle")).getText();
		
		System.out.println(show);
		
		Assert.assertEquals(show, "WiFi settings","Excpected output not printed..");	
		
		androidDriver.findElement(By.id("android:id/edit")).sendKeys("Hello");
		
		androidDriver.findElement(By.id("android:id/button1")).click();
		
		
		//		service.start();
		
	}

}
