package com.Collabera.datadriven;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.IOException;

public class DataDrivenTesting  {
 
	@DataProvider(name="Credentials")
	public Object[][] fetchExcelData() throws IOException{
		
		int Totalrow=0;
		int Totalcol=0;
		Object[][] data=new Object[Totalrow][Totalcol];
	String path="C:\\Users\\Varun Ambrale\\Desktop\\TestData.xlsx";
	FileInputStream fil=new FileInputStream(path);
	XSSFWorkbook wb=new XSSFWorkbook(fil);
	Totalrow=wb.getSheet("Sheet1").getLastRowNum();
	System.out.println("Total rows = "+Totalrow);
	for(int i=0;i<=Totalrow;i++) {
		Totalcol=wb.getSheet("Sheet1").getRow(i).getLastCellNum();
		System.out.println("Row ["+i+"] has ["+Totalcol+"] columns");
		for(int j=0;j<Totalcol;j++) {
			String value=wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
			data[i][j]=value;
		}

	}
	wb.close();
	return data;
		}
	}
	
	
			
		
		
