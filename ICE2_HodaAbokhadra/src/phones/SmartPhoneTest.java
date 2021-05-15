package phones;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;


/**
 * Test class for the SmartPhone.java file. 
 * Hoda Abokhadra, 2021
 */
class SmartPhoneTest {

	// A test for good input for the getFormattedPrice method
	@Test
	void testGetFormattedPriceGood() {
		SmartPhone phoneUnderTest = new SmartPhone();
		phoneUnderTest.setPrice(99.99);
		String price = phoneUnderTest.getFormattedPrice();
		assertTrue("The price was not formatted correctly", price.equals("$99.99"));
	}

	// A test for boundary input (zero) for the getFormattedPrice method
	@Test
	void testGetFormattedPriceBoundary() {
		SmartPhone phoneUnderTest = new SmartPhone();
		phoneUnderTest.setPrice(0);
		String price = phoneUnderTest.getFormattedPrice();
		assertTrue("The price was not formatted correctly", price.equals("$0"));
	}

	// A test for bad input for the getFormattedPrice method
	@Test
	void testGetFormattedPriceBad(){
		SmartPhone phoneUnderTest = new SmartPhone();
		phoneUnderTest.setPrice(69.30);
		String price = phoneUnderTest.getFormattedPrice();
		assertFalse("The price was not formatted correctly", price.equals("#69.30"));
	}

	// A test for good input for the setVersion method
	
	@Test
	void testSetVersionGood() throws VersionNumberException {
		SmartPhone phoneUnderTest = new SmartPhone();
		phoneUnderTest.setVersion(2.5);
		double version = phoneUnderTest.getVersion();
		assertTrue("The version number is applicable", version == 2.5);
	}

	// A test for boundary input for the setVersion method, choosing the highest applicable value 4.0
	
	@Test
	void testSetVersionBoundary() throws VersionNumberException{
		SmartPhone phoneUnderTest = new SmartPhone();
		phoneUnderTest.setVersion(4.0);
		double version = phoneUnderTest.getVersion();
		assertTrue("The version number is applicable", version == 4.0);
	}
	
	// A test for bad input (bigger than 4.0) for the setVersion method
	
	@Test
	void testSetVersionBad() throws VersionNumberException {
		SmartPhone phoneUnderTest = new SmartPhone();
		assertThrows(VersionNumberException.class, ()-> {phoneUnderTest.setVersion(7.0);});
	}


}
