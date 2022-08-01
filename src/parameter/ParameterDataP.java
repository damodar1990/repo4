package parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterDataP {
	@Test(dataProvider="get_data")
	public void get_info_user(String userName,String password) {
		System.out.println(userName);
		System.out.println(password);

	}

	@Test(enabled=false)
	public void get_info_user1() {
		System.out.println("user 1 info");
	}

	@DataProvider
	public Object[][] get_data() 
	{
		Object data[][]=new Object[3][2];
		data[0][0]="username1";
		data[0][1]="password1";
		
		data[1][0]="username2";
		data[1][1]="password2";
		
		data[2][0]="username3";
		data[2][1]="password3"
				+ ""; 
		
		return data;

	}
}
