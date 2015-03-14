package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DecoratorPatternTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void test() {
		//fail("Not yet implemented");
		DecoratorAnimal animal = new DecoratorLivingAnimal();
		animal = new DecoratorPatternLeg(animal);
		DecoratorAnimal animal2 = new DecoratorLivingAnimal();
		animal2 = animal;
		animal = new DecoratorPatternWing(animal);
		animal = new DecoratorPatternGrowl(animal);
		
		Assert.assertFalse("Checks that the objects is the same but changes are made", animal == animal2);
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}
