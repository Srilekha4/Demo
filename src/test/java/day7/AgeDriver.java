package day7;

import java.io.IOException;

public class AgeDriver {
	
	public static void main(String[] args) throws IOException {
		String path= "C:\\Users\\SRILEKHA RAVURI\\Selenium\\demo\\src\\test\\resources\\Load.xlsx";
		ExcelReader xl = new ExcelReader(path);
		int rowcount = xl.getRowcount("Sheet1");
		
		for(int i=1;i<rowcount;i++)
		{
			String age = xl.readXLcellvalue("Sheet1", i, 1);
			
			Double age_double = Double.valueOf(age);
			//System.out.println(age_double);
			if(age_double>17.0)
			{
				xl.writeXLcellvalue("Sheet1", i, 2, "Major");
			}
			else
			{
				xl.writeXLcellvalue("Sheet1", i, 2, "Minor");
			}
		}
		xl.SaveXLfile(path);
		System.out.println("Completed");
	}

}
