package main;

public class Calculator {
	
	private static Calculator calculatorInstance = null;
	
	private Calculator() {}
	
	public static Calculator getInstance() {
		if(calculatorInstance == null) {
			calculatorInstance = new Calculator();
		}
		return calculatorInstance;
	}

	public int sum(int a, int b) {
		return a + b;
	}
	
	public int wrongSum(int a, int b) {
		return a + b -100;
	}

	public int minus(int a, int b) {
		return a - b; 
	}

	public double divide(double a, double b) {
		return a / b;
	}
	
	public double wrongDivide(double a, double b) {
		return a * b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
}
