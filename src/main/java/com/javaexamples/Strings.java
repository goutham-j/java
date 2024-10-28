package com.javaexamples;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Strings {
	
	// concatnate 2 strings
	static String concat(String s1, String s2) {
		String temp = new String();
		char ch;
		int i;

		// add each char of s1 to temp
		for (i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i); //extracts character at an index
			temp = temp + ch;
		}
		    
		// add each char of s2 to temp
		for (i = 0; i < s2.length(); i++) {
			ch = s2.charAt(i); //extracts character at an index
			temp = temp + ch;
		}
		return temp;
	}
		
	// print only the even words in a sentence
	static void evenWords(String sentence) {
		int i, j, wordsize; 
		    
		//split string by multiple delimiters   
		String[] words = sentence.split(" ");   
	 
		for(i = 0; i < words.length; i++)  {  
			wordsize = 0; //initialize each time word size to 0 
			for (j = 0; j < words[i].length(); j++) {
				wordsize++; //increse the size for each char
			}
	            
			if (wordsize % 2 == 0) { //print only if the word size is even
				System.out.println("Word <" + words[i] + "> has even chars");               
			}   
		}  
	}
		
	// sort a string
	static String sort(String s)
	{
		char sArray[] = s.toCharArray(); //convert the string to a char array
	        
		Arrays.sort(sArray); // sort the char arracy
		return new String(sArray); // return the sorted string
	}
		
	// find if a string is a palindrome
	static Boolean isPalindrome(String str) {
		Boolean isPal  = true;
		int i, j;

		int str_middle = str.length()/2; 
	        
		//i will ascend from first char; j will descend from last char
		i = 0; j = str.length()-1;
	        
		// compare the characters at i & j 
		while (i <= str_middle) {
			if (str.charAt(i) != str.charAt(j)) {
				isPal = false; // no match no palindrome
				break;
			}
			i++; j--; // increment i and decrement j
		}
		return isPal;
	}

		
	// check if two strings are anagrams
	static Boolean areAnagrams(String s1, String s2){
		// use your sort function to sort the strings
		String t1 = sort(s1);
		String t2 = sort(s2);
	    
		// return true if s1 equals s2
		return (t1.equals(t2));
	}
	    
	// reverse words using for loop
	static String reverseWords(String s) {

		//split the sentence on blank space
		String words[] = s.split("\\s");
		String rWord = "";
		int i;
			
		for (i = words.length-1; i >= 0; i--) { 
			rWord += words[i] + " "; 
		}
		     
		rWord = rWord.substring(0, rWord.length() - 1); //remove the empty char at the end
		    
		return rWord;
	}

	public static void main(String[] args) {
		
		String s1 = "malayalam";
		String s2 = " is a beautiful language";
		String s3 = "I love Java programming";
		String s4 = "listen";
		String s5 = "silent";
		    
		System.out.println("***** Concat ******");
		System.out.println(concat(s1, s2));
		    
		System.out.println("\n***** Even Words ******");
		System.out.println("Given sentence is '" + s3 + "'");
		evenWords(s3);
			
		System.out.println("\n***** Sort a String ******");
		System.out.println("String = " + s1);
		System.out.println("Sorted String = " + sort(s1));
			
		System.out.println("\n***** Palindrome ******");
		if (isPalindrome(s1))
			System.out.println(s1 + " is a palindrome");
		else
			System.out.println(s1 + " is not a palindrome");
		
		System.out.println("\n***** Anagrams ******");
		if (areAnagrams(s4, s5))
			System.out.println(s4 + " & " + s5 + " are Anagrams");
		else
			System.out.println(s4 + " & " + s5 + " are not Anagrams");
			      
		System.out.println("\n***** Reverse Words ******");
		System.out.println("The reversed wordS of '" + s3 + "' is '" + reverseWords(s3) + "'");

	}
}
