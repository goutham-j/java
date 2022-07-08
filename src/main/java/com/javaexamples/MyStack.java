package com.javaexamples;
import java.util.*;

public class MyStack {
	
	int 		maxSize;
	int[] 		stackContent;
	static int 	top;
	
	
	public MyStack(int maxSize) {
		this.maxSize = maxSize;
		this.stackContent = new int[maxSize];
		this.top=-1;
	}
	
	void push(int val) {
		stackContent[++top] = val;
	}
	
	int pop() {
		return stackContent[top--];
	}
	
	int getMaxSize() {
		return maxSize;
	}
	
	@Override
	public String toString() {
		String str = "";
		if (top>-1) {
			for (int i=0; i<=top; i++) {
				str += String.valueOf(stackContent[i]) + " ";
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		MyStack s = new MyStack(5);
		
		s.push(5);
		s.push(10);
		s.push(3);
		System.out.println(s);
		int val = s.pop();
		System.out.println("Popped out value is " + val);
		val = s.pop();
		System.out.println("Popped out value is " + val);
		s.push(4);
		System.out.println(s);

	}
	
}