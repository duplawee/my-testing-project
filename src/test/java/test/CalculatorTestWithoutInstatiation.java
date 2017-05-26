package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Calculator;

public class CalculatorTestWithoutInstatiation {

	private Calculator calculator = null;
	@Test
	public void testSumWithoutInstantiation() {
		assertNull(calculator);
	}
}
