package week5.testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	@BeforeMethod
	public void preCondition() {
		
		System.out.println("This is precondition");
	}
	
	
	@AfterMethod
   public void postcondition() {
		
		System.out.println("This is postcondition");
	}
}
