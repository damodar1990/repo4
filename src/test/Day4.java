package test;

import org.testng.annotations.Test;

public class Day4 
{
	@Test
	public void  web_login()
	{
		System.out.println("web login");
	}
	
	@Test
	public void mobile_login()
	{
		System.out.println("mobile login");
	}
	
	@Test(groups= {"smoke"})
	public void lpgin_with_carloan()
	{
		System.out.println("car loan");
	}

}
