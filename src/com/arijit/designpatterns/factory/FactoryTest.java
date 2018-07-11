package com.arijit.designpatterns.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Car newCar = CarFactory.getCar("Honda");
		System.out.println(newCar.getWheel());

	}

}
