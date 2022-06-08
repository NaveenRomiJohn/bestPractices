package com.chainsys.bestPractices.decoupled;
//Objects of this class can work with any engine, and with any wheel
//The car class is decoupled from petrolEngine class, and steelWheel class
public class Bike {
	private IEngine engine; //Early bound with petrol engine
	private IWheel[] wheels; //Early bound with wheel interface
	//The type of engine, and the type of wheel will be injected to the bike class
	//At runtime using the setter method. This is called as setter based 
	//dependency injection
	public IEngine getEngine() {
		return engine;
	}
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	public void setWheels(IWheel[] wheels) {
		this.wheels = wheels;
	}
	
	public Bike(IEngine engine,IWheel[] wheel) {
		this.engine = engine;
		this.wheels = wheel;
	}
	public void startBike() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
	}
	public IWheel[] getWheels()
	{
		return this.wheels;
	}
	public Bike()
	{
		
	}
}
