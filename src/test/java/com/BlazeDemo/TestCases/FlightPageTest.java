package com.BlazeDemo.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.BlazeDemo.baseTest.BaseTestBlazeDemo;

public class FlightPageTest extends BaseTestBlazeDemo
{
	@Test(priority = 1)
	public void validateGetFlights()
	{
		fp.getFlights();
	}

	@Test(priority = 2)
	public void validateSelectFlight()
	{
		fp.selectFlight();
	}
}
