package com.dao;

import com.dto.ProjectDto;
import com.entity.Project;

/**
 * Created by stfcr on 10/29/2017.
 */
public class ProjectDao extends Connection {

    public ProjectDto saveProject(ProjectDto projectDto){
        Project project = ProjectDto.converToEntity(projectDto);
        beginTransaction();
        session.save(project);
        endTransaction();
        return projectDto;
    }

}
