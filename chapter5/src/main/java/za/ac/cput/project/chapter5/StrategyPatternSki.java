package za.ac.cput.project.chapter5;

public class StrategyPatternSki implements StrategyPatternInterface 
{
	@Override
	public boolean checkTemperature(int temperatureInF) 
	{
		if (temperatureInF <= 32) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
}
