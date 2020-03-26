import org.testng.annotations.Test;


public class Prioritydemo {
	@Test
	public void startapp(){
		System.out.println("Start Application");
	
	}
	//without priority it will take by default alphabetical order
	@Test(priority=1)
		public void loginapp(){
			System.out.println("Successfull login");
		}
		@Test(priority=2)
			public void signoff(){
			System.out.println("Successfull logout");
		}
	}


