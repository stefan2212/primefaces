package com.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by stfcr on 10/29/2017.
 */
@Entity
@Table(name = "skills")
public class Skill {
    private static final String SKILL_SEQUENCE = "skill_id_seq";
    private static final String SKILL_GENERATOR = "skill_generator";
    @Id
    @SequenceGenerator(name = SKILL_GENERATOR, sequenceName = SKILL_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SKILL_GENERATOR)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER
            ,mappedBy = "skills")
    private List<Student> studentList;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER
            ,mappedBy = "skills")
    private Set<Project> projectList;

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

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Set<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(Set<Project> projectList) {
        this.projectList = projectList;
    }
}
