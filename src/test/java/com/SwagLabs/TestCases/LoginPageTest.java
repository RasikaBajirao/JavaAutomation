package com.SwagLabs.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.baseTest.BaseTest;

public class LoginPageTest extends BaseTest 
{
  @Test(priority = 1)
  public void validateUrl() 
  {
	  String actUrl = driver.getCurrentUrl();
	  Assert.assertTrue(actUrl.contains("sauce"),"Url is not valid");
	  System.out.println("Url is valid");
  }
  
  @Test(priority = 2)
  public void validateTitle() 
  {
	  String actTitle = driver.getTitle();
	  Assert.assertTrue(actTitle.contains("Labs"),"Title is not valid");
	  System.out.println("Title is valid");
  }
  
  @Test(priority = 3)
  public void validateLogin() 
  {
	  lp.doLogin(prop.getData("un"),prop.getData("pwd"));
  }
}
