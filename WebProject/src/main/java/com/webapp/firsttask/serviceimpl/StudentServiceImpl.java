package com.webapp.firsttask.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.firsttask.dao.StudentMapper;
import com.webapp.firsttask.model.Student;
import com.webapp.firsttask.service.StudentServiceI;

@Service("studentService")
public class StudentServiceImpl implements StudentServiceI {
	@Autowired
	private StudentMapper studentmapper;
	
	public void addStudent(Student student) {

		studentmapper.insert(student);
	}

	public void delStudent(Student student) {

		studentmapper.deleteByPrimaryKey(student.getStudentId());
	}

	public Student getStudentById(int Id) {

		return studentmapper.selectByPrimaryKey(Id);
	}

	public List<Student> getAllStudent() {
		
		return studentmapper.getAllStudent();
	}

}
