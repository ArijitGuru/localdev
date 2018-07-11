package com.arijit.designpatterns.factory;

public abstract class Car {
	public abstract String getWheel();
	public abstract String getEngine();
	public abstract String getTransmission();
	public abstract String getBrake();
	
	@Override
	public String toString() {
		return "Car [getWheel()=" + getWheel() + ", getEngine()=" + getEngine() + ", getTransmission()="
				+ getTransmission() + ", getBrake()=" + getBrake() + "]";
	}
	
	
	
}
