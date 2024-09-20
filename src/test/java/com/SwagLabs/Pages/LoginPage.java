package com.SwagLabs.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	WebDriver driver;
	//constructor
	public LoginPage(WebDriver driver)  //from base class
	{
		this.driver = driver;
		//initialize
		PageFactory.initElements(driver, this);
		
	}
	
	//Locators
	@FindBy(id = "user-name")
	WebElement username;
	
	@FindBy(id = "password")
	WebElement password ;
	
	@FindBy(id = "login-button")
	WebElement loginbtn;
	
	
	//Action methods
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	 
	public InventoryPage doLogin(String un, String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		loginbtn.click();
		
		//after Login we will go to inventory page
		return new InventoryPage(driver);
	}

}
