package palindrome;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.jupiter.api.Test;

// Author: Hoda Abokhadra, 2021 


class PalindromeTest {

	/**
	 * A test on good input. We expect this test to return a True boolean if the input String is a palindrome.
	 */
	@Test
	void testGetPalindromeGood() {
		
		String result = Palindrome.getPalindrome("kayak");
		assertTrue("The String you entered is a Palindrome" + result, true);
	}

	/**
	 * A test on bad input. We expect this test to return a False boolean if the input String is NOT a palindrome..
	 */
	@Test
	void testGetPalindromeBad() {
		
		String result = Palindrome.getPalindrome("car");
		assertFalse("The String you entered is NOT a Palindrome" + result, false);
	}

	}


