package com.dao;

import com.dto.SkillDto;
import com.entity.Skill;

/**
 * Created by stfcr on 10/29/2017.
 */
public class SkillDao extends Connection {

    public SkillDto saveSkill(SkillDto skillDto){
        Skill skill = SkillDto.converToEntity(skillDto);
        beginTransaction();
        session.save(skill);
        endTransaction();
        return skillDto;
    }

}
