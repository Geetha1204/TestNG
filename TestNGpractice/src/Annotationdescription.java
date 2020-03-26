import org.testng.annotations.Test;


public class Annotationdescription {
	@Test(description="Testcase to start application")
	public void startapp(){
		System.out.println("Start Application");
	
	}
	//without priority it will take by default alphabetical order
	@Test(priority=1,description="Testcase to check login")
		public void loginapp(){
			System.out.println("Successfull login");
		}
		@Test(priority=2,description="Testcase to verify logout")
			public void signoff(){
			System.out.println("Successfull logout");
		}
	}




