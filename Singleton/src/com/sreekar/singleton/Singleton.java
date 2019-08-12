package com.sreekar.singleton;

public class Singleton implements Cloneable{

	private static Singleton mySingleTon = new Singleton();

	private Singleton() {
		System.out.println("I am a construtor");
	}

	public static Singleton getInstanse() {

		return mySingleTon;

	}

}
