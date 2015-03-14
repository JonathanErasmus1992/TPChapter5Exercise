package za.ac.cput.project.chapter5;

public class AdapterPatternObject implements TemperatureInfo 
{
	CelciusReporter celciusReporter;

	public AdapterPatternObject() 
	{
		celciusReporter = new CelciusReporter();
	}

	@Override
	public double getTemperatureInC() 
	{
		return celciusReporter.getTemperature();
	}

	@Override
	public double getTemperatureInF() 
	{
		return cToF(celciusReporter.getTemperature());
	}

	@Override
	public void setTemperatureInC(double temperatureInC) 
	{
		celciusReporter.setTemperature(temperatureInC);
	}

	@Override
	public void setTemperatureInF(double temperatureInF) 
	{
		celciusReporter.setTemperature(fToC(temperatureInF));
	}

	private double fToC(double f) 
	{
		return ((f - 32) * 5 / 9);
	}

	private double cToF(double c) 
	{
		return ((c * 9 / 5) + 32);
	}
}