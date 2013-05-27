/**
 * The purpose of this project is to demo how DAO pattern is used. 
 */

package com.nbna.DAOpattern2;
/*
 * This is an example where we are encapsulating the logic to get connection thus abstracting calls to database
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract  class DatabaseAccessor {
	
    private Connection conn = null;
	private String url;
	private String dbName;
	private String driver;
	private String userName; 
	private String password;		
	/*
	 * To Demo constructor chain usage. 
	 */
	public DatabaseAccessor() {	
		System.out.println("Default constructor of DatabaseAccessor got called");
		this.url = "jdbc:mysql://localhost:3306/";
		this.dbName = "nbna_database";
		this.driver = "com.mysql.jdbc.Driver";
		this.userName = "root"; 
		this.password = "sriram1408";
		this.conn = this.getConnection();
		System.out.println("Sucessfully got the connection and set the value to connection feild variable");
	}
	
	
	private Connection getConnection(){
		
		System.out.println("Attempting connection...");
			
			try {
				Class.forName(driver).newInstance();
				System.out.println("connection info:"+this.url+this.dbName+" "+this.userName+" "+this.password);
				return DriverManager.getConnection(this.url+this.dbName,this.userName,this.password);
			} catch (InstantiationException ine) {
				System.out.println("InstantiationException exception occured: ");
				ine.printStackTrace();
			} catch (IllegalAccessException ile) {
				System.out.println("IllegalAccessException exception occured: ");
				ile.printStackTrace();
			} catch (ClassNotFoundException cnfe) {
				System.out.println("ClassNotFoundException exception occured: ");
				cnfe.printStackTrace();
			} catch (SQLException e) {
				System.out.println("Unknown exception occured: ");
				e.printStackTrace();
			}
			
			return null;	
			 
	} 

	abstract protected String getQuery();
	
	protected ResultSet performQuery(){
		
		String query = this.getQuery();
		Statement st;
		try {
			System.out.println("Performing Query..... "+query);
			st = this.conn.createStatement();			
			ResultSet rs = st.executeQuery(query);
			System.out.println("Sucessfully executedQuery");
			return rs;
		} catch (SQLException e) {
			System.out.println("SQLException Occured in DatabaseAccessor");
		}catch (Exception e) {
			System.out.println("Unknown Exception Occured");
		}finally{
			/*try {
				conn.close();				
			} catch (SQLException e) {
				System.out.println("Execption occured while closing connection");
				e.printStackTrace();
			}*/
			System.out.println("Note: Should not close connection here...");
		}
		
		return null;
		
	}
	
	abstract protected String getProcessResults();
	
	
	
	protected boolean performCleanUp(){
		
		try {
			conn.close();
			return true;
		} catch (SQLException e) {
			System.out.println("Execption occured while closing connection");
			e.printStackTrace();
		}
		
		return false;
	}
}
