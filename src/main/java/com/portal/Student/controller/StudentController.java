package com.portal.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.Student.model.StudentLokesh;
import com.portal.Student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService studentService;

//	@PostMapping("/cs")
//	StudentLokesh createStudent(@RequestBody StudentLokesh s){
//		
//			return  studentService.save_Student(s);
//		 
//	 }

	@GetMapping("/msg")
	String hello() {
		return "Heyy....!!";
	}

//	http://localhost:7672/student/csu
	@PostMapping("/csu")
	StudentLokesh createStudentdata(@RequestBody StudentLokesh s) {

		return studentService.save_Student(s);
	}
	
	@GetMapping("/getone/{sid}")
	public StudentLokesh getoneStudent(@PathVariable("sid")Integer id) {
		return studentService.getStudent(id);
	}

	@GetMapping("/allStu")
	List<StudentLokesh>  getAllStu(){
		return studentService.getAllstudent();
	}
	@PutMapping("update/{sid}")
	public StudentLokesh updatestu(@PathVariable("sid") Integer sid,@RequestBody StudentLokesh s) {
		return studentService.updateStudent(sid, s);
		
	}
		
	    @DeleteMapping("/delete/{sid}")
	   public String deleteStudent(@PathVariable("sid") Integer sid) {
	        studentService.deleteStudent(sid);
	        return "Deleted successfull student:" + sid;
	    }
	    
	    
	
}
