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

}
