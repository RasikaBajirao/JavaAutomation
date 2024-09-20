package com.BlazeDemo.baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.BlazeDemo.Pages.FlightPage;
import com.BlazeDemo.Pages.HomePage;

public class BaseTestBlazeDemo 
{
	public static WebDriver driver;
	public HomePage hp;
	public FlightPage fp;
	
	@BeforeTest
	public void setUp()
	{
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		
		hp = new HomePage(driver);
		fp = new FlightPage(driver);
		
		
	}

}
