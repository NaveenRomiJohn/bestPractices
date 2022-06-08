package com.chainsys.bestPractices.coupled;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Car();
		car.startCar();
//		car.engine=new PetrolEngine();
//		PetrolEngine p=new PetrolEngine();
//		p.start();
		SteelWheel[] carWheels = car.getWheels();
		int length = carWheels.length;
		for(int i=0; i<length; i++)
		{
			System.out.println(carWheels);
		}
	}

}
