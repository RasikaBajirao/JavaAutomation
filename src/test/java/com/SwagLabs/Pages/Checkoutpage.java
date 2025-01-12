package com.SwagLabs.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.baseTest.BaseTest;

public class Checkoutpage extends BaseTest
{
	public Checkoutpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;	
	
	@FindBy(id="postal-code")
	WebElement zcode;
	
	@FindBy(id="continue")
	WebElement conbtn;
	
	//action methods
	
	
	public OverViewPage doContinue(String fn,String ln,String zc)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		zcode.sendKeys(zc);
		conbtn.click();
		return new OverViewPage();
		
	}
	
	

}
