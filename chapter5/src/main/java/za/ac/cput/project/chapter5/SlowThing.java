package za.ac.cput.project.chapter5;

public class SlowThing extends Thing {
	public SlowThing()
	{
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}