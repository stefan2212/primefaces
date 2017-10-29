package com.controller;

import com.dto.StudentDto;
import com.service.StudentService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by stfcr on 10/29/2017.
 */
@WebServlet(name ="StudentServlet", urlPatterns = "/StudentServlet")
public class StudentServlet extends HttpServlet {

    private StudentService studentService = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        StudentDto dto = new StudentDto();
        dto.setName(request.getParameter("userName"));
        studentService = new StudentService();
        studentService.saveStudent(dto);

    }
}
