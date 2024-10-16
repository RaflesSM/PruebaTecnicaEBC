package com.EBC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EBC.dominio.Collatz;
import com.EBC.service.CollatzService;

@RestController
@RequestMapping(path = "/secuence/Collatz")
public class CollatzWS {

	@Autowired
	private CollatzService serviceC;
	
	@PutMapping("/{n}")
	public ResponseEntity<?> collatz(@PathVariable("n") int n) {
		
			List<Integer> lista = new ArrayList<>();
		
			while(n!=1) {
				if(n%2==0) {
					lista.add(n);
					n = n / 2;
				} else {
					lista.add(n);
					n = (n*3) + 1;
				}
			}
			lista.add(n);
			
			Collatz collatz = new Collatz(n, lista);
			
			return ResponseEntity.ok(serviceC.guardar(collatz));
		
	}
}
