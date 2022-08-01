package test;

import org.testng.annotations.Test;

public class Day1 
{
	@Test(groups={"Smoke"})
	public void demo1()
	{
		System.out.println("hello");
	}
	@Test
	public void demo2()
	{
		System.out.println("good morning");
	}
	@Test
	public void demo3()
	{
		System.out.println("good afternoon");
	}

}
