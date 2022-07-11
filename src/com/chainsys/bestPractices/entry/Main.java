package com.chainsys.bestPractices.entry;

public class Main {

	public static void main(String[] args) {
		String s1="Chainsys";
		String s2="Chainsys";
		String s3="Chain"+"sys";
		String s4="chainsys";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
