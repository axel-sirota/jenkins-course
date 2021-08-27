package org.example.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest
{

	@Test
	public void whenEmptyString_thenAccept() {
		App palindromeTester = new App();
		assertTrue(palindromeTester.isPalindrome(""));
	}

}
