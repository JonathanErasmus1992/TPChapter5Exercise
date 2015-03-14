package za.ac.cput.project.chapter5;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ComponentPatternTest 
{
	@BeforeClass
	public static void beforeClass()
	{
		
	}
	@Test
	public void testComponentPattern() 
	{
		//fail("Not yet implemented");
		Leaf leaf1 = new Leaf("Bob");
		Leaf leaf2 = new Leaf("Fred");
		Leaf leaf3 = new Leaf("Sue");
		Leaf leaf4 = new Leaf("Ellen");
		Leaf leaf5 = new Leaf("Joe");
		
		Composite composite1 = new Composite();
		composite1.add(leaf1);
		composite1.add(leaf2);
		composite1.sayGoodbye();
		
		Composite composite2 = new Composite();
		composite2.add(leaf3);
		composite2.add(leaf4);
		composite2.sayGoodbye();

		Composite composite3 = new Composite();
		composite3.add(composite1);
		composite3.add(composite2);
		composite3.add(leaf5);
		
		composite3.sayGoodbye();
		Assert.assertNotNull("The object cannot be returning null", composite3);
	}
	@AfterClass
	public static void afterClass()
	{
		
	}
}
