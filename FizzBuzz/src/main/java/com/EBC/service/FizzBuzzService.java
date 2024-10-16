package com.EBC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EBC.dao.ICollatzFC;
import com.EBC.dao.IFBDao;
import com.EBC.dominio.Collatz;
import com.EBC.dominio.FizzBuzz;

@Service
public class FizzBuzzService {

	@Autowired
	private IFBDao daoFB;
	
	@Autowired
	private ICollatzFC cFC;
	
	public FizzBuzz guardar(FizzBuzz fb) {
		return daoFB.save(fb);
	}
	
	public FizzBuzz buscar(int id) {
		return daoFB.findById(id).orElse(null);
	}
	
	public Collatz collatz(int id) {
		return cFC.collatz(id);
	}
}
