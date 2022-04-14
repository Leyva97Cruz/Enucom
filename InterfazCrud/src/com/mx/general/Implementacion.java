package com.mx.general;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos{
	
	List<Celular> lista = new ArrayList<Celular>();

	@Override
	public void guardar(Celular celular) {
		// TODO Auto-generated method stub
		
		lista.add(celular);
		
	}

	@Override
	public void editar(Celular celular, int indice) {
		// TODO Auto-generated method stub
		lista.set(indice, celular);
		
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Celular buscar(int indice) {
		// TODO Auto-generated method stub
		Celular c = lista.get(indice);
		return c;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
		
	}
	
	public void contar() {
		System.out.println("La lista tiene " + lista.size()+ " Celulares");
	}

}
