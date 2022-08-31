package com.portfolio.jay.Interface;

import java.util.List;

import com.portfolio.jay.model.Experiencia;

public interface IExperienciaService {

    public List<Experiencia> verExperiencias();

    public void cerearExperiencia(Experiencia experiencia);

    public void borrarExperiencia(Long id);

    public Experiencia buscarExperiencia(Long id);
}
