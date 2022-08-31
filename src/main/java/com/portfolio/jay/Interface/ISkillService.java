package com.portfolio.jay.Interface;

import java.util.List;

import com.portfolio.jay.model.Skill;

public interface ISkillService {

    public List<Skill> verSkills();

    public void crearSkill(Skill skill);

    public void borrarSkill(Long id);

    public Skill buscarSkill(Long id);
}
