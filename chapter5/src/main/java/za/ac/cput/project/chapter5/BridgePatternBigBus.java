package za.ac.cput.project.chapter5;

public class BridgePatternBigBus extends BridgePatternVehicle 
{
	public BridgePatternBigBus(BridgePatternEngine engine) 
	{
		this.weightInKilos = 3000;
		this.engine = engine;
	}

	@Override
	public void drive()
	{
		System.out.println("\nThe big bus is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}
}
