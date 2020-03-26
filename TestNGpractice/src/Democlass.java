import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Democlass {
WebDriver driver;



	@Test
	public void startapp(){
	
	System.setProperty("webdriver.chrome.driver","D:\\jar files\\chromedriver_win32\\chromedriver.exe");

		      driver=new ChromeDriver();
		      driver.get("http://demowebshop.tricentis.com/login");
		      driver.manage().window().maximize();
		      System.out.println("start application");
	}
@Test(dependsOnMethods="startapp")	
	public void checktitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	@Test(dependsOnMethods="checktitle")
	public void loginapp()
	{
		driver.findElement(By.id("Email")).sendKeys("geethamaanvi123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("welcome@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		
		System.out.println("Login successfully");
	}
	@Test(priority=3)
	public void signoff()
	{
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		System.out.println("logout successfully");
	}
	
	
	
		

}

