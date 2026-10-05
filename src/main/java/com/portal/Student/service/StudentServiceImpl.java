package com.portal.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portal.Student.model.StudentLokesh;
import com.portal.Student.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo studentRepo;

	@Override
	public StudentLokesh save_Student(StudentLokesh s) {
		// TODO Auto-generated method stub
		return studentRepo.save(s);
	}

	@Override
	public StudentLokesh getStudent(Integer id) {
		// TODO Auto-generated method stub
		
		return studentRepo.findById(id).orElse (null);
	}

	@Override
	public List<StudentLokesh> getAllstudent() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	
    public StudentLokesh updateStudent(Integer id, StudentLokesh newData) {
        StudentLokesh old = studentRepo.findById(id).orElse(null);
        if(old != null){
            old.setName(newData.getName());
            old.setEmail(newData.getEmail());
            old.setPhone(newData.getPhone());
            return studentRepo.save(old);
        }
        return null;
    }
	

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}

	
}
