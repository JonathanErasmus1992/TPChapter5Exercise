package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BuilderPatternTest {
	
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void test() 
	{
		BuilderPattern courseBuilder = new SecondYearDiplomaCourseBuilder();
		DiplomaCourseDirector diplomaDirector = new DiplomaCourseDirector(courseBuilder);
		diplomaDirector.constructDiplomaCourse();
		DiplomaCourse diplomaCourse = diplomaDirector.getDiplomaCourse();
		Assert.assertNotNull(diplomaCourse);
		System.out.println("Checks that the object returned is not empty");
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}
