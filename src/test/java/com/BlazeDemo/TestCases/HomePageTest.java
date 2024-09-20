package com.BlazeDemo.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.BlazeDemo.baseTest.BaseTestBlazeDemo;

public class HomePageTest extends BaseTestBlazeDemo
{ 
  @Test(priority = 1)
  public void validateSelectFrom() 
  {
	 hp.selectFrom();
  }
  
  @Test(priority = 2)
  public void validateSelectTo() 
  {
	 hp.selectTo();
  }
  
  @Test(priority = 3)
  public void validateSubmit() 
  {
	 hp.doSubmit();
  }
  
}
