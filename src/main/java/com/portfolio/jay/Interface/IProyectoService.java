package com.portfolio.jay.Interface;

import java.util.List;

import com.portfolio.jay.model.Proyecto;

public interface IProyectoService {
    public List<Proyecto> verProyectos();

    public void crearProyecto(Proyecto proyecto);

    public void borrarProyecto(Long id);

    public Proyecto buscarProyecto(Long id);
}
