package com.arijit.designpatterns.singleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance = null;
	
	//private constructor to avoid calling outside the class
	private ThreadSafeSingleton() {
		
	}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	/*
	 * Above implementation works fine and provides thread-safety 
	 * but it reduces the performance because of cost associated with the synchronized method, 
	 * although we need it only for the first few threads who might create the separate instances. 
	 * To avoid this extra overhead every time, double checked locking principle is used. 
	 * In this approach, the synchronized block is used inside the if condition with an additional check to ensure 
	 * that only one instance of singleton class is created.
	 */
	
	//Below code snippet provides the double checked locking implementation.
	private static ThreadSafeSingleton getInstanceDoubleChecking() {
		if (instance == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

}
