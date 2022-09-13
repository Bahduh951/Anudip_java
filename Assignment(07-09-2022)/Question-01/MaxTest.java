package com.java.unit.Project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTest {

	@Test
	void test() {
			Max ob=new Max();
			int arr[]= {60,30,70,10};
			int actual=ob.maximum(arr);
			int expected=70;
			assertEquals(expected,actual);
			

		fail("Not yet implemented");
  }
}
