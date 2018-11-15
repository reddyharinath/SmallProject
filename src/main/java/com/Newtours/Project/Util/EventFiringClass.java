package com.Newtours.Project.Util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.Newtours.Project.Base.BaseClass;

public class EventFiringClass extends BaseClass implements WebDriverEventListener
{
	public EventFiringClass()
	{
		PageFactory.initElements(driver, this);
	}

	
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println(" will click the "+element.toString() );
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println(" clicked the "+element.toString() );
		
	}
	@Override
	public void beforeAlertAccept(WebDriver driver)
	{
		System.out.println(" alaert not accepted");
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		System.out.println(" alaert accepted");
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		System.out.println(" alaert dismissed");
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println(" alaert not dismissed");
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("will novaigate to --"+ url);
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigation done to --"+ url);
		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("will novaigate bsck to --");
		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println(" novaigated back ");
		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("will novaigate to forward --");
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println(" novaigated to forward --");
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("will refresh --");
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("refreshed --");
		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println(" will find the "+ by.toString() );
		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("  found the "+by.toString() );
		
	}

	
	

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver,
			CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver,
			CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("  exception occured-----");
		try 
		{
			Utilities_Project.takeScreenShot();
		} catch (IOException e)
		{
			System.out.println(" tatkig screen shot issue");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}

}
