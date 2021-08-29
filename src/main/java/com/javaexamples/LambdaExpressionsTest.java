package com.javaexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpressionsTest {

	//Usual function to add odd numbers
	public void sumOfOddNumbers_Usual() {
		
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
	
		int sum = 0; 
		
		for (int number : numbers) {
			if (number % 2 != 0)
				sum += number; 
		}
		System.out.println(sum);
		
	}

	//No changes to state
	public void sumOfOddNumbers_Functional() {
		
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		
		// number -> (number % 2 != 0) => Lambda Expression
		// Integer::sum => Method Reference
		// What is Functional Interface

		int sum = numbers.stream() // Create Stream
				.filter(number -> (number % 2 != 0)) // Intermediate Operation
				.reduce(0, Integer::sum); // Terminal Operation
	
		System.out.println(sum);

	}

	public void lambdaExpression_predicate() {
		
		List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
		
		numbers.stream()
			.filter(number -> (number % 2 != 0)) //Predicate
			.forEach(number -> System.out.print(number)); //Consumer
		System.out.println();// 137

	}
	
	static boolean isOdd(int number) {
		return number % 2 != 0;
	}
	
   int i = 100_00_00;
	
	//.map(String::toLowerCase)
	//.map(s -> String.toLowerCase(s))
	
	public static void main(String[] args) {
		
		LambdaExpressionsTest let = new LambdaExpressionsTest();
		
		let.sumOfOddNumbers_Usual();
		let.sumOfOddNumbers_Functional();
		let.lambdaExpression_predicate();
		System.out.println(let.isOdd(72));
	}
}
