package com.portfolio.jay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.jay.Interface.IExperienciaService;
import com.portfolio.jay.model.Experiencia;
import com.portfolio.jay.repository.IExperienciaRepository;

@Service
public class ImplExperienciaService implements IExperienciaService{

    @Autowired
    private IExperienciaRepository expRepository;

    @Override
    public List<Experiencia> verExperiencias() {
        List<Experiencia> experiencias = expRepository.findAll();
        return experiencias;
    }

    @Override
    public void cerearExperiencia(Experiencia experiencia) {
        expRepository.save(experiencia);
        
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepository.deleteById(id);
        
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        Experiencia experienciaId = expRepository.findById(id).orElse(null);
        return experienciaId;
    }
    
}
