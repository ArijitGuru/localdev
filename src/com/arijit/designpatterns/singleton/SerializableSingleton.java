package com.arijit.designpatterns.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6296348963663617647L;

	private SerializableSingleton () {
		
	}
	
	private static class SerializableSingletonHelper {
		private static SerializableSingleton INSTANCE = new SerializableSingleton();
	}

	public static SerializableSingleton getInstance() {
		return SerializableSingletonHelper.INSTANCE;
	}
	
	// Java reflection destroys the singleton pattern, to overcome this scenario all
	// we need to do it provide the implementation of readResolve() method.
	
	//uncomment below method to make Singleton Serialization safe
	/*protected Object readResolve() {
		return getInstance();
	}*/
}
