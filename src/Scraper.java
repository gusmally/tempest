package src;

// TODO import gargoyle libraries
// TODO download and decompres libraries into lib folder

public class Scraper 
{
	
	public static void main(String[] args)
	{
		// let's replace this main() with a run class later with its own main()
	}
	
	/* A method that scrapes the site at specified URL and returns a Weather album*/
	private Weather scrape(String baseURL)
	{
		// TODO: decide how to handle search for forecasts, actual weather
		// two separate methods?
		// do we want to look up by date? i.e. pass in a date?
		Weather result = new Weather();
		
		// define items to search for (these are just placeholders for now)
		// TODO: find actual strings in real weather sites. 
		// are they going to be different from one another?
		// should we define the project for a few weather sites?
		// can we pass in different search terms when we call the scrape on different sites?
		String searchHighTemperature = "high";
		String searchLowTemperature = "low";
		
		// open the web client
	//	WebClient client = new WebClient();
		
		
		
		// need to check here if all the fields of the weather have been filled
		return result;
	}
	
	
	
}