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
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.rowset.ResultSetWrappingSqlRowSet;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


public class InsertStudentInfoUsingJdbcDAOSupport  extends JdbcDaoSupport{	 
	
	
	public void insertStudentInfo(int rollno, String name, int quant, int verbal){		
	
		   int total = quant+verbal;
		
			String query = "Insert into students (rollno,name,quant,verbal,total) values (?,?,?,?,?)";			
			
			this.getJdbcTemplate().update(query, new Object[]{rollno,name,quant,verbal,total});			
		    
			System.out.println("Sucessfully inserted " +name+ " info");
		
	}		
		
}
