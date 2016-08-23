package day7;

import java.io.IOException;



public class XLreaderDriver {
	
	public static void main(String[] args) throws IOException {
		String path= "D:\\JavaWorkspace_2016\\April_2016_batch\\April_2016\\src\\test\\resources\\Age.xlsx";
		ExcelReader xl = new ExcelReader(path);
		System.out.println("Success");
		int rowcount = xl.getRowcount("Sheet1");
		int colcount = xl.getColcount("Sheet1");
		System.out.println(rowcount+"     "+ colcount);
		
		/*for(int i = 0;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				System.out.print(xl.readXLcellvalue("Sheet1", i, j));
				System.out.print("     ");
			}
			System.out.println();
		}*/
	
		
		
		for(int i = 1;i<rowcount;i++)
		{
			xl.writeXLcellvalue("Sheet1", i,2,"Major");
			
		}
		xl.SaveXLfile(path);
	}

}
