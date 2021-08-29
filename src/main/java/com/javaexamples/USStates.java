package com.javaexamples;

import java.util.*;

enum Element {
    H("Hydrogen"),
    HE("Helium"),
    NE("Neon");

    private final String label;

    private Element(String label) {
        this.label = label;
    }
    
    public String getName() {
        return label;
    }
}

public class USStates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Element.H.getName());	// Prints "Hyrdogen"
		System.out.println(Element.HE);             // Prints "HE"

	}

}