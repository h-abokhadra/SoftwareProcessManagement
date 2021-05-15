package finalExam;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

class TestWeatherForecaster {

	// 
	@Test
	void testgetWeatherForecastGood() {
		double result = WeatherForecaster.getWeatherForecast(25, 1);
		assertTrue("The quarters were returned correctly " + result, result == 27);
	}
	//

	@Test
	void getWeatherForecastBad(){
		double result = WeatherForecaster.getWeatherForecast(25); // 
		assertFalse("The quarters were returned incorrectly " + result, result == 30);
	}

}
