package com.portfolio.jay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.jay.Interface.IProyectoService;
import com.portfolio.jay.model.Proyecto;
import com.portfolio.jay.repository.IProyectoRepository;

@Service
public class ImplProyectoSerivce implements IProyectoService{

    @Autowired
    private IProyectoRepository proyRepository;
    @Override
    public List<Proyecto> verProyectos() {
        List<Proyecto> proyectos = proyRepository.findAll();
        return proyectos;
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyRepository.save(proyecto);
        
    }

    @Override
    public void borrarProyecto(Long id) {
        proyRepository.deleteById(id);
        
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        Proyecto proyecto = proyRepository.findById(id).orElse(null);
        return proyecto;
    }
    
}
