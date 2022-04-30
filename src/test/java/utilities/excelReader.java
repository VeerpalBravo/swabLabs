package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class excelReader {
	
	
	public String[][] getData(String excelpath) throws IOException {

		File src=new File(excelpath);
		//load the excel file
		FileInputStream fis=new FileInputStream(src);
		//load the workbook from the above excel file 
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		//load the sheet from above excel workbook
		XSSFSheet sheet=wb.getSheetAt(0);


		// how many total rows in my excel sheet
		int rowCount=sheet.getLastRowNum();
		System.out.println(rowCount);

		int rows = rowCount + 1;
		System.out.println(rows);

		int cellCount=sheet.getRow(0).getLastCellNum();
		System.out.println(cellCount);

		String data[][] = new String [rowCount][cellCount];

		for(int i=1; i<rowCount+1; i++) {
			Row r=sheet.getRow(i);

			for(int j=0; j<cellCount; j++) {
				System.out.println(data[i-1][j]=r.getCell(j).getStringCellValue());
			}
		}
			return data;

		}
	
	@DataProvider(name="credential")
	public String[][] passValues() throws IOException
	{
		excelReader read=new excelReader();
		return read.getData("D:\\CIAutomation2019\\automationProject\\excelData\\TestData.xlsx");
	}
	
	
	

}



