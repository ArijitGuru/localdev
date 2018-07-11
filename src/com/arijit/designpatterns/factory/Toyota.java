package com.arijit.designpatterns.factory;

public class Toyota extends Car{
	
	private String wheel;
	private String engine;
	private String transmission;
	private String brake;
	
	public Toyota() {
		
	}
	public Toyota (String wheel, String engine, String transmission, String brake) {
		this.wheel = wheel;
		this.engine = engine;
		this.transmission = transmission;
		this.brake = brake;
	}

	@Override
	public String getWheel() {
		return this.wheel;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public String getTransmission() {
		return this.transmission;
	}

	@Override
	public String getBrake() {
		return this.brake;
	}

}
