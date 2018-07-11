package com.arijit.designpatterns.factory;

public class CarFactory {
	
	//We can keep Factory class Singleton or we can keep the method that returns the subclass as static.
	public static Car getCar (String brand) {
		if ("Honda".equals(brand)) {
			return new Honda ("I am Honda's wheel", "", "","");
		}else if ("Toyota".equals(brand)) {
			return new Toyota ("I am Toyota's wheel", "", "","");
		}else 
			return null;
		
	}

}


/*
 * Factory Design Pattern Advantages
1. Factory design pattern provides approach to code for interface rather than implementation.
2. Factory pattern removes the instantiation of actual implementation classes from client code. 
	Factory pattern makes our code more robust, less coupled and easy to extend. 
	For example, we can easily change Car class implementation because client program is unaware of this.
3. Factory pattern provides abstraction between implementation and client classes through inheritance.

*/
