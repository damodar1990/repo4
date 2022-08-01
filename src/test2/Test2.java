package test2;

import org.testng.annotations.Test;

public class Test2 
{
	@Test(dependsOnMethods={"mobile_info","api_info"})
	public void get_info()
	{
		System.out.println("info1");
	}
	
	
	public void mobile_info()
	{
		System.out.println("info2");
	}
	
	@Test()
	public void api_info()
	{
		System.out.println("info3");
	}

}
