package com.portfolio.jay.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.jay.Interface.IRedesService;
import com.portfolio.jay.model.Redes;
import com.portfolio.jay.repository.IRedesRepository;

@Service
@Transactional
public class ImplRedesService  implements IRedesService{

    @Autowired
    public IRedesRepository redesRepository;
    
    @Override
    public List<Redes> verRedes() {
        List<Redes> redes = redesRepository.findAll();
        return redes;
    }

    @Override
    public void crearRed(Redes redes) {
        redesRepository.save(redes);
        
    }

    @Override
    public void borrarRed(Long id) {
        redesRepository.deleteById(id);
        
    }

    @Override
    public Redes buscarRed(Long id) {
        Redes redesId = redesRepository.findById(id).orElse(null);
        return redesId;
    }
    
}
