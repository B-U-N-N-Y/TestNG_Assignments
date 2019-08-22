package com.TestUtility;

import java.util.ArrayList;

import com.XLS_Reader.Reader;

public class TestUtil {
	
 static Reader reader;
 
	public static ArrayList<Object[]> getDataFromExcel(){
		ArrayList<Object[]> data=new ArrayList<Object[]>();
		try {
			reader=new Reader("C:\\Users\\ARJUN.SANTRA\\Desktop\\Book.xlsx");
			
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		for(int rowNum=2;rowNum<=reader.getRowCount("Sheet1");rowNum++)
		{
			String username=reader.getCellData("Sheet1", 0, rowNum);
			String password=reader.getCellData("Sheet1", 1, rowNum);
			Object[] obj= {username,password};
			data.add(obj);

		}
		return data;
	}
}
