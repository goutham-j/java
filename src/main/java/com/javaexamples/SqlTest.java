package com.javaexamples;

import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlTest {

	public static void main(String [] args) throws Exception {
		
		Connection con; 
		String driver = "com.mysql.cj.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/";
	    String dbname = "shapes";
	    String username = "demo";
	    String password = "demo";
	    Integer length = 3, breadth = 3, area = 9;
	    
	    String selectAllQuery = "SELECT * from rectangle";
	    String select3Query = "SELECT * from rectangle LIMIT 3";
	    String insertQuery = "INSERT into rectangle (length,breadth,area) VALUES (5,6,30)";
	    String updateQuery = "UPDATE rectangle SET length = ?, breadth = ?, area = ? WHERE area = 12";
	    String deleteQuery = "DELETE FROM rectangle LIMIT 1";

	    Statement st;
	    ResultSet rs;
	    PreparedStatement ps;
		
	    Connection conn = DriverManager.getConnection(url+dbname,username, password);
	    st = conn.createStatement();
	    
	    //delete query
	    st.executeUpdate(deleteQuery);
	   
	    //update query
	    ps = conn.prepareStatement(updateQuery);
	    // set the prepared statement parameters
	    ps.setInt(1,length);
	    ps.setInt(2,breadth);
	    ps.setInt(3,area);
	    ps.executeUpdate();
	    
	    //insert query
	    st.executeUpdate(insertQuery);
	    
	    //select query & print records
	    int count = 0;
	    rs = st.executeQuery(selectAllQuery);      
        while(rs.next()){
        	count++;
        	System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
        System.out.println("Total records available " + count); 
        
	    //ps.close();
        st.close();
        conn.close();
	}
}
