package com.javaexamples;
import java.util.*;

public class ReverseWords {
	
	public String reverseWords(String s) {

		String words[] = s.split(" ");
		String rWord = "";
		Stack<String> wordStack = new Stack<String>();
		
		for (String w:words) { wordStack.push(w); }
		
        while (!wordStack.isEmpty()) { rWord += wordStack.pop() + " "; }
	     
	    return rWord;
	}

	public static void main(String[] args) {
		String str = "My name is Goutham";
		
		System.out.println("Original String: " + str);
		ReverseWords rs = new ReverseWords();
		System.out.println("Reversed String: " + rs.reverseWords(str));

	}

}
