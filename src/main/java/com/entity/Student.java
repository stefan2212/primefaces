package com.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by stfcr on 10/29/2017.
 */
@Entity
@Table(name = "students")
public class Student {
    private static final String STUDENT_SEQUENCE = "students_id_seq";
    private static final String STUDENT_GENERATOR = "students_generator";
    @Id
    @SequenceGenerator(name = STUDENT_GENERATOR, sequenceName = STUDENT_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = STUDENT_GENERATOR)
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name ="nrMatricol")
    private String email;

    @ManyToMany
    @JoinTable(name="STUDENTS_SKILLS",
            joinColumns = {@JoinColumn(name = "skill_Id")},
            inverseJoinColumns = {@JoinColumn(name = "student_Id")})
    private List<Skill> skills;

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

    public void setEmail(String nrMatricol) {
        this.email = nrMatricol;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
