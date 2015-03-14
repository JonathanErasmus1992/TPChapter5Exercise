package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingletonTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void testIfEqual() {
		SingletonExercise singletonExercise1 = SingletonExercise.getInstance();
		SingletonExercise singletonExercise2 = SingletonExercise.getInstance();
		Assert.assertEquals(true, singletonExercise1 == singletonExercise2);
	}
	@AfterClass 
	public static void afterClass()
	{
		
	}
}
