package com.BlazeDemo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BlazeDemo.baseTest.BaseTestBlazeDemo;
import com.SwagLabs.Pages.InventoryPage;

public class HomePage 
{
	WebDriver driver;
	
	//constructor
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locator
	@FindBy (name = "fromPort")
	WebElement fromddele;
	
	@FindBy (name = "toPort")
	WebElement toddele;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement submitbtn;
	
	// Action Methods
	public void selectFrom()
	{
		Select sc = new Select(fromddele);
		sc.selectByVisibleText("Boston");
	}
	
	public void selectTo()
	{
		Select sel = new Select(toddele);
		sel.selectByVisibleText("Dublin");
	}
	
	public FlightPage doSubmit()
	{
		submitbtn.click();
		
		//after selecting location we will go to Flight page
		return new FlightPage(driver);
	}

}
