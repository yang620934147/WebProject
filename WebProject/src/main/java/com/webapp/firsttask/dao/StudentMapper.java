package com.webapp.firsttask.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.webapp.firsttask.model.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    
    List<Student> getAllStudent();
}