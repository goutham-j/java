package com.javaexamples;

public class StringPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "J " + "Goutham" ;
		String str2 = "Gladwin";
		String str3 = new String ("Sherin");
		
		for (int i=1;i<10;i++) {
			str1 = str1 + " " + str2;
			System.out.println("The String is: " + str1);
		}
		System.out.println("The String is: " + str3);

	}

}
