package com.revature.simple;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class simpletester {
	
	@Test
	public void test() {
		assertEquals(true, true);
	}
	
	@Test
	public void checkFailure() {
		assertEquals(false, false);
	}
}
