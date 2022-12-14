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

import com.portfolio.jay.Interface.IEducacionService;
import com.portfolio.jay.model.Educacion;

@RestController
@CrossOrigin(origins = "https://apmarcosfront-fdfe7.web.app")
public class EducacionController {
    @Autowired
    private IEducacionService eduService;
    
    @PostMapping("/educacion/new")
    public String agregarEducacion(@RequestBody Educacion educacion) {
        eduService.crearEducacion(educacion);
        return "Se ha agregado una educacion nueva";
    }

    @GetMapping("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacions() {
        return eduService.verEducacion();
    }

    @GetMapping("/educacion/ver/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable Long id) {
        return eduService.buscarEducacion(id);
    }
    
    @DeleteMapping("/educacion/delete/{id}")
    public String borrarEducacion(@PathVariable Long id) {
        eduService.borrarEducacion(id);
        return "La educacion ha sido borrada";
    }
    
    @PutMapping("/educacion/editar/{id}")
    public String modificarEducacion(@PathVariable Long id, @RequestBody Educacion educacion) {
        eduService.crearEducacion(educacion);
        return "la educacio ha sido modificada";
    }

}
