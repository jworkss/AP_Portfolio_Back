package com.portfolio.jay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.jay.model.Educacion;

@Repository
public interface IEducacionRepository extends JpaRepository <Educacion, Long> {
    
}
