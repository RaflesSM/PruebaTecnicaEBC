package com.EBC.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EBC.dominio.FizzBuzz;
import com.EBC.service.FizzBuzzService;

@RestController
@RequestMapping(path="/api")
@CrossOrigin
public class FizzBuzzWS {

	@Autowired
	private FizzBuzzService service;
	
	@PostMapping("/fizzbuzz/{n}")
	public ResponseEntity<?> fb(@PathVariable("n") int n) {
			List<String> lista = new ArrayList<>();
			int c = 1;
			while(c != n) {
				if(c%3==0 && c%5==0) {
					lista.add("FizzBuzz");
				}else if(c%3==0) {
					lista.add("Fizz");
				} else if( c%5==0) {
					lista.add("Buzz");
				} else {
					lista.add(Integer.toString(c));
				}
				c++;
			}
			lista.add(Integer.toString(c));
			
			FizzBuzz fb = new FizzBuzz(n, lista);
			
			return ResponseEntity.ok(service.guardar(fb));
	}
	
	@PutMapping("/{n}")
	public ResponseEntity<?> collatz(@PathVariable("n") int n) {
		return ResponseEntity.ok(service.collatz(n));
	}
}
