package com.EBC.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EBC.dominio.Collatz;

public interface ICollatzDao extends JpaRepository<Collatz, Integer>{

}
