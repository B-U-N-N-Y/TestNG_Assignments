package ATMECS.XLSX_Test;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.TestUtility.TestUtil;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

   @DataProvider(name="Dataprovider")
   public Iterator<Object[]> logindata(){
	   ArrayList<Object[]> testData=TestUtil.getDataFromExcel();
	   return testData.iterator();
   }
   @Test(dataProvider="Dataprovider")
   public void test1(Object[] obj)
   {
	System.out.print(obj[0]+" ");
	System.out.println(obj[1]);
   }
   }

