package com.XLS_Reader;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	static String path="C:\\Users\\ARJUN.SANTRA\\Desktop\\Book.xlsx";
	static ArrayList<Object []> data=new ArrayList<Object[]>();
	

	public static void main(String[] args) {
		Iterator<Object[]> iterator;
		Reader reader=new Reader(path);
		for(int rowNum=2;rowNum<=reader.getRowCount("Sheet1");rowNum++)
		{
			String username=reader.getCellData("Sheet1", 0, rowNum);
			String password=reader.getCellData("Sheet1", 1, rowNum);
			Object[] obj= {username,password};
			data.add(obj);
		}
		iterator=data.iterator();
		while(iterator.hasNext())
		{
			Object[] dataArray=iterator.next();
			for(Object data:dataArray)
			{
				System.out.print(data+" ");
			}
			System.out.println();
		}
		


	}

}
