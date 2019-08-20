package Test.Cal.Method;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Calculator.Operation;
import junit.framework.Assert;

public class NewTest {
	double first_input = 17;
	double second_input = 8;
	Operation op = new Operation(first_input, second_input);

	@BeforeSuite
	public void makeObjects() {

		System.out.println("Testing Start");

	}

	@Test(priority = 0)
	public void add() {
		String application = "+";
		double result = op.operation(application);
		Assert.assertEquals("Test Failed", 25.0, result);
	}

	@BeforeMethod
	public void testMethod() {
		System.out.println("**********Testing Methods**********");
	}

	@Test
	public void sub() {
		String application = "-";
		double result = op.operation(application);
		Assert.assertEquals("Test Failed", 9.0, result);
	}

	@Test(priority = 1)
	public void mul() {
		String application = "*";
		double result = op.operation(application);
		Assert.assertEquals("Test Failed", 136.0, result);
	}

	@Test(priority = 2)
	public void div() {
		String application = "/";
		double result = op.operation(application);
		Assert.assertEquals("Test Failed", 2.125, result);
	}

	@AfterSuite
	public void Results() {
		System.out.println("Results");
	}

}
