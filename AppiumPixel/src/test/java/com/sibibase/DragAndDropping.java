package com.sibibase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragAndDropping extends AndroidBasetest{

	@Test
	public void swipeAction()
	{
		androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
		//Drag and Drop
		androidDriver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		//source = io.appium.android.apis:id/drag_dot_1
		
		WebElement source = androidDriver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		
		//drag gesture
		// Java
		((JavascriptExecutor) androidDriver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) source).getId(),
		    "endX", 836,
		    "endY", 729
		));
		
		
		String result = androidDriver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();

		Assert.assertEquals(result, "Dropped!");
		
	}	

}
