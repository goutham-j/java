package com.javaexamples;

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.sql.Statement;


public class JDBCExample {

	Connection con; 
	String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/";
    String dbname = "shapes";
    String username = "demo";
    String password = "demo";
	
    public JDBCExample() throws Exception {
    	
        try { 
        	Class.forName(driver); 
        	con = DriverManager.getConnection(url+dbname, username, password);
        	System.out.println("Connection successfully opened " + url);
        } 
        catch (Exception e) { 
        	System.out.println(e.toString()); 
        }	
    }
    
    public void readRequest(String dbQuery) {
    	int count=0;
        
    	System.out.println("Reading all records from " + dbname);
        try {
            Statement stmt = con.createStatement();
            
            // select query
            ResultSet rs = stmt.executeQuery(dbQuery);
            
            while(rs.next()){
            	count++;
            	System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("Total records available " + count); 
    }
    

    public void writeRequest(String dbQuery) {
    	
    	System.out.println("Writing a new record into " + dbname);
        try {
            Statement stmt = con.createStatement();
            
            // Update query
            int count = stmt.executeUpdate(dbQuery);
            System.out.println(count + " record written to " + dbname);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void terminate() {
        // close connection
        try {
            con.close();
            System.out.println("Connection is closed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] arg)throws Exception{
    	
    	String writeQuery = "INSERT into RECTANGLE (length,breadth,area) VALUES (5,6,30)";
    	String readQuery = "SELECT * from RECTANGLE";
    	
    	JDBCExample db = new JDBCExample();
   
        //db.writeRequest(writeQuery);
        db.readRequest(readQuery);
        db.terminate();
    }
}


