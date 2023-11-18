package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
	
	public static void main(String[] args) {
		car(4, "White");
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
	
	//void method                                             //Method Overriding
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int bonus = 25000;
		int rent = 15000; 
		int side = 10000;
		int totalIncome= calculateAnnualIncome + bonus + rent + side; 
		System.out.println("My Annual Income = " + totalIncome);
		System.out.println("My Income = " + calculateAnnualIncome);
	}
	  
	//Method Overloading Example 
	
	public static void car(){                                 //Method Overloading
		System.out.println("My car is BMW ! ");
	}
	
	public static void car (String color){
		System.out.println("My car is BMW ! It has color: " + color);
	}
	
	public static void car (int door){
		System.out.println("My car is BMW ! It has door: " + door);
	}
	
	public static void car(int door, String color){
		System.out.println("My car is BMW ! It has door: " + door +", It has color: " + color);
	}
	
	public static void car (boolean isFuel){
		System.out.println("My car is BMW ! It is FuelEngine: " + isFuel);
	}
}
