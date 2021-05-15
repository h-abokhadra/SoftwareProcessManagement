package makechangetemp;

public class WeatherForecaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * A class with a single static method to predict the weather based on the fact
	 * that the weather is set to increase by 2 degrees from a given current Temp.
	 * 
	 * @author dancye, 2021 - SYST 38634 final exam
	 * @Modifier Hoda Abokhadra, 2021
	 *
	 */

	/**
	 * A method to return the temp forecast for tomorrow in degrees celsuis A temp
	 * for tomorrow is expected to rise by 2 degrees from today's temp
	 * 
	 * @param currentTemp
	 * @return tomorrow's expected temp
	 */

	// I chose to modify the existing method 
	public static double getWeatherForecast(double currentTemp, int day) throws InvalidNumberException {

		if (day == 1) {
			currentTemp = currentTemp + 2;
		} else if (day== 2) {
			currentTemp = currentTemp +  4;
		} else if (day == 3) {
			currentTemp = currentTemp +  6;
		} else if (day == 4) {
			currentTemp = currentTemp + 8;
		} else if (day == 5) {
			currentTemp = currentTemp + 10;
		} else {
			throw new InvalidNumberException();

		}
		return currentTemp;
	}
}
