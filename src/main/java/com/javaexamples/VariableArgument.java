package com.javaexamples;

public class VariableArgument {
	
	//Method with a variable argument is similar to an array
	public int sum(int... numbers){	
		//numbers can be treated as if it is declared as int[] numbers;
		int sum	= 0;
		for (int number: numbers) {
			sum	+= number;
		}
		return sum;
	}
	
	// Can pass multiple arguments but last argument should be variable
	public int sum(String str, int... numbers){	

		int value=0;
		for (int number: numbers) {
			value	+= number;
		}
		return value;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableArgument va	= new VariableArgument();
		//3	Arguments
		System.out.println(va.sum(10, 4, 15));
		//4	Arguments
		System.out.println(va.sum(7, 24, 18, 31, 57));
		//0	Arguments
		System.out.println(va.sum());//0

	}

}
