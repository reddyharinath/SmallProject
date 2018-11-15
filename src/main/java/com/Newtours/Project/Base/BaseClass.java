package com.Newtours.Project.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.Newtours.Project.Util.EventFiringClass;
import com.Newtours.Project.Util.Utilities_Project;

public class BaseClass 
{

	public static WebDriver driver;	
	public static Properties prop;
	
	
	public static EventFiringWebDriver efwDriver;
	public static EventFiringClass efc;
	public BaseClass()
	{
		String ConfigFile_Path="C:\\Users\\Admin\\workspace\\com.Newtours.Project\\src\\main\\java\\com\\Newtours\\Project\\Config\\config.properties";
		try 
		{
			FileInputStream fis=new FileInputStream(ConfigFile_Path);
			prop=new Properties();
			try 
			{
				prop.load(fis);
			} 
			catch (IOException e) 
			{
				System.out.println(" propertoes file not loaded");
				e.printStackTrace();
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(" config file not found....");
			e.printStackTrace();
		}
			
	}
	public void initialize()
	{
		String Browser_Name=prop.getProperty("browser");
		System.out.println(" browser name is ---"+Browser_Name);
		if(Browser_Name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ZZ_Selenium_Practice\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else 
		{
			System.out.println(" can you please set broser ?");
		}
		efwDriver=new EventFiringWebDriver(driver);
		efc=new EventFiringClass();
		
		efwDriver.register(efc);
		driver=efwDriver;
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utilities_Project.PageLoadTomeoutUnits, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utilities_Project.implicaitWaitTimeUnits, TimeUnit.SECONDS);
		
	}
	
	
}
