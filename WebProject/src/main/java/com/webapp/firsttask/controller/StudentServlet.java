package com.webapp.firsttask.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.webapp.firsttask.model.Student;
import com.webapp.firsttask.service.StudentServiceI;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    //����ҵ���߼���userService
    private StudentServiceI studentService;
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //��ȡ���е��û���Ϣ
        List<Student> lstStudents = studentService.getAllStudent();
        request.setAttribute("lstStudents", lstStudents);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doGet(request, response);
    }

    public void init() throws ServletException {
        //��Servlet��ʼ��ʱ��ȡSpring�����Ķ���(ApplicationContext)
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        //��ApplicationContext�л�ȡuserService
        studentService = (StudentServiceI) ac.getBean("studentService");
    }
}