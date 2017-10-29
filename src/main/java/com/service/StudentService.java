package com.service;

import com.dao.StudentDao;
import com.dto.StudentDto;

/**
 * Created by stfcr on 10/29/2017.
 */
public class StudentService {

    private StudentDao studentDao;

    public StudentService(){
        studentDao = new StudentDao();
    }

    public StudentDto saveStudent(StudentDto student){
        studentDao.saveStudent(student);
        return student;
    }

}
