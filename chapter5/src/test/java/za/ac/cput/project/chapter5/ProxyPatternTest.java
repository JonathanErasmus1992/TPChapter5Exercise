package za.ac.cput.project.chapter5;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProxyPatternTest {
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void testProxyPattern()
	{
		
		//fail("This is test is supposed to fail");
		ProxyPattern proxy = new ProxyPattern();
		FastThing fastThing = new FastThing();
		fastThing.sayHello();
		proxy.sayHello();
		
		Assert.assertNotEquals("The object returned must not be equal", fastThing, proxy);
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}