package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {
	
	public static void main(String[] args) {
		
		//Array store multiple data using index 
		
		int age = 30;                                             //Variable
		int[] ageIronMan = new int[]{25, 32, 37, 21, 27, 32};     //Arrray
		
		//Array index               [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageIronMan[3]);
		System.out.println("Total Student  : " + ageIronMan.length);
		
		String[] nameIronMan = new String[]{"Yousuf", "Abdullah", "Madan", "Sumaia", "Jannatun"};
	
		System.out.println("Student name : " + nameIronMan[2]);
		System.out.println("Total Student name : " + nameIronMan.length);
		
		//Multi-Dimentional Array
		int [][] ageIronMan2D = {{25, 32, 37, 21, 27, 32},         //[0][0] [0][2] [0][3] [0][4]
				{26, 30, 33, 28}};								   //[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Student Age 2D : " + ageIronMan2D[1][0]);
		
		// Hashmap store multiple data using key-value pair, Implementation of Map interface 
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Yousuf", 28);
		Student.put("abdullah", 22);
		Student.put("Madan", 32);
		Student.put("Jannatul", 24);
		Student.put("Kulsuma", 37);
		
		System.out.println("HashMan Student Age : " + Student.get("Kulsuma"));
	
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("USA", "DC");
		
		System.out.println("Capital City : " + Capital.get("USA"));
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Tesla");
		car.add("Audi");
		System.out.println("Car : " + car);
		
		//HashTable store multiple data using key-value pair, No duplicate,
		//		also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD",  "Asia");
		Region.put("USA", "America");
		System.out.println("Region : " + Region.get("BD")); 
	}
}
		

