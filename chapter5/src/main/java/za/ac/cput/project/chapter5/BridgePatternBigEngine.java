package za.ac.cput.project.chapter5;

public class BridgePatternBigEngine implements BridgePatternEngine 
{
	int horsepower;

	public BridgePatternBigEngine () 
	{
		horsepower = 350;
	}

	@Override
	public int go() 
	{
		System.out.println("The big engine is running");
		return horsepower;
	}
}
