import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

//Author: Hoda Abokhadra, 2021

class TestGraduationCalculator {
	
	// A test for good input for the WhenWillIGraduate method with an expected good output.
	@Test
	void testWhenWillIGraduateGood() throws InvalidStartingMonthException {
		int result = 	GraduationCalculator.whenWillIGraduate(2020, "January");
		assertTrue("The graduation year is calculated correctly " +  result,  result == 2021);
	}
	
	// A test for bad input for the WhenWillIGraduate method with an expected bad output.
	
	@Test
	void testWhenWillIGraduateBad()  throws InvalidStartingMonthException{
		int result = GraduationCalculator.whenWillIGraduate(2020, "September");
		assertFalse("The graduation year is NOT calculated correctly " + result, result == 2025);
	}

}
