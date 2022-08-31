package com.portfolio.jay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.jay.Interface.IExperienciaService;
import com.portfolio.jay.model.Experiencia;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired
    private IExperienciaService expService;


    @PostMapping("/experiencias/new")
    public String agregarExperiencia(@RequestBody Experiencia experiencia) {
        expService.cerearExperiencia(experiencia);
        return "Se ha agregado una experiencia" ; 
    }

    @GetMapping("/experiencias/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias() {
        return expService.verExperiencias();
    }

    @GetMapping("/experiencias/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable Long id) {
        return expService.buscarExperiencia(id);
    }

    @DeleteMapping("/experiencias/delete/{id}")
    public String borrarExperiencia(@PathVariable Long id) {
        expService.borrarExperiencia(id);
        return "La experiencia fue eliminada";
    }

    @PutMapping("/experiencia/editar/{id}")
    public String editarExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia){
        expService.cerearExperiencia(experiencia);
        return "La experiencia fue modificada";
    }

}
