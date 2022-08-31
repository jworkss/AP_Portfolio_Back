package com.portfolio.jay.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.jay.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}
