import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotationsdemo {

	@BeforeSuite
	public void setProperty(){
		System.out.println("Set the Property");

	}
	@BeforeTest
	public void checkURL(){
		System.out.println("Check URL");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("URL Launched");
	}
	@BeforeMethod
	public void getTitles()
	{
		System.out.println("Fetch title");
	}
	@Test
	public void verifyURL(){
		System.out.println("URL Verified");
	}
	@AfterMethod
	public void checklogin()
	{
		System.out.println("Logged in successfully");
		
	}
	@AfterClass
	public void logout()
	{
		System.out.println("logged out successfully");
	}
	@AfterTest
	public void checkpage()
	{
		System.out.println("correct page");
	}

}
