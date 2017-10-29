package com.dto;

import com.entity.Skill;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by stfcr on 10/29/2017.
 */
@ManagedBean(name = "skillBean")
@RequestScoped
public class SkillDto {
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

    public static SkillDto converToDto(Skill skill){
        SkillDto dto = new SkillDto();
        dto.setId(skill.getId());
        dto.setName(skill.getName());
        return dto;
    }

    public static Skill converToEntity(SkillDto dto){
        Skill skill = new Skill();
        skill.setId(dto.getId());
        skill.setName(dto.getName());
        return skill;
    }


}
