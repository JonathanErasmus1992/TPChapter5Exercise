package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TemplateMethodPatternTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void test() {
		//fail("Not yet implemented");;
		TemplateMethodPatternMeal meal1 = new TemplateMethodHamburgerMeal();

		TemplateMethodPatternMeal meal2 = new TemplateMethodTacoMeal();
		
		Assert.assertNotSame("The returned objects are not identicle", meal1, meal2);
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}	
