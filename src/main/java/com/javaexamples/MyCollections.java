package com.javaexamples;
import java.util.*;

public class MyCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = Arrays.asList("a", "b", "c"); //convert array into a collection
		System.out.println(strList);
		
		String[] strArray = strList.toArray(new String[3]); //convert collection into an array
		String contents = new String();
	    for(int i = 0; i< strArray.length; ++i) {
	    	contents += strArray[i] + " ";
	    }
		System.out.println(contents);
		
		List<Integer> intList = new ArrayList<Integer>(); // List of integers
		intList.add(5);
		intList.add(2);
		intList.add(12);
		System.out.println(intList);
		intList.remove(1);
		System.out.println(intList);
		
		LinkedList<String> strLinkedList = new LinkedList<String>(); //Linked List of Strings
		
		strLinkedList.add("Chennai");
		strLinkedList.add("Delhi");
		strLinkedList.add("Mumbai");
		System.out.println(strLinkedList);
		System.out.println(strLinkedList.getFirst());
		strLinkedList.remove(2);
		
	    String[] coins = { "Zebra", "Apple", "rat", "Ball", "Elephant"};
	    Set<String> set = new TreeSet<String>(); //TreeSet of Strings
		
		for (int i = 0; i < coins.length; i++)
			set.add(coins[i]);
		System.out.println("Min: " + Collections.min(set) + ", Max: " + Collections.max(set));
		
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>(); //TreeMap of Integer & Strings
		
		tMap.put(0, "Dhoni");
		tMap.put(1, "Kholi");
		tMap.put(2, "Raina");
		System.out.println("TMap Key Sets: " + tMap.keySet() + ",TMap Values: " + tMap.values());
		
	}

}
