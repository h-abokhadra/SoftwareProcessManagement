package finalExam;

/**
 * A class with a single static method to predict the weather based on the fact
 * that the weather is set to increase by 2 degrees from a given current Temp.
 * 
 * @author dancye, 2021 - SYST 38634 final exam
 *
 */
public class WeatherForecaster {

	/**
	 * A method to return the temp forecast for tomorrow in degrees celsuis A temp
	 * for tomorrow is expected to rise by 2 degrees from today's temp
	 * 
	 * @param currentTemp
	 * @return tomorrow's expected temp
	 */
	public static double getWeatherForecast(double currentTemp) {

		return currentTemp + 2.0;
	}

	//Overloading
	public static double getWeatherForecast(double currentTemp, int day) {
		
		int dayCount = 1;
		
		while (dayCount <=5) {
			
			currentTemp += 2.0;
			
		}
		return currentTemp;
	}
}
