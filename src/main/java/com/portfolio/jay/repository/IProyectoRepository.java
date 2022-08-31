package com.portfolio.jay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.jay.model.Proyecto;

@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}
