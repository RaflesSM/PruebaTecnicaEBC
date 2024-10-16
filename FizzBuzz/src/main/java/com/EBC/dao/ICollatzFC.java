package com.EBC.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.EBC.dominio.Collatz;

@FeignClient(name="Collatz", url="http://localhost:8020", path="/secuence/Collatz")
public interface ICollatzFC {

	@PutMapping("/{n}")
	public Collatz collatz(@PathVariable("n") int n);
}
