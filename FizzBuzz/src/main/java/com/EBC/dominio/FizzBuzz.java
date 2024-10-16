package com.EBC.dominio;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FizzBuzz {

	@Id
	private int idFB;
	private List<String> lista;
	
	public FizzBuzz() {
	}

	public FizzBuzz(int idFB, List<String> lista) {
		super();
		this.idFB = idFB;
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "FizzBuzz [idFB=" + idFB + ", lista=" + lista + "]";
	}

	public int getIdFB() {
		return idFB;
	}

	public void setIdFB(int idFB) {
		this.idFB = idFB;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
	
	
}
