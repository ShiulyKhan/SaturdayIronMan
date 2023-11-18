package com.upskill.java_6;

public class MultiThreading {
	
	/*MultiThreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanism : 
	 
	 	1. Extending the Thread class
	 	2. Implementing the Runnable Interface */
	
	public static void main(String[] args) throws InterruptedException {
		int n = 6;
		for (int i = 0; i < n; i++){
			MultiThreadingThread obj = new MultiThreadingThread();
			obj.run();
			obj.sleep(1000);
			
			Thread obj2 = new Thread(new MultiThreadingRunnable());
			obj2.run();
		}
	}
}
