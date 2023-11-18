package com.upskill.assignment_1;

public class Assignment_1_3 {
	public class CalculationDemo {

	    public static void main(String[] args) {
	        int a = 9;
	        int b = 11;
	        
	        int multiplicationResult = multiply(a, b);
	        int totalSum = a + b + multiplicationResult;
	        
	        System.out.println("The result of a + b + (a*b) is: " + totalSum);
	    }

	    public static int multiply(int x, int y) {
	        return x * y;
	    }
	}


}
