package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions jUnit = new jUnitFunctions();
		int result = jUnit.sum(100, 201);
		assertEquals (301, result);
	}

}
