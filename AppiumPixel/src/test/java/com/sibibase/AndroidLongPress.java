package com.sibibase;

import java.net.MalformedURLException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class AndroidLongPress extends AndroidBasetest
{
    @Test
	public void longPressInAndroid() throws MalformedURLException, InterruptedException
	{
	
	   androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
	   
	   androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Expandable Lists']")).click();
	   
	   androidDriver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	   
	   WebElement ele=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	  
	   longPressAction(ele);
	   
	   String sample =androidDriver.findElement(By.id("android:id/title")).getText();
      
	   Assert.assertEquals(sample, "Sample menu");
	   
	   Assert.assertEquals(androidDriver.findElement(By.id("android:id/title")).isDisplayed(),true);
 //     Thread.sleep(3000);
	   
	}
}
