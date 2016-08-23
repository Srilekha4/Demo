package day5;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Getpropertyfile {
	
	public static String getfileinfo(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Inheritance.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		//System.out.println(value);
		return value;
		
	}
	public static void main(String[] args) throws IOException {
		getfileinfo(null);
	}
	
	

}
