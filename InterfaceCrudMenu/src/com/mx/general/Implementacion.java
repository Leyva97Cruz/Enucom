package com.mx.general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Implementacion implements Metodos{
	
	List<ConsolasVJ> lista = new ArrayList<ConsolasVJ>();

	@Override
	public void Guardar(ConsolasVJ consola) {
		// TODO Auto-generated method stub
		lista.add(consola);
		
	}

	@Override
	public void Editar(int indice, ConsolasVJ consola) {
		// TODO Auto-generated method stub
		lista.set(indice, consola);
		
	}

	@Override
	public void Eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public ConsolasVJ buscar(int indice) {
		// TODO Auto-generated method stub
		ConsolasVJ c = lista.get(indice);
		return c;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
		
	}
	
	public void contar()
	{
		System.out.println("La lista tiene " + lista.size()+" de Consolas");
	}
	
	public void EliminarTodo()
	{
		lista.clear();
		System.out.println("Se eliminaron todos los regirstros");
	}
	
	public void vacia () {
		
		if (lista.isEmpty()) {
			
			System.out.println("La lista esta vacia");
			
		}
		else {
		
			System.out.println("La lista NO esta vacia, tiene " + lista.size() + " Consolas");
		}
	}
	
	public void buscarNoombre(ConsolasVJ con) {
		
		for (ConsolasVJ c : lista) {
			if(c.getNombre().equals(con.getNombre())){
				System.out.println("Consola Encontrada ~> " + c);
				break;
				
			}
			
		}
		
	}

}
