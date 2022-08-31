package com.portfolio.jay.Interface;

import java.util.List;

import com.portfolio.jay.model.Redes;

public interface IRedesService {

    public List<Redes> verRedes();

    public void crearRed(Redes redes);

    public void borrarRed(Long id);

    public Redes buscarRed(Long id);
    
}
