package com.javaexamples;

import java.util.*;
import java.util.stream.Collectors;

class MyCricketer implements Comparable<MyCricketer> {
	
	String name;
	int	runs;
	
	public MyCricketer(String name, int runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	
	//@override
	public String toString() {
		return name + " " + runs;
	}
	
	//@override
	public int compareTo(MyCricketer that) {
		if (this.runs > that.runs)
			return 1;
		else if (this.runs < that.runs)
			return -1;
		else
			return 0;
	}
	
}

public class CollectionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// integer list
		List<Integer> integers = new ArrayList<Integer>();
		
		integers.add(0,45);
		integers.add(1,5);
		integers.add(10);
		integers.add(2,18);
		integers.add(5);
		System.out.println("Number at index 1: " + integers.get(1));
		System.out.println("Number of items with 5 = " + Collections.frequency(integers,5));
		
		// string list
		List<String> batsmen = new ArrayList<String>();
		
		batsmen.add("Dhoni");
		batsmen.add(1,"Sachin");
		batsmen.add("Kohli");
		
		System.out.println("Kohli's index: " + batsmen.indexOf("Kohli"));
		
		// print a list
		System.out.println(batsmen);
		
		String strBatsmen = "";
		// concatenate list members to a string using for loop
		for (String s : batsmen){
			strBatsmen += s + ":";
		}
		System.out.println(strBatsmen);
		
		// concatenate list members to a string
		strBatsmen = String.join("-", batsmen);	
		System.out.println(strBatsmen);

		// iterate using while loop
		Iterator<String> batsmenIterator = batsmen.iterator();
		while (batsmenIterator.hasNext()) {
			String str = batsmenIterator.next();
			System.out.print(str + " ");
		}
		System.out.println();
		
		// more operations on list
		batsmen.remove(1);
		batsmen.remove("Dhoni");
		batsmen.add(0,"Rohit");
		Collections.sort(batsmen);
		
		
		// iterate using for loop
		for (int i=0;i<batsmen.size();i++) {
			System.out.print(batsmen.get(i) + " ");
		}
		System.out.println();
		
		// list of Cricketers
		List<MyCricketer> cricketers = new ArrayList<MyCricketer>();
		cricketers.add(new MyCricketer("Bradman", 9996));
		cricketers.add(new MyCricketer("Sachin", 14000));
		cricketers.add(new MyCricketer("Dravid", 12000));
		cricketers.add(new MyCricketer("Ponting", 11000));
		System.out.println(cricketers);
		
		// concatenate list members of NOT string type to a string
		String strCricketers = cricketers.stream().map(Object::toString).collect(Collectors.joining(" : "));
		System.out.println(strCricketers);
		
	}

}
 