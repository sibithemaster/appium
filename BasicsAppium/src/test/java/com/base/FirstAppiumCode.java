package com.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class FirstAppiumCode {

	@Test
	public void localDevice() throws MalformedURLException
	{
		
		//UIAutomator
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("android");
		options.setDeviceName("Pixel 2");
		options.setApp("C:\\Users\\Gowtham\\git\\appium\\BasicsAppium\\src\\test\\java\\sample\\ApiDemos-debug.apk");
		//Android driver setup 
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	}
	public void add() {
		System.out.println("hello");
		
	}
}
