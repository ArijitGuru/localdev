package com.arijit.designpatterns.singleton;

/*
 * Both eager initialization and static block initialization creates the instance even before it’s being used and 
 * that is not the best practice to use. So in further sections, 
 * we will learn how to create Singleton class that supports lazy initialization.
 */

public class StaticBlockInitializedSingleton {
	private static StaticBlockInitializedSingleton instance = null;
	
	//private constructor to avoid calling outside the class
	private StaticBlockInitializedSingleton() {
		
	}
	
	static {
		try {
			instance = new StaticBlockInitializedSingleton();
		}catch (Exception e) {
			System.out.println("Unable to create the StaticBlockInitializedSingleton instance" + e.getMessage());
		}
	}
	
	public static StaticBlockInitializedSingleton getInstance () {
		return instance;
	}

}
