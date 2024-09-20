package com.BlazeDemo.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPage 
{
	WebDriver driver;
	
	//constructor
	public FlightPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy (xpath = "//input[@type='submit']")
	List<WebElement> allFlights;
	
	@FindBy (xpath = "(//input[@type='submit'])[4]")
	WebElement flight;
	
	//action Methods
	public void getFlights()
	{
		for(WebElement i : allFlights)
		{
			System.out.println(i.getText());
		}
	}
	
	public void selectFlight()
	{
		flight.click();
	}

}
