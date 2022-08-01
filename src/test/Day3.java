package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 
{
	@Test
	public void  web_login()
	{
		System.out.println("web login");
	}
	
	@Test(groups= {"smoke"})
	public void mobile_login()
	{
		System.out.println("mobile login");
	}
	
	@Test
	public void wlpgin_with_carloan()
	{
		System.out.println("car loan");
	}

}
