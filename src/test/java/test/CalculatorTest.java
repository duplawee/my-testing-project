package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Calculator;
import main.MyPair;
import static org.mockito.Mockito.*;

public class CalculatorTest {

	private Calculator calculator = null;
	private MyPair myMockObject;
	
	
	@Before
	public void beforeEachTest() {
		calculator = Calculator.getInstance();
		myMockObject = mock(MyPair.class);
	}
	
	@Test
	public void testIfInstantiationIsDone() {
		assertNotNull(calculator);
	}
	
	@Test
	public void testSum() {
		int result = calculator.sum(2, 2);
		assertTrue(result == 4);
	}
	
	@Test
	public void testWrongSum() {
		int result = calculator.wrongSum(1, 2);
		assertFalse(result == 3);
	}
	
	@Test
	public void testDivide() {
		double result = calculator.divide(2.0, 4.0);
		assertTrue(result == 0.5);
	}
	
	@Test
	public void testWrongDivide() {
		double result = calculator.wrongDivide(8, 2);
		assertFalse(result == 4);
	}
	
	@Test
	public void testSumWithPair() {
		when(myMockObject.getFirst()).thenReturn(5);
		when(myMockObject.getSecond()).thenReturn(7);
		
		assertTrue(calculator.sum(myMockObject.getFirst(), myMockObject.getSecond()) == 12);
	}
}
