package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day5 
{
	@Test
	public void testcase0()
	{
		System.out.println("1st");
	}
	
	@Test
	public void mobile_testcase1()
	{
		System.out.println("mobile testcase1 data");
	}
	
	@Test(groups= {"smoke"})
	public void mobile_testcase2()
	{
		System.out.println("mobile testcase2 data");
	}
	
	@Test
	public void mobile_testcase3()
	{
		System.out.println("last");
	}

}
