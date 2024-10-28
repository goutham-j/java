package com.javaexamples;

import java.io.*;
import java.util.*;

/* 
 * List is an interface implemented by Array List, Linked List & Vector
 * Program to demostrate Array List, Linked List & Vector
 */

public class ListInterface {

	public static void main(String[] args)
	{
		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> linkList = new LinkedList<Integer>();
		Vector<Integer> vecList = new Vector<Integer>();

		// Array List
		System.out.println("***** Array List *****");
		for (int i = 1; i <= 5; i++)
			arrList.add(i);
		System.out.println(arrList);
		arrList.remove(3); // Removing an element at index 3
		System.out.println(arrList);

		for (int num : arrList) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Linked List
		System.out.println("***** Linked List *****");
		for (int i = 1; i <= 5; i++)
			linkList.add(i*2);
		linkList.add(5, 100);
		System.out.println(linkList);

		linkList.remove(2); // Removing an element at index 2
		System.out.println(linkList);

		for (int num : linkList) {
			System.out.print(num + " ");
		}
		System.out.println();

		// Vector
		System.out.println("***** Vector *****");

		for (int i = 1; i <= 5; i++)
			vecList.addElement(i*5);
		System.out.println(vecList);
		vecList.insertElementAt(500, 1);
		vecList.removeElementAt(2);
		System.out.println(vecList);

		for (int num : vecList) {
			System.out.print(num + " ");
		}
		System.out.println();

	}
}
