package listenerpackage;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
@Listeners({listenerpackage.ListenerImplementationdemo.class})

public class Synchronizationdemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\jar files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			driver.findElement(By.id("btnLogin")).click();
			WebDriverWait Mywait=new WebDriverWait(driver,10);//explicit wait
			Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
			driver.findElement(By.xpath("//a[@id='welcome']")).click();
			WebDriverWait Mywait1=new WebDriverWait(driver,10);
			Mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
					
					
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			
			driver.close();

}
}
