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

@Component 
/*This annotation registers this class as a component. The effect of doing this is that 
 when you say ctx.getBean("retrieveStudentInfoDAO",  RetrieveStudentInfoDAO.class); it automatically creates
 an instance of this class.
*/
public class RetrieveStudentInfoDAO {

	 
	private DataSource dataSource;	
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
	
	public ArrayList getStudentList(){		
	
		System.out.println("\n getStudentList called..");				
		ArrayList studentList =new ArrayList();
		Student student = null;
								
			//All the lines that go here are deleted.	
			
			ArrayList studentlist = new ArrayList();

			String query = "Select * from students";
			
			//All our code has reduced to below line.
			
			ResultSetWrappingSqlRowSet ar =  (ResultSetWrappingSqlRowSet) jdbcTemplate.queryForRowSet(query);
			
			while (ar.next()) {				
				student = new Student();
				student.setRollno(ar.getInt(1));
				student.setName(ar.getString(2));
				student.setQuant(ar.getInt(3));
				student.setVerbal(ar.getInt(4));
				student.setTotal(ar.getInt(5));				
				System.out.println("Student :: " + student);
				studentlist.add(student);				
			}
					
		return studentlist;
	}		
		
}

