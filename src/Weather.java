package src;

public class Weather 
{
	// TODO: define other parameters, or simplify as needed
	
	private int highTemperature;
	private int lowTemperature;
	
	// TODO: map properly to actual weather site examples
	private enum precipitation { rain, snow, sleet, hail, ice, freezingRain };
	private precipitation precipitationState;
	
	// TODO: map properly to actual weather site examples
	private enum cloudCover { cloudy, partiallyCloudy, sunny };
	private cloudCover cloudCoverState;
	
	public Weather(int highTemperature, int lowTemperature, precipitation precipitationState, cloudCover cloudCoverState)
	{
		this.highTemperature = highTemperature;
		this.lowTemperature = lowTemperature;
		this.precipitationState = precipitationState;
		this.cloudCoverState = cloudCoverState;
	}
	
	public Weather()
	{
		// will the parameters be null? need a null check at end of scrape
		// need to define defaults in case of null
	}
	
	public int GetHighTemp()
	{
		return this.highTemperature;
	}
	
	public void SetHighTemp(int temp)
	{
		this.highTemperature = temp;
	}
	
	public int GetLowTemp()
	{
		return this.lowTemperature;
	}
	
	public void SetLowTemp(int temp)
	{
		this.lowTemperature = temp;
	}
	
	public precipitation GetPrecipitationState()
	{
		return this.precipitationState;
	}
	
	public void SetPrecipitationState(precipitation state)
	{
		this.precipitationState = state;
	}
	
	public cloudCover GetCloudCoverState()
	{
		return this.cloudCoverState;
	}
	
	public void SetCloudCoverState(cloudCover state)
	{
		this.cloudCoverState = state;
	}
}