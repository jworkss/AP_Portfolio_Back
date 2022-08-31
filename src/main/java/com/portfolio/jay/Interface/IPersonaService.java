package com.portfolio.jay.Interface;

import java.util.List;

import com.portfolio.jay.model.Persona;

public interface IPersonaService {
    
    public List<Persona> verPersonas();

    public void crearPersona(Persona persona);

    public void borrarPersona(Long id);

    public Persona buscarPersona(Long id);

}
