package com.upskill.assignment_1;

public class Assignment_1_4 {
	public class SubtractionDemo {

	    public static void main(String[] args) {
	        int value1 = returnThirty();
	        int value2 = returnFifty();

	        int difference;

	        if (value1 > value2) {
	            difference = value1 - value2;
	        } else {
	            difference = value2 - value1;
	        }

	        System.out.println("The difference between the two values is: " + difference);
	    }

	    public static int returnThirty() {
	        return 30;
	    }

	    public static int returnFifty() {
	        return 50;
	    }
	}


}
