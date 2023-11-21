package com.upskill.java_6;

public class Singleton {
	
	//Singleton is class that can have only one object 
	
	//Private constructor, it prevents any other class from instanting
	private Singleton(){
		
	}
	
	//Private static object of the class 
	private static Singleton SingletonOBJ = new Singleton();
	
	public static Singleton getInstance(){
		return SingletonOBJ;
	}
	
	protected static void demo1(){
		System.out.println("Demo I method for singleton class");
	}
	
	protected static void demo2(){
		System.out.println("Demo II method for singleton class");
	}
	
	protected static void demo3(){
		System.out.println("Demo III method for singleton class");
	}
	
	//git changes
}
