package org.example.app;

import org.junit.Test;

import java.util.Random;

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

	@Test
	public void flakyTest() {
		Random random = new Random();
    	assertTrue(random.nextBoolean());
	}

}
