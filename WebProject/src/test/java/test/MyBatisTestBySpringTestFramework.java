package test;

import java.util.UUID;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.webapp.firsttask.model.Student;
import com.webapp.firsttask.service.StudentServiceI;
import com.webapp.firsttask.serviceimpl.StudentServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class MyBatisTestBySpringTestFramework {

  //注入Service
  @Resource(name = "studentService")
  private StudentServiceI studentService;
  
  @Test
  public void testAddUser(){
	  Student student = new Student();
	  student.setStudentName("662");
	  student.setCreateAt(20160716L);
	  student.setUpdateAt(20160716L);
	  studentService.addStudent(student);
  }
  
  @Test
  public void testGetUserById(){
      int Id = 1;
      Student student = studentService.getStudentById(Id);
      System.out.println(student.getStudentName());
  }
}
