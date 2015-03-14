package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ObserverPatternTest {

	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void testObserverPattern() {
		//fail("Not yet implemented");
		ObserverSubject subject = new ObserverSubject();
		new ObserverHexal(subject);
		new ObserverOctal(subject);
		ObserverSubject subject2 = subject;
		new ObserverBinary(subject);
	    Assert.assertEquals(subject, subject2);
	    
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}
