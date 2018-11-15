package com.Newtours.Project.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Newtours.Project.Base.BaseClass;
import com.Newtours.Project.Pages.Register_Complete_Page;
import com.Newtours.Project.Pages.Register_Page;
import com.Newtours.Project.Pages.Welcome_Page;
import com.Newtours.Project.Util.Utilities_Project;

public class Register_Test extends BaseClass
{
	public static Welcome_Page wp;
	public static Register_Page rp;
	public static Register_Complete_Page rcp;
	
	
	public Register_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialize();
		wp=new Welcome_Page();
		wp.click_RegisterLink();
		rp=new Register_Page();
	}
	
	
	@DataProvider(name="contactInfo")
	public Object[][] getTestData()
	{
		Object data[][]=Utilities_Project.getTestData_Excel("UserData");
		return data;
		
	}
	@Test(dataProvider="getTestData")
	public void register_Info_user(String first,String last,String pho,String mai,String address,
			String cityy,String sttate,String postell,String countrry,String uname,String pass,String confirmp)
	{	
		rp.contact_Info(first, last, pho, mai);
		rp.mailInfo(address, cityy, sttate, postell, countrry);
		rcp=rp.user_Info(uname, pass, confirmp);
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
