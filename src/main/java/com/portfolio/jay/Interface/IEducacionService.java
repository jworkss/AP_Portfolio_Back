package com.portfolio.jay.Interface;

import java.util.List;

import com.portfolio.jay.model.Educacion;

public interface IEducacionService {

    public List<Educacion> verEducacion();

    public void crearEducacion(Educacion educacion);

    public void borrarEducacion(Long id);

    public Educacion buscarEducacion(Long id);
}
