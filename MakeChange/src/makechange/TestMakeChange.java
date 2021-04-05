package makechange;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

class TestMakeChange {
   //A test for dividing the number into quarters evenly 
	@Test
	void testDivideQuartersEvenlyGood() throws BadNumberException {
		int result = MakeChange.getNumQuarters(25);
		assertTrue("The quarters were returned correctly " + result, result == 1);
	}
	//
	@Test
	void testDivideQuartersEvenlyBoundry()  throws BadNumberException{
		int result = MakeChange.getNumQuarters(75); // the highest value from 1 to 99 divisible by 25 evenly is 75 
		assertTrue("The quarters were returned correctly " + result, result == 3);
	}
	
	@Test
	void testDivideQuartersEvenlyBad()  throws BadNumberException{
		int result = MakeChange.getNumQuarters(24); // as 22 is not divisible evenly by 25 
		assertFalse("The quarters were returned incorrectly " + result, result == 1);
	}
}
