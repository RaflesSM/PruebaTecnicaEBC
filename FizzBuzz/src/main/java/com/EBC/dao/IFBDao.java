package com.EBC.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EBC.dominio.FizzBuzz;

public interface IFBDao extends JpaRepository<FizzBuzz, Integer>{

}
