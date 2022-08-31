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

import com.portfolio.jay.Interface.IRedesService;
import com.portfolio.jay.model.Redes;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RedesController {

    @Autowired
    private IRedesService redesService;
    
    @PostMapping("/redes/new")
    public String agregarRed(@RequestBody Redes redes){
        redesService.crearRed(redes);
        return "Se ha agregado una red nueva";
    }

    @GetMapping("/redes/ver")
    @ResponseBody
    public List<Redes> verRedes() {
        return redesService.verRedes();
    }

    @GetMapping("/redes/ver/{id}")
    @ResponseBody
    public Redes buscarContacto(@PathVariable Long id) {
        return redesService.buscarRed(id);
    }

    @DeleteMapping("/redes/delete/{id}")
    public String borrarContacto(@PathVariable Long id) {
        redesService.borrarRed(id);
        return "La red ha sido borrada";
    }

    @PutMapping("/redes/editar/{id}")
    public String modificarRed(@PathVariable Long id, @RequestBody Redes con) {
        redesService.crearRed(con);
        return "la red ha sido modificada";
    }
    
}
