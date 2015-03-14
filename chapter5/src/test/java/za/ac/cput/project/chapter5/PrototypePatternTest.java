package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrototypePatternTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void testPrototypePattern() {
		LecturerPP lecturer1 = new LecturerPP("Samuels");
		LecturerPP lecturer2 = (LecturerPP) lecturer1.makeCopy();
		Assert.assertNotSame("Objects must be the same but not identicle", lecturer1, lecturer2);
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}