package com.dao;

import com.dto.StudentDto;
import com.entity.Student;

/**
 * Created by stfcr on 10/29/2017.
 */
public class StudentDao extends Connection {

    public StudentDto saveStudent(StudentDto studentDto){
        Student student = StudentDto.converToEntity(studentDto);
        beginTransaction();
        session.save(student);
        endTransaction();
        return studentDto;
    }

}
