package com.nbna.jdbc;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.PreparedStatement;

public class RetrieveStudentInfoDAO {

	private Connection conn = null;
	private String url ;
	private String dbName ;
	private String driver ;
	private String userName ; 
	private String password ;	
	
	RetrieveStudentInfoDAO(){
		this.url = "jdbc:mysql://localhost:3306/";
		this.dbName = "nbna_database";
		this.driver = "com.mysql.jdbc.Driver";
		this.userName = "root"; 
		this.password = "sriram1408";
	}
	public ArrayList getStudentList(){		
	
		System.out.println("getStudentList called..");				
		ArrayList studentList =new ArrayList();
		Student student = null;
		
		
		PreparedStatement ps;
		try {

			Class.forName(driver).newInstance(); 
			System.out.println("Registering driver with driver manager");
			
			conn = DriverManager.getConnection(url+dbName,userName,password);
			System.out.println("Connected to the database");		

			String query = "Select * from students";
			ps =  conn.prepareStatement(query);
			System.out.println("Created a prepared statement");
			
			System.out.println("Performing query:" + query + "....");
			ResultSet rs = ps.executeQuery();
			System.out.println("Performed query sucessfully now iterating through the result set" + rs);
			
			while (rs.next()) {
								
				student = new Student();
				student.setRollno(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setQuant(rs.getInt(3));
				student.setVerbal(rs.getInt(4));
				student.setTotal(rs.getInt(5));				
				
				System.out.println("Student :: " + student);
				studentList.add(student);
			}
			
			rs.close();
			ps.close();

		} catch (SQLException e) {
			System.out.println("SQL Exception occured");
		} catch (Exception e) {
			System.out.println("Unknown Exception occured");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println("Exception occured while closing file");
			}
		}
			
		return studentList;
	}		
}

