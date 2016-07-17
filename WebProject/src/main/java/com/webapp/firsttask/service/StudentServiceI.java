package com.webapp.firsttask.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webapp.firsttask.model.Student;

public interface StudentServiceI {
	/**
     * ���ѧ��
     * @param student
     */
    void addStudent(Student student);
    
    /**
     * ����id��ȡѧ��
     * @param Id
     * @return
     */
    Student getStudentById(int Id);
    
    /**
     * ɾ��ѧ��
     * @param student
     */
    void delStudent(Student student);
    
    List<Student> getAllStudent();
}
