package POMwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verifylogin {
	@Test
	public void checkregister()
	{
		System.setProperty("webdriver.chrome.driver","D:\\jar files\\chromedriver_win32\\chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/register");
        driver.manage().window().maximize();
        RegisterPOM  register=new  RegisterPOM(driver);
        register
		
	}

}
