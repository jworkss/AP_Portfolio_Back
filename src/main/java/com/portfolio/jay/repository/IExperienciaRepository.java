package com.portfolio.jay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.jay.model.Experiencia;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long>{
    
}
