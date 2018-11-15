package com.Newtours.Project.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Newtours.Project.Base.BaseClass;
import com.Newtours.Project.Pages.Register_Page;
import com.Newtours.Project.Pages.Welcome_Page;

public class Welcome_Test extends BaseClass {
	public static Register_Page rp;
	public static Welcome_Page wp;
	
	
	public Welcome_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
		
	}
	@Test
	public void click_RegisterLink_welcomePage()
	{
		wp=new Welcome_Page();
		rp=wp.click_RegisterLink();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
