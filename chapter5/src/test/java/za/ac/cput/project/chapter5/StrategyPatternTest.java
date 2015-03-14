package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StrategyPatternTest {

	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void testStrategyPattern() {
		//fail("Not yet implemented");
		StrategyPatternInterface skiStrategy = new StrategyPatternSki();
		StrategyContext context = new StrategyContext(17, skiStrategy);
		
		int num1 = context.getTemperatureInF();
		Assert.assertEquals(17, num1);
		
		Assert.assertTrue(context.getResult());
		
		System.out.println(num1 + "    " + context.getResult());
		
		StrategyPatternInterface hikeStrategy = new StrategyPatternHike();
		context.setStrategy(hikeStrategy);
		
		int num2 = context.getTemperatureInF();
		System.out.println(num2 + "    " + context.getResult());
		
		Assert.assertEquals(17, num2);
		
		Assert.assertFalse(context.getResult());
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}
