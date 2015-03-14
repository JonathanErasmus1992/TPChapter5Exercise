package za.ac.cput.project.chapter5;

public class BridgePatternSmallCar extends BridgePatternVehicle 
{
	public BridgePatternSmallCar(BridgePatternEngine engine) 
	{
		this.weightInKilos = 600;
		this.engine = engine;
	}
	@Override
	public void drive() 
	{
		System.out.println("\nThe small car is driving");
		int horsepower = engine.go();
		reportOnSpeed(horsepower);
	}
}
