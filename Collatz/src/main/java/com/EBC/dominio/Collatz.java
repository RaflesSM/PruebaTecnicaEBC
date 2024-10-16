package com.EBC.dominio;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Collatz {

	@Id
	private int idCollatz;
	private List<Integer> lista;
	
	public Collatz() {
    }
	
	public Collatz(int idCollatz, List<Integer> lista) {
		this.idCollatz = idCollatz;
		this.lista = lista;
	}

	public int getIdCollatz() {
		return idCollatz;
	}

	public void setIdCollatz(int idCollatz) {
		this.idCollatz = idCollatz;
	}

	public List<Integer> getLista() {
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Collatz [Numero=" + idCollatz + ", Secuencia=" + lista + "]";
	}
	
}
