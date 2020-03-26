package POMwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagefactory {
	WebDriver driver;
	
	@FindBy(name="Email")
	WebElement Email;
	
	@FindBy(name="Password")//Identify dynamically using library use how
	WebElement Password;
	
	@FindBy(name="submit")
	WebElement submit;
	public void LoginPageFactory(WebDriver driver){//local driver from page factory
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void senduserName(String UN){
		Email.sendKeys(UN);
	}
	
		public void sebpassword(String pwd)
		{
			Password.sendKeys(pwd);
		}
		
	
	public void clickLoginBtn(){
		
	
		submit.click();
	
}
}
