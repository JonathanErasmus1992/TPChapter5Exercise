package za.ac.cput.project.chapter5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryMethodTest {
	private Employee testL, testS;
	@Before
	public void setUp() throws Exception
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		testL = (Employee)ctx.getBean("getLString");
		testS = (Employee)ctx.getBean("getSString");
	}
	@After
	public void tearDown() throws Exception
	{
		
	}
	@Test
	public void testRole()
	{
		Object obj = EmployeeFactoryMethod.getInstance().getEmployeeRole("Lecturer");
		Assert.assertNotNull("The object returned is not null: " + obj, obj);
		System.out.println( obj );
		Object obj2 = EmployeeFactoryMethod.getInstance().getEmployeeRole("dsfs");
		Assert.assertNotNull("The object returned is not null: " + obj2, obj2);
		System.out.println( obj2 );
	}
}
