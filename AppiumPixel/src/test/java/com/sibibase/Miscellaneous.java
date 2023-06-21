package com.sibibase;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Miscellaneous extends AndroidBasetest{

	@SuppressWarnings("deprecation")
	@Test
	public void lanscapeMode() throws InterruptedException
	{
		
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		androidDriver.startActivity(activity);
		
//		androidDriver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
//		androidDriver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
//		
		androidDriver.findElement(AppiumBy.className("android.widget.CheckBox")).click();

		//device rotation
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		
		androidDriver.rotate(landscape);
		
		Thread.sleep(3000);
		
		androidDriver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		String show = androidDriver.findElement(By.id("android:id/alertTitle")).getText();
		
		System.out.println(show);
		
		Assert.assertEquals(show, "WiFi settings","Excpected output not printed..");	
		
		
		//clip board copying
		androidDriver.setClipboardText("Hello");
		androidDriver.findElement(By.id("android:id/edit")).sendKeys(androidDriver.getClipboardText());
		androidDriver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		androidDriver.findElement(By.id("android:id/button1")).click();
		//key event in android 
		androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
		androidDriver.pressKey(new KeyEvent(AndroidKey.HOME));
	}
}
