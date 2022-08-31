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

import com.portfolio.jay.Interface.IProyectoService;
import com.portfolio.jay.model.Proyecto;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {

    @Autowired
    private IProyectoService proyService;
    

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyectos/new")
    public String agregarProuecto(@RequestBody Proyecto proyecto) {
        proyService.crearProyecto(proyecto);
        return "Se ha agregado un proyecto" ; 
    }

    @GetMapping("/proyectos/ver")
    @ResponseBody
    public List<Proyecto> verPersonas() {
        return proyService.verProyectos();
    }

    @GetMapping("/proyectos/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable Long id) {
        return proyService.buscarProyecto(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyectos/delete/{id}")
    public String borrarProyecto(@PathVariable Long id) {
        proyService.borrarProyecto(id);
        return "El protyecto fue eliminado";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyectos/editar/{id}")
    public String editarPersona(@PathVariable Long id, @RequestBody Proyecto proyecto){
        proyService.crearProyecto(proyecto);
        return "El proyecto Fue modificado";
    }
}
