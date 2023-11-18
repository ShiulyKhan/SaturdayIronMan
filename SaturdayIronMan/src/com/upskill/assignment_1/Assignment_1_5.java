package com.upskill.assignment_1;

public class Assignment_1_5 {
	
	public class StudentInfoDisplay {

	    public static void main(String[] args) {
	        System.out.println(getStudent1Info());
	        System.out.println(getStudent2Info());
	        System.out.println(getStudent3Info());
	    }

	    // Info for the first student
	    public static String getStudent1Info() {
	        String name = "Alice";
	        int estimatedAge = 20;
	        return "Name: " + name + ", Estimated Age: " + estimatedAge;
	    }

	    // Info for the second student
	    public static String getStudent2Info() {
	        String name = "Bob";
	        int estimatedAge = 22;
	        return "Name: " + name + ", Estimated Age: " + estimatedAge;
	    }

	    // Info for the third student
	    public static String getStudent3Info() {
	        String name = "Charlie";
	        int estimatedAge = 21;
	        return "Name: " + name + ", Estimated Age: " + estimatedAge;
	    }
	}

}
