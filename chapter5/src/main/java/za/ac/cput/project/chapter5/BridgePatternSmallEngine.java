package za.ac.cput.project.chapter5;

public class BridgePatternSmallEngine implements BridgePatternEngine
{
	int horsepower;

	public BridgePatternSmallEngine() 
	{
		horsepower = 100;
	}
	@Override
	public int go() 
	{
		System.out.println("The small engine is running");
		return horsepower;
	}
}
