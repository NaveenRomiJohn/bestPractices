package com.chainsys.bestPractices.decoupled;

public class WoodenWheel  implements IWheel
{
	public String location;
	public  void rotate() {
		System.out.println(location+" Wooden wheel rotating");
	}
	public  void stopRotate() {
		System.out.println(location+" Wooden wheel stopped rotating");
	}
}
