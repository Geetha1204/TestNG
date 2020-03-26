package grouppackage;
import org.testng.annotations.Test;

public class groups1demo {
	@Test(groups={"Regression"})
	public void test1()
	{
		System.out.println("Regression testcase1");
	}
	@Test(groups={"Regression"})
	public void test2()
	{
		System.out.println("Regression testcase2");
	}
	@Test(groups={"Regression"})
	public void test3()
	{
		System.out.println("Regression testcase3");
	}
	@Test(groups={"Smoke"})
	public void test4()
	{
		System.out.println("Smoke test case");
	}


} 


