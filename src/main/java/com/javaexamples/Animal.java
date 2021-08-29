package com.javaexamples;

public class Animal {

	private String name;
	
	
	public Animal () { //no argument - default constructor
		System.out.println("Default constructor called");
	}
	
	public Animal (String name) { //constructor accepting a string value
		System.out.println("String constructor called");
		this.name = name;
	}
	
	public Animal (Integer integer) { //constructor accepting an integer value
		System.out.println("Integer constructor called");
		this.name = integer.toString();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal camel = new Animal();
		camel.setName("camel");
		System.out.println(camel.getName());
		
		System.out.println();
		
		Animal dog = new Animal("dog");
		System.out.println(dog.getName());
		
		System.out.println();
		
		Animal cat = new Animal(10);
		System.out.println(cat.getName());
		
	}
}
