package Test_Con;

import static org.testng.Assert.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Connection.FetchData;
import com.Connection.LoadDriver;

public class Testing {

	
		LoadDriver driver = new LoadDriver();
		FetchData fetching = new FetchData();
		Connection con;

		@BeforeSuite
		public void testLoadDriver() throws SQLException {
			con = driver.lodingDriver();
			Assert.assertNotNull(con, "Connection Failed");
			System.out.println("Connection Established");
			System.out.println("Connection Test Case Passed");
		}

		@BeforeMethod
		public void printMessage() {
			System.out.println("****TestMethod****");
		}

		@Test
		public void testFetch() throws SQLException {

			Object ob_ac=fetching.fetch();
			Object ob_ex="5 MATTS SR. PROGRAMMER IT 15350.0";
			assertEquals(ob_ac, ob_ex, "Test failed");
			System.out.println(ob_ex);
			System.out.println("Fetch Test Case Passed");
		}
		@AfterMethod
		public void Message() throws SQLException {

			System.out.println("****Testing Done****");
		}
	}

