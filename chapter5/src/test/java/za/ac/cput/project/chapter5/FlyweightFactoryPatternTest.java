package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class FlyweightFactoryPatternTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void test() {
		//fail("Not yet implemented");
		FlyweightFactoryPattern flyweightFactory = FlyweightFactoryPattern.getInstance();

		for (int i = 0; i < 5; i++) 
		{
			Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
			flyweightAdder.doMath(i, i);
			
			/*Flyweight flyweightMultiplier = flyweightFactory.getFlyweight("multiply");
			flyweightMultiplier.doMath(i, i);*/
		}
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}
