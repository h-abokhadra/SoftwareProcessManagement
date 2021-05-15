package makechangetemp;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

// A class for testing the weather forecaster class 
// Author, Hoda Abokhadra, 2021

class TestWeatherForecaster {

	//Good regression test for the getWeatherForecast method  original logic before modifying to add 2 more degrees for 1 day 
	@Test
	void testgetWeatherForecastGoodOld() throws InvalidNumberException{
		double result = WeatherForecaster.getWeatherForecast(20, 1);
		assertTrue("The result is correct " + result, result == 22);
	}
	
	//Good test for the getWeatherForecast method modified code to add 3 days instead of 1 day 
	@Test
	void testgetWeatherForecastGood() throws InvalidNumberException{
		double result = WeatherForecaster.getWeatherForecast(30, 3);
		assertTrue("The result is correct " + result, result == 36);
	}
	
	//	A bad test for the getWeatherForecast method. 

	@Test
	void getWeatherForecastBad()throws InvalidNumberException {
		double result = WeatherForecaster.getWeatherForecast(20, 1); //
		assertFalse("The result is incorrect " + result, result == 30);
	}

}
