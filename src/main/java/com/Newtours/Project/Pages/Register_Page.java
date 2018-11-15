package com.Newtours.Project.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Newtours.Project.Base.BaseClass;

public class Register_Page extends BaseClass 
{
	
	public Register_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//input[@name='firstName']")
	@FindBy(name="firstNameee")
	WebElement firstName;
	
	
	@FindBy(name="lastName")
	WebElement lastName;
	
	@FindBy(name="phone")
	WebElement phone_number;
	
	@FindBy(name="userName")
	WebElement email;
	
	
	@FindBy(name="address1")
	WebElement add1;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	@FindBy(name="country")
	WebElement Country_DropDown;
	
	
	@FindBy(name="email")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	
	@FindBy(name="register")
	WebElement Btn_register;
	
	
	public  void contact_Info(String fn,String ln,String phone,String mail)
	{
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		phone.split(phone);
		email.sendKeys(mail);
		
	}
	
	public void mailInfo(String ad1,String ci,String st,String postel,String coun)
	{
		add1.sendKeys(ad1);
		city.sendKeys(ci);
		state.sendKeys(st);
		postalCode.sendKeys(postel);
		Select sel=new Select(Country_DropDown);
		sel.selectByVisibleText(coun);
		
	}
	
	public Register_Complete_Page user_Info(String un,String p,String cp)
	{
		userName.sendKeys(un);
		Password.sendKeys(p);
		confirmPassword.sendKeys(cp);
		
		return new Register_Complete_Page();
		
		
	}

}
