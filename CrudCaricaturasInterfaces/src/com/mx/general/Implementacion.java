package com.mx.general;

import java.util.ArrayList;
import java.util.List;

public class Implementacion implements Metodos {
	
	List<Caricatura> lista = new ArrayList<Caricatura>();
	
	@Override
	public void Guardar(Caricatura caricatura) {
		// TODO Auto-generated method stub
		lista.add(caricatura);
		
	}

	@Override
	public void Editar(int indice, Caricatura caricatura) {
		// TODO Auto-generated method stub
		lista.set(indice, caricatura);
	}

	@Override
	public void Eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}

	@Override
	public Caricatura buscar(int indice) {
		// TODO Auto-generated method stub
		Caricatura c = lista.get(indice);
		
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
	
	public void buscarNoombre(Caricatura con) {
		
		for (Caricatura c : lista) {
			if(c.getNombre().equals(con.getNombre())){
				System.out.println("Consola Encontrada ~> " + c);
				break;
				
			}
			
		}
		
	}

}
