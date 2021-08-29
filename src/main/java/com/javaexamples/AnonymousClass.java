package com.javaexamples;

import java.util.Arrays;
import java.util.Comparator;

class Table {
	void leg() {
		System.out.println("Class: Table has leg");
	}
};

public class AnonymousClass {

	private static String[] reverseSort(String[] array) {

		Comparator<String> reverseComparator = new Comparator<String>() {
			/* First type of Anonymous Class */
			public int compare(String string1, String string2) {
				return string2.compareTo(string1);
			}

		};

		Arrays.sort(array, reverseComparator);

		return array;
	}

	public static void main(String[] args) {

		String[] array = { "Apple", "Boy", "Cat"};

		System.out.println(Arrays.toString(array));	
		// reversed
		System.out.println(Arrays.toString(reverseSort(array)));
		

		/* Second type of Anonymous Class */
		Table table = new Table() {
			void leg() {
				System.out.println("Subclass: Table has leg");
			}
		};

		table.leg();// Subclass leg

	}

}