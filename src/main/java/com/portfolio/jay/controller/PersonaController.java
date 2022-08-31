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

import com.portfolio.jay.Interface.IPersonaService;
import com.portfolio.jay.model.Persona;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    private IPersonaService persoService;

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/personas/new")
    public String agregarPersona(@RequestBody Persona pers) {
        persoService.crearPersona(pers);
        return "Se ha agregado una persona" ; 
    }

    @GetMapping("/personas/ver")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoService.verPersonas();
    }

    @GetMapping("/personas/ver/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable Long id) {
        return persoService.buscarPersona(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/personas/delete/{id}")
    public String borrarPersona(@PathVariable Long id) {
        persoService.borrarPersona(id);
        return "La Persona fue eliminada";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/personas/editar/{id}")
    public String editarPersona(@PathVariable Long id, @RequestBody Persona persona){
        persoService.crearPersona(persona);
        return "La persona fue modificada";
    }
}
