package com.EBC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EBC.dao.ICollatzDao;
import com.EBC.dominio.Collatz;

@Service
public class CollatzService {

	@Autowired
	private ICollatzDao dao;
	
	public Collatz guardar(Collatz coll) {
		return dao.save(coll);
	}
	
	public Collatz buscar(int id) {
		return dao.findById(id).orElse(null);
	}
}
