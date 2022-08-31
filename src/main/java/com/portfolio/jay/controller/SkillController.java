package com.portfolio.jay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.jay.Interface.ISkillService;
import com.portfolio.jay.model.Skill;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {
    @Autowired
    private ISkillService skillService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/skills/new")
    public String agregarRed(@RequestBody Skill skill) {
        skillService.crearSkill(skill);
        return "Se ha agregado un skill nuevo";
    }

    @GetMapping("/skills/ver")
    @ResponseBody
    public List<Skill> verSkills() {
        return skillService.verSkills();
    }

    @GetMapping("/skills/ver/{id}")
    @ResponseBody
    public Skill bucsarSkill(@PathVariable Long id) {
        return skillService.buscarSkill(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/skills/delete/{id}")
    public String borrarSkill(@PathVariable Long id) {
        skillService.borrarSkill(id);
        return "El Skill ha sido borrado";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/skills/editar/{id}")
    public String modificarSkill(@PathVariable Long id, @RequestBody Skill skill) {
        skillService.crearSkill(skill);
        return "la red ha sido modificada";
    }

}
