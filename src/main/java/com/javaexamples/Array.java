package com.javaexamples;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks1[] = {25, 30, 50, 78, 5};
		System.out.print("[");
		for (int mark:marks1)	{
			System.out.print(mark + ", ");
		}
		System.out.println("]");

		int marks2[] = {87, 9, 65, 37, 83};
		//System.out.println(marks2); // [I@6db3f829
		System.out.println(Arrays.toString(marks2));// [25, 30, 50, 10, 5]
		
		//[[1,	2,	3],	[4,	5,	6]]
		int[][]	matrix3	=	{{1,2,3}, {4,5,6}};
		//System.out.println(matrix3);	//[[I@1d5a0305
		//System.out.println(Arrays.toString(matrix3));	//[[I@6db3f829,	[I@42698403]
		System.out.println(Arrays.deepToString(matrix3));	
		
		//System.out.println(matrix3[0]);//[I@86c347
		System.out.println(Arrays.toString(matrix3[0]));//[1,	2,	3]
		
		int[] numbers1 = {1, 2, 3};
		int[] numbers2 = {4, 5, 6};
		int[] numbers3 = {1, 2, 3};
		
		System.out.println(Arrays.equals(numbers1,numbers2));	//false
		System.out.println(Arrays.equals(numbers1,numbers3));	//true

	}

}
