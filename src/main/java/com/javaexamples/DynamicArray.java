package com.javaexamples;

import java.util.*;

public class DynamicArray {
	
	public static void main(String[] args) {
		
        int arr[] = {1, 2, 3, 4, 5}; //static array
        
        System.out.print("Static Array Elements Are - ");
        for (int i=0;i < 5;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        
	    Scanner inp = new Scanner(System.in); 
	    System.out.print("Enter the dynamic array size: ");

	    int size = inp.nextInt();
        int darr[] = new int[size]; //dynamic array
        
        for (int i=0;i < darr.length ;i++)
            darr[i] = i * 10;
            
        System.out.print("Dynamic Array Elements Are - ");
        for (int i=0;i < darr.length ;i++)
            System.out.print(darr[i] + " ");
        System.out.println();
	}
	
}