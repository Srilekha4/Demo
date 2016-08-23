package day7;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {
	
	//Find the file
	//open the file
	
	//Select Sheet
	//Give row and column information
	//Read and write data
	//Save and close the file
	
	//How does Apachepoi handles excel(Hierachy)
	 //> Workbook
	//>WorkSheet
	//>Row
	//>Cell
	
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = null;
		String path= "C:\\Users\\SRILEKHA RAVURI\\Selenium\\demo\\src\\test\\resources\\Load.xlsx";
		FileInputStream fis = new FileInputStream(path);
		wb = new XSSFWorkbook(fis);
		fis.close();
		if(wb!=null)
		{
			System.out.println("XL connection successfull");
		}
		String celltext = null;
		XSSFCell cell = wb.getSheet("Sheet1").getRow(2).getCell(1);
		if(cell.getCellType()==Cell.CELL_TYPE_STRING)
		{
			celltext = cell.getStringCellValue();
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC)
		{
			if(DateUtil.isCellDateFormatted(cell))
			{
				SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
				celltext = date.format(cell.getDateCellValue());
			}
			else
			{
				double temp = cell.getNumericCellValue();
				celltext = String.valueOf(temp);
			}
			
		}
		else if(cell.getCellType()==Cell.CELL_TYPE_BOOLEAN)
		{
			boolean temp = cell.getBooleanCellValue();
			celltext = String.valueOf(temp);
		}
		System.out.println(celltext);
		
		//find the count of rows
		
		int rowcount = wb.getSheet("Sheet1").getLastRowNum();
		System.out.println(rowcount+"  - rowcount");
		
		int colcount = wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		System.out.println(colcount+"  - colcount");
		
	}

}
