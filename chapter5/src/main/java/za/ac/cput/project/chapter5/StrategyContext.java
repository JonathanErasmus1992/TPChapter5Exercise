package za.ac.cput.project.chapter5;

public class StrategyContext 
{
	int temperatureInF;
	StrategyPatternInterface strategy;

	public StrategyContext(int temperatureInF, StrategyPatternInterface strategy) 
	{
		this.temperatureInF = temperatureInF;
		this.strategy = strategy;
	}

	public void setStrategy(StrategyPatternInterface strategy)
	{
		this.strategy = strategy;
	}

	public int getTemperatureInF() 
	{
		return temperatureInF;
	}

	public boolean getResult()
	{
		return strategy.checkTemperature(temperatureInF);
	}
}
