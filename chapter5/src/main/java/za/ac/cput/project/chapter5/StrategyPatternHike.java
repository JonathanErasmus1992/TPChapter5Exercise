package za.ac.cput.project.chapter5;

public class StrategyPatternHike implements StrategyPatternInterface 
{
		@Override
		public boolean checkTemperature(int temperatureInF) 
		{
			if ((temperatureInF >= 50) && (temperatureInF <= 90)) 
			{
				return true;
			} else 
			{
				return false;
			}	
		}
}
