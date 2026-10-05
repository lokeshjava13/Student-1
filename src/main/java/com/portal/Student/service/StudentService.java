package com.portal.Student.service;

import java.util.List;



import com.portal.Student.model.StudentLokesh;


public interface StudentService {
	
	
	StudentLokesh save_Student(StudentLokesh s);
	
	StudentLokesh getStudent(Integer id);
	
	List<StudentLokesh>getAllstudent();
	
	StudentLokesh updateStudent(Integer id,StudentLokesh s);
	
	void deleteStudent(Integer id);

//	StudentLokesh saveStudent(StudentLokesh s);
	
	 
	
	

}
