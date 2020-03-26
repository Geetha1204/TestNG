import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid2 {
	WebDriver[] driver=new WebDriver [2];
	String baseURL="";
	String[] nodeURL= new String[2];
	@Test
		public void startapp() throws MalformedURLException{
		
		nodeUrl[0]="";
		nodeUrl[1]="";
			DesiredCapabilities capabilityC=DesiredCapabilities.chrome();
			DesiredCapabilities capabilityF=DesiredCapabilities();
			
			capabilityF.setBrowserName("firefox");
			capabilityF.setPlatform(Platform.WINDOWS);
			ForefoxOptions options = new ForefoxOptions();
			options.merge(capabilityF);
			capabilityF.setBrowserName("firefox");
			capabilityF.setPlatform(Platform.WINDOWS);
			capabilityC.setBrowserName("chrome");
			capabilityC.setPlatform(Platform.WIN10);
			driver[0]=new RemoteWebDriver(new URL(nodeUrl[0],capabilityF);
			driver[1]=new RemoteWebDriver(new URL(nodeUrl[1],capabilityC);
			driver[1].manage().window().maximize();
			driver[0].manage().window().maximize();
			driver[0].get(baseURL);
			driver[1].manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver[0].manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver[1].get(baseURL);
			
			Module1 m1= new Module1(driver[0]);
			m1.testModule1();
			Module2 m2= new Module2(driver[0]);
			m2.testModule2();
			
			
			driver=new RemoteWebDriver(new URL("http://172.24.84.6"
					+ "0:4455/wd/hub"),capabilities);
			driver.get("http://demowebshop.tricentis.com/login");
			String title=driver.getTitle();
			System.out.println(title);
			driver.manage().window().maximize();
			driver.findElement(By.id("Email")).sendKeys("geethamaanvi123@gmail.com");
			driver.findElement(By.name("Password")).sendKeys("welcome@123");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			driver.findElement(By.linkText("Log out")).click();
			driver.close();
			
		}
		}

	






