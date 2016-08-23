package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb=null;
		String path="C:\\Users\\SRILEKHA RAVURI\\Selenium\\demo\\src\\test\\resources\\Load.xlsx";
		FileInputStream fis = new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		XSSFSheet s=wb.getSheet("Sheet1");
		fis.close();
		if(wb!=null){
			System.out.println("XL Connection successful");
		Iterator<Row> rowIt=s.iterator();
		rowIt.next();
		while(rowIt.hasNext()){
			//System.out.println(rowIt.next().getCell(0).getStringCellValue());
			System.out.println(rowIt.next().getCell(1).getNumericCellValue());
		}
		}
		
		wait.until(ExpectedConditions.Visibilityof)
		
		
	}

}
