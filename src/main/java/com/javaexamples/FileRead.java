package com.javaexamples;

import java.io.*;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String myfile = "/Users/goutham/eclipse-workspace/myscript.abc";

        File file1 = new File(myfile);
        
        if (file1.exists()) {
            System.out.println("File " + myfile + " exists. length : " + myfile.length());
        } else {
        	System.out.println("File " + myfile + " does not exist!");
        }
	}

}
