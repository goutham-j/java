package com.javaexamples;

class Employee {
	public Employee() {
		System.out.println("Employee Constructor");
	}
}

class Engineer extends Employee {
	public Engineer() {
		System.out.println("Engineer Constructor");
	}
}

class Developer extends Engineer	{
	public Developer() {
		System.out.println("Developer Constructor");
	}
}

public class ConstructorExamples {
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println("----------------------------");
		Engineer engineer =	new Engineer();
		System.out.println("----------------------------");
		Developer developer = new Developer();
		

	}
}