package jUnitTest2;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestPackage.jUnitFunctions;

public class testAddNumbers3 {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result=junit.addNumbers(100,200);
		assertEquals(300,result);
	}

}
