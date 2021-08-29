package com.javaexamples;

public class EnumExample {
	 
	enum Season {WINTER, SPRING, SUMMER, FALL};


	public void printSeasons() {
		for (Season s : Season.values()) {
			System.out.println(s);  
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumExample e = new EnumExample();
		
		e.printSeasons();
		
		// Converting String to Enum
		Season season = Season.valueOf("SUMMER");

		// Converting Enum to String
		System.out.println(season.name());// FALL

		// Default ordinals of enum
		// By default java assigns ordinals in order
		//System.out.println(Season.WINTER.ordinal());// 0
		//System.out.println(Season.SPRING.ordinal());// 1
		//System.out.println(Season.SUMMER.ordinal());// 2
		//System.out.println(Season.FALL.ordinal());// 3

		// Comparing two Enums
		Season season1 = Season.FALL;
		Season season2 = Season.FALL;
		//System.out.println(season1 == season2);// true
		//System.out.println(season1.equals(season2));// true
		
		System.out.println(Season.WINTER);
		

	}

}
