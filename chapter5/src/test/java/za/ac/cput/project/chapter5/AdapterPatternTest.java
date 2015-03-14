package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdapterPatternTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void testAdapterPattern() 
	{
		//fail("Not yet implemented");
		TemperatureInfo tempInfo = new AdapterPatternClass();
		tempInfo.setTemperatureInC(3);
		double d1 = tempInfo.getTemperatureInC();
		tempInfo.setTemperatureInF(3);
		double d2 = tempInfo.getTemperatureInF();
		Assert.assertNotSame("Checks that the numbers reeturned are not the same", d1, d2);
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}