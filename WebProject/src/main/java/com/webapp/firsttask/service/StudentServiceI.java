package com.webapp.firsttask.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.firsttask.model.Student;

public interface StudentServiceI {
	/**
     * 添加学生
     * @param student
     */
    void addStudent(Student student);
    
    /**
     * 根据id获取学生
     * @param Id
     * @return
     */
    Student getStudentById(int Id);
    
    /**
     * 删除学生
     * @param student
     */
    void delStudent(Student student);
    
    List<Student> getAllStudent();
}
