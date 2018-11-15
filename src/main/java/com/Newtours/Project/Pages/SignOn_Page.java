package com.Newtours.Project.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Newtours.Project.Base.BaseClass;

public class SignOn_Page extends BaseClass {
	public SignOn_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
}
