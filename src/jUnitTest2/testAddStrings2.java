package jUnitTest2;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestPackage.jUnitFunctions;

public class testAddStrings2 {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result=junit.addStrings("Hello","World");
		assertEquals("HelloWorld",result);
	}
}
