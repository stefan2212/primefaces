package com.dto;

import com.entity.Student;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by stfcr on 10/29/2017.
 */
@ManagedBean(name = "studentBean")
@RequestScoped
public class StudentDto {

    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static StudentDto converToDto(Student student){
        StudentDto dto = new StudentDto();
        dto.setId(student.getId());
        dto.setName(student.getName());
        dto.setEmail(student.getEmail());
        return dto;
    }

    public static Student converToEntity(StudentDto studentDto){
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setEmail(studentDto.getEmail());
        student.setName(studentDto.getName());
        return student;
    }
}
