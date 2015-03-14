package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FacadePatternTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void testClass1() 
	{
		Class1 class1 = new Class1();
		int num1 = class1.doSomethingComplicated(2);
		
		FacadePattern facade = new FacadePattern();
		int num2 = facade.cubeX(2);
		
		Assert.assertEquals("Checks that the two methods return the same value", num1, num2);
		System.out.println("The different methods return the same value");
	}
	public void testClass2()
	{
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		int num1 = class2.doAnotherThing(class1, 2);
		
		FacadePattern facade = new FacadePattern();
		int num2 = facade.cubeXTimes2(2);
		
		Assert.assertEquals("Checks that the two methods return the same value", num1, num2);
		System.out.println("The different methods return the same value");
	}
	public void testClass3()
	{
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();
		Class3 class3 = new Class3();
		int num1 = class3.doMoreStuff(class1, class2, 2);
		
		FacadePattern facade = new FacadePattern();
		int num2 = facade.xToSixthPowerTimes2(2);
		
		Assert.assertEquals("Checks that the two methods return the same value", num1, num2);
		System.out.println("The different methods return the same value");
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}
