package com.portfolio.jay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.jay.Interface.IPersonaService;
import com.portfolio.jay.model.Persona;
import com.portfolio.jay.repository.IPersonaRepository;
@Service
public class ImplPersonaService implements IPersonaService {

@Autowired
 public IPersonaRepository persoRepository;

    @Override
    public List<Persona> verPersonas() {
        List<Persona> personas = persoRepository.findAll();
        return personas;
    }

    @Override
    public void crearPersona(Persona persona) {
        persoRepository.save(persona);
        
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepository.deleteById(id);
        
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona personaId = persoRepository.findById(id).orElse(null);
        return personaId;
    }
    
}
