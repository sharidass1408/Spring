package com.nbna.springJDBC;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.PreparedStatement;

import javax.sql.DataSource;
import javax.sql.RowSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component //This annotation registers this class as a component.
public class InsertStudentInfoDAO {

	 
	//private DataSource dataSource;	
	private Connection conn = null;		
	private JdbcTemplate jdbcTemplate;
	
	
	
	/*public DataSource getDataSource() {
		return dataSource;
	}*/

	@Autowired
	public void setDataSource(DataSource dataSource) {
		//this.dataSource = dataSource; //Note: That once we use JDBC template the program does not require DataSource 
		System.out.println("The value of dataSouce is instantiated by spring container and injected to setDataSource");
		
		this.jdbcTemplate= new JdbcTemplate(dataSource);
		
		//System.out.println(" Note that we are not using the spring instantiated dataSource object to the \n Member variable Datasource, instead we are using it to create a new " +
		//		"JdbcTemplate,\n and this generated JdbcTemplate is getting assigned to Member variable jdbcTemplate");
	}	
	
	public void insertStudentInfo(Integer rollno, String name, int quant, int verbal){		
	
		   int total = quant+verbal;
		
			String query = "Insert into students (rollno,name,quant,verbal,total) values (?,?,?,?,?)";
			
			//All our code has reduced to below line.
			jdbcTemplate.update(query, new Object[]{rollno,name,quant,verbal,total});
			
			
			
		    System.out.println("Sucessfully inserted " +name+ " info");
		
	}		
		
}
