package com.sibibase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class ScrollDown extends AndroidBasetest{

	@Test
	public void scrolling()
	{
		androidDriver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//scroll if you know where it needs to end
//		androidDriver.findElement(AppiumBy.androidUIAutomator
//				("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));"));
		
		// Javascript scroll till the last element
		boolean canScrollMore;
		do {
		 canScrollMore = (Boolean) ((JavascriptExecutor) androidDriver).executeScript("mobile: scrollGesture", ImmutableMap.of(
		    "left", 100, "top", 100, "width", 200, "height", 200,
		    "direction", "down",
		    "percent", 3.0
		));}while(canScrollMore);
	}
}
