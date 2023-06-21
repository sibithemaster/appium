package com.sibibase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class Swipe extends AndroidBasetest{

	@Test
	public void swipeAction()
	{
		androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
		androidDriver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		androidDriver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement image=androidDriver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		
		Assert.assertEquals(androidDriver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		
		// Java
		swiping(image, "left");
		
		Assert.assertEquals(androidDriver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");
		
		
	}
}
