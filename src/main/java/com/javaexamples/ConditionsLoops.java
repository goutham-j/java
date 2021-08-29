package com.javaexamples;

public class ConditionsLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// following if has only 1 nested statement (the next if)
		// will not print anything as the first condition didn't pass
		int m = 15;
		if (m > 20)
			if (m < 20)
				System.out.println("m>20");
			else
				System.out.println("Who	am	I?");
		
		// will print 2, 3, Default because of no break (free flow)
		int	number	=	2;
		switch (number)	{
		case 1:
			System.out.print(1);
		case 2:
			System.out.print(2);
		case 3:
			System.out.print(3);
		default:
			System.out.println("Default");
		}
		
		// will print dog. Java 5 allows string & enum also part of switch
		String	str	=	"dog";
		switch (str)	{
		case "cat":
			System.out.println("cat");
			break;
		case "dog":
			System.out.println("dog");
			break;
		default:
			System.out.println("Default");
		}
		
		// will print 0, -1, -2, ....
		for (int i=0,j=0; i<10; i++,j--) {
			System.out.print(j);
		}
		System.out.println();
		
		// will print 1,2,3,4,5
		int[] numbers =	{1,2,3,4,5};
		for(int i:numbers){
			System.out.print(i);
		}

	}

}
