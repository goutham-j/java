package com.javaexamples;
import java.util.*;

public class ReverseWords {
	
	// reverse words using for loop
	public String reverseWordsFor(String s) {

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
	
	// reverse words using for loop
	public String reverseWordsStack(String s) {

		//split the sentence on blank space
		String words[] = s.split(" ");
		String rWord = "";
		Stack<String> wordStack = new Stack<>();
		
		for (String w:words) { 
			wordStack.push(w); 
		}
		
        while (!wordStack.isEmpty()) { 
        	rWord += wordStack.pop() + " "; 
        }
	     
        rWord = rWord.substring(0, rWord.length() - 1); //remove the empty char at the end
	    return rWord;
	}
	
	public String reverseWordsArray(String s) {
		
		String word = "";
		String rWord = "";
		Stack<String> wordStack = new Stack<>();
		int i;
		
		for (i=0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				wordStack.push(word);
				word = "";
			} else {
				word = word + s.charAt(i);
			}
		}
		wordStack.push(word);
		
        while (!wordStack.isEmpty()) {
        	rWord += wordStack.pop() + " ";
        }
        
        rWord = rWord.substring(0, rWord.length() - 1); //remove the empty char at the end
        
	    return rWord;
	}

	public static void main(String[] args) {
		String tmp;
		String str = "I love Java programming";
		ReverseWords rs = new ReverseWords();
		
		System.out.println("Original String: " + str + ", Size: " + str.length());
		tmp = rs.reverseWordsFor(str);
		System.out.println("Reversed String - For  : " + tmp + ", Size: " + tmp.length());
		tmp = rs.reverseWordsStack(str);
		System.out.println("Reversed String - Stack: " + tmp + ", Size: " + tmp.length());
		tmp = rs.reverseWordsArray(str);
		System.out.println("Reversed String - Array: " + tmp + ", Size: " + tmp.length());

	}

}
