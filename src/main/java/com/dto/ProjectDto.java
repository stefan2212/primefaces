package com.dto;

import com.entity.Project;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by stfcr on 10/29/2017.
 */
@ManagedBean(name = "projectBean")
@RequestScoped
public class ProjectDto {

    private int id;
    private String name;

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

    public static ProjectDto converToDto(Project project){
        ProjectDto dto = new ProjectDto();
        dto.setId(project.getId());
        dto.setName(project.getName());
        return dto;
    }

    public static Project converToEntity(ProjectDto dto){
        Project project = new Project();
        project.setId(dto.getId());
        project.setName(dto.getName());
        return project;
    }
}
