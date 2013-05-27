package com.nbna.DAOpattern2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListAllStudentsDAO extends DatabaseAccessor{

	
	protected String getQuery() {
		String query = "Select * from students";
		return query;
		}	

	
	protected String getProcessResults() {
		ArrayList studentList =new ArrayList();
		ArrayList student = null;
		ResultSet result= super.performQuery();
		System.out.println("Sucessfully Performed query in the DAO, Processing results from rs: "+result);
		try {
			
			while (result.next()) {
				student = new ArrayList();

				student.add(result.getInt(1));
				student.add(result.getString(2));
				student.add(result.getInt(3));
				student.add(result.getInt(4));
				student.add(result.getInt(5));
				System.out.println("Student :: " + student);
				studentList.add(student);
			}
		} catch (SQLException e) {
			System.out.println("SQLException occured in ListAllStudentDAO");
		}finally{
			boolean check= this.performCleanUp();
			System.out.println("Closed the connection: "+ check);
		}
		
		return null;
	}
	
	
	
	
}
