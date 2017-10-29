package com.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by stfcr on 10/29/2017.
 */
@Entity
@Table(name = "projects")
public class Project {
    private static final String PROJECT_SEQUENCE = "projects_id_seq";
    private static final String PROJECT_GENERATOR = "projects_generator";
    @Id
    @SequenceGenerator(name = PROJECT_GENERATOR, sequenceName = PROJECT_SEQUENCE)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PROJECT_GENERATOR)
    private int id;


    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name="PROJEC_SKILLS",
            joinColumns = {@JoinColumn(name = "skill_Id")},
            inverseJoinColumns = {@JoinColumn(name = "project_Id")})
    private Set<Skill> skills;

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

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }
}
