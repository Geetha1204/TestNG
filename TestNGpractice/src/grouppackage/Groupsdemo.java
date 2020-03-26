package grouppackage;

import org.testng.annotations.Test;

public class Groupsdemo {
	@Test(groups={"smoke"})
	public void test1()
	{
		System.out.println("smoke testcase1");
	}
	@Test(groups={"smoke"})
	public void test2()
	{
		System.out.println("smoke testcase2");
	}
	@Test(groups={"smoke"})
	public void test3()
	{
		System.out.println("smoke testcase3");
	}
	@Test(groups={"Regression"})
	public void test4()
	{
		System.out.println("Regresion test case");
	}


}
