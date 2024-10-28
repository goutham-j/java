package com.javaexamples;
import java.io.*;
import java.util.*;

public class ArrayVsList
{
	public static void main(String[] args) {

		int arr[] = new int[6]; // array size is static
		List<Integer> arrList = new ArrayList<Integer>(); // list can grow dynamically

		System.out.println("***** Array *****");
		for (int i = 0; i < 5; i++)
			arr[i] = i; // array element to be accessed by index
		//System.out.println(arr); // cannot print array directly
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();

		System.out.println("***** Array List *****");
		for (int i = 1; i <= 5; i++)
			arrList.add(i*2);
		arrList.add(5,100); // add directly at an index
		
		System.out.println(arrList); // can print array list directly
		arrList.remove(3); // remove an element at index 3
		System.out.println(arrList);

	}
}