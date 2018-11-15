package com.Newtours.Project.Pages;

import org.openqa.selenium.support.PageFactory;

import com.Newtours.Project.Base.BaseClass;

public class Home_Page extends BaseClass{
	
	public Home_Page()
	{
		PageFactory.initElements(driver, this);
	}

}
