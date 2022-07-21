package annotaions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration_Page {
	
	@BeforeTest
	public void preReq()
	{
		System.out.println("Before TEst");
	}
	@Test
	public void fName()
	{
		System.out.println("Karuppu");
	}
	@Test
	public void lName()
	{
		System.out.println("Chamy");
	}
	@Test
	public void emailId()
	{
		System.out.println("Email");
	}
	@Test
	public void confirmEmail()
	{
		System.out.println("Confirm Email");
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("AFter Test completed");
	}
}
