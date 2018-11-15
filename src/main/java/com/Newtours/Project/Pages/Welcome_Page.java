package com.Newtours.Project.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Newtours.Project.Base.BaseClass;

public class Welcome_Page extends BaseClass {
	
	public Welcome_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="REGISTER")
	WebElement Register_Link;
	
	public Register_Page click_RegisterLink()
	{
		Register_Link.click();
		return new Register_Page();
		
	}
	

}
