package com.javaexamples;

public class Cricketer {
	
	private static int count;
	
	public Cricketer() {
		count++;
	}
	
	static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer	cricketer1 =	new Cricketer();
		Cricketer	cricketer2 =	new Cricketer();
		Cricketer	cricketer3 =	new Cricketer();
		Cricketer	cricketer4 =	new Cricketer();
		
		System.out.println(Cricketer.getCount());//4

	}

}