package com.nbna.DAOpattern2;

import java.util.ArrayList;



public class Test {

public static void main(String[] args) {
		
		ListAllStudentsDAO listofStudents = new ListAllStudentsDAO();		
		System.out.println("Back to Test class after intializing ListAllStudentDAO");			
		
		System.out.println("Calling the getProcessResults method on the object of ListAllStudentsDAO");		
		listofStudents.getProcessResults();
		
	}

}
