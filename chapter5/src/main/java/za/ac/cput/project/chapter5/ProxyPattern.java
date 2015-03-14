package za.ac.cput.project.chapter5;

import java.util.Date;

public class ProxyPattern {
	SlowThing slowThing;
	public ProxyPattern()
	{
		System.out.println("Creating proxy at " + new Date());
	}
	public void sayHello()
	{
		if (slowThing == null)
		{
			slowThing = new SlowThing();
		}
		slowThing.sayHello();
	}
}
