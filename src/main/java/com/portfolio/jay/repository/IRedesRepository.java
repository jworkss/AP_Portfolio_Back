package com.portfolio.jay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.jay.model.Redes;

@Repository
public interface IRedesRepository extends JpaRepository<Redes, Long> {

}
