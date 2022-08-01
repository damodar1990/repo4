package test3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass 
{
	@Parameters({"uname","ucity","upassword","uaddress"})
	@Test
	public void get_parameters(String name,String city,String password,String address)
	{ 
		System.out.println("collected parameter is :"+name+ "  " +city+ "  " +password+ "  " +address);
		
	}

}
