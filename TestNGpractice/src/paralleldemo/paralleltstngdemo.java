package paralleldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class paralleltstngdemo {
	@Test
	public void login()
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\jar files\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("geethamaanvi123@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("welcome@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	
	@Test
	public void login1()
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\jar files\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver2=new ChromeDriver();
		driver2.get("http://demowebshop.tricentis.com/login");
		driver2.manage().window().maximize();
		driver2.findElement(By.id("Email")).sendKeys("kavithamallina997@gmail.com");
		driver2.findElement(By.name("Password")).sendKeys("Kavitha2202");
		driver2.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
}


