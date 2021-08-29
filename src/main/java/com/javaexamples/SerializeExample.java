package com.javaexamples;

import java.io.*;

class Rectangle implements Serializable	{
	
	int length, breadth, area;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		area = length * breadth;
	}
}

public class SerializeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
        String myfile = "/Users/goutham/eclipse-workspace/myscript.abc";
        
        try {    
        	FileOutputStream fileOutputStream = new FileOutputStream(myfile);
    		ObjectOutputStream objectStream = new ObjectOutputStream(fileOutputStream);
    		
    		objectStream.writeObject(new Rectangle(5, 6)); //write an object
    		objectStream.close();  

        } catch(Exception e){
        	System.out.println(e); 
        }
        
        try {    
    		FileInputStream fileInputStream	= new FileInputStream(myfile);
    		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    		
    		Rectangle rectangle = (Rectangle) objectInputStream.readObject(); //read an object
    		objectInputStream.close();
    		
    		System.out.println(rectangle.length);	// 5
    		System.out.println(rectangle.breadth);	// 6
    		System.out.println(rectangle.area);		// 30
    		
         } catch(Exception e){
        	 System.out.println(e); 
         } 

	}

}
