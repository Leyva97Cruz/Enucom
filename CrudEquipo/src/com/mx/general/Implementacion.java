package com.mx.general;

import java.util.ArrayList;
import java.util.List;

public class Implementacion  implements Metodos{
	
	List<EquiposDeFutbol> lista = new ArrayList<EquiposDeFutbol>();

	@Override
	public void Guardar(EquiposDeFutbol equipo) {
		// TODO Auto-generated method stub
		
		lista.add(equipo);
		
	}

	@Override
	public void Editar(int indice, EquiposDeFutbol equipo) {
		// TODO Auto-generated method stub
		lista.set(indice, equipo);
	}

	@Override
	public void Eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}

	@Override
	public EquiposDeFutbol buscar(int indice) {
		// TODO Auto-generated method stub
		EquiposDeFutbol c = lista.get(indice);
		
		return c;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}
	
	public void contar()
	{
		System.out.println("La lista tiene " + lista.size()+" de Equipos de Futbol");
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
		
			System.out.println("La lista NO esta vacia, tiene " + lista.size() + " de"
					+ " Equipos de Futbol");
		}
	}
	
	public void buscarNoombre(EquiposDeFutbol con) {
		
		for (EquiposDeFutbol c : lista) {
			if(c.getNombre().equals(con.getNombre())){
				System.out.println("Equipo encontrado ~> " + c);
				break;
				
			}
			
		}
		
	}
	

}
