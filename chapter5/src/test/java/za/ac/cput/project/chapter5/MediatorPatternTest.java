package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MediatorPatternTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void test() 
	{
		//fail("Not yet implemented");
		MediatorUser Jonathan = new MediatorUser("Jonathan");
		MediatorUser Nicola = new MediatorUser("Nicola");
		
		Assert.assertNotSame("The objects are different",Jonathan, Nicola);
		
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}
