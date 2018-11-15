package com.Newtours.Project.Util;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;






import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Newtours.Project.Base.BaseClass;

public class Utilities_Project  extends BaseClass
{
	public static long PageLoadTomeoutUnits=30;
	public static long implicaitWaitTimeUnits=30;
	
	static Workbook book;
	
	
	static String ExcelFile_Path="C:\\Users\\Admin\\Desktop\\newtours_TestData.xlsx";
	
	public static Object[][] getTestData_Excel(String sheetName)
	{
		FileInputStream fis = null;
		try 
		{
			 fis= new FileInputStream(ExcelFile_Path);
		} 
		catch (Exception e) {
			System.out.println(" file ot found");
			System.out.println(e);
			
		}
		try 
		{
			 book=WorkbookFactory.create(fis);
			
		} 
		catch (InvalidFormatException e)
		{
			System.out.println(" exception ---"+e);
			
		}
		catch (IOException e) 
		{
			System.out.println("exception is--"+e);
		}
		
		Sheet sheet =book.getSheet(sheetName);
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++)
		{
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
			}
		}
		 
		
		return data;
		
	}
	
	public static void takeScreenShot() throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String currentDir=System.getProperty("user.dir");
		
		
		
		FileUtils.copyFile(srcFile, new File("C:/Users/Admin/workspace/com.Newtours.Project" +"/screenshots/"+System.currentTimeMillis()+".png"));
		
	}

}
