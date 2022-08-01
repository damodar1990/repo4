package parameter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Global {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Shubha\\eclipse-workspace2\\TestNGTutorial\\src\\parameter\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Shubha\\eclipse-workspace2\\TestNGTutorial\\src\\parameter\\data.properties");
		prop.store(fos, null);
	String name=prop.getProperty("name");
	System.out.println(name);
		

	}
}
