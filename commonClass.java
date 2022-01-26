package week5.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class commonClass extends BaseClass {

	@Test
	public void Test1() {
		System.out.println("This is Test1");	
	}
	@Test
	public void Test2() {
		System.out.println("This is Test2");	
	}
	@Test
	public void Test3() {
		System.out.println("This is Test3");	
	}
	@Test
	public void Test4() {
		System.out.println("This is Test4");	
	}
	@Test
	public void Test5() {
		System.out.println("This is Test5");
	}

	@BeforeClass	
	public void BeforeClass() {
		System.out.println("This is Test5");	
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("This is Test5");	
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This is AfterSuite");	
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("This is BeforeSuite");	
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("This is AfterSuite");	
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("This is BeforeSuite");	
	}
}



