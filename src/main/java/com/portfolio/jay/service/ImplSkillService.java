package com.portfolio.jay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.jay.Interface.ISkillService;
import com.portfolio.jay.model.Skill;
import com.portfolio.jay.repository.ISkillRepository;

@Service
public class ImplSkillService implements ISkillService {

    @Autowired
    private ISkillRepository skillRepository;

    @Override
    public List<Skill> verSkills() {
        List<Skill> skills = skillRepository.findAll();
        return skills;
    }

    @Override
    public void crearSkill(Skill skill) {
        skillRepository.save(skill);

    }

    @Override
    public void borrarSkill(Long id) {
        skillRepository.deleteById(id);

    }

    @Override
    public Skill buscarSkill(Long id) {
        Skill skill = skillRepository.findById(id).orElse(null);
        return skill;
    }

}
