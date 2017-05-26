package main;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import test.CalculatorTest;
import test.CalculatorTestWithoutInstatiation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int res1 = Calculator.getInstance().sum(1,2);
		int res2 = Calculator.getInstance().wrongSum(1, 2);

		System.out.println("Result of sum(1,2) = " + res1);
		System.out.println("Result of wrongSum(1,2) = " + res2);
		
		Result result = JUnitCore.runClasses(CalculatorTest.class);
		
	    for (Failure failure : result.getFailures()) {
	        System.out.println(failure.toString());
	    }
			
	    System.out.println(result.wasSuccessful());
	    
	    Result result2 = JUnitCore.runClasses(CalculatorTestWithoutInstatiation.class);
	    
	    for (Failure failure2 : result2.getFailures()) {
	        System.out.println(failure2.toString());
	    }
	    
	}

}
