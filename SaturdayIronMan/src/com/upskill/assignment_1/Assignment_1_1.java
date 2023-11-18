package com.upskill.assignment_1;

public class Assignment_1_1 {
	
	public class TrianglePerimeterCalculator {

	    public static void main(String[] args) {
	        displayPerimeter(5, 7, 11);
	    }

	    public static void displayPerimeter(int a, int b, int c) {
	        if (isValidTriangle(a, b, c)) {
	            int perimeter = a + b + c;
	            System.out.println("The perimeter of the triangle is: " + perimeter + " inches.");
	        } else {
	            System.out.println("The given arm lengths do not form a valid triangle.");
	        }
	    }

	    public static boolean isValidTriangle(int a, int b, int c) {
	        return a + b > c && a + c > b && b + c > a;
	    }
	}

}
