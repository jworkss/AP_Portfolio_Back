package com.portfolio.jay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.jay.Interface.IEducacionService;
import com.portfolio.jay.model.Educacion;
import com.portfolio.jay.repository.IEducacionRepository;

@Service
public class ImplEducacionService implements IEducacionService {

    @Autowired
    private IEducacionRepository eduRepository;

    @Override
    public List<Educacion> verEducacion() {
        List<Educacion> educacioness = eduRepository.findAll();
        return educacioness;
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        eduRepository.save(educacion);

    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepository.deleteById(id);

    }

    @Override
    public Educacion buscarEducacion(Long id) {
        Educacion educacionId = eduRepository.findById(id).orElse(null);
        return educacionId;
    }

}
