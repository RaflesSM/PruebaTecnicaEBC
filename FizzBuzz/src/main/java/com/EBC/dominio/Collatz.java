package com.EBC.dominio;

import java.util.List;

public class Collatz {

	private int idCollatz;
	private List<Integer> lista;
	
	public Collatz() {
    }
	
	public Collatz(int idCollatz, List<Integer> lista) {
		super();
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
