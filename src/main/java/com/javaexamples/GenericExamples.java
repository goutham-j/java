package com.javaexamples;
import java.util.*;

class MyListGeneric<T> { 
	
	private List<T> values = new ArrayList<T>();
	
	void add(T value) { 
		values.add(value);
	}
	
	void remove(T value) { 
		values.remove(value);
	}
	
	T get(int index) {
		return values.get(index);
	}
	
	int getSize() {
		return values.size();
	}
}

public class GenericExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyListGeneric<String> myListString = new MyListGeneric<String>(); 
		myListString.add("Apple");
		myListString.add("Orange");
		for (int i=0;i<myListString.getSize();i++) {
			System.out.println(myListString.get(i));
		}
		
		MyListGeneric<Integer> myListInteger = new MyListGeneric<Integer>(); 
		myListInteger.add(1);
		myListInteger.add(2);
		for (int i=0;i<myListInteger.getSize();i++) {
			System.out.println(myListInteger.get(i));
		}
		
	}
}
