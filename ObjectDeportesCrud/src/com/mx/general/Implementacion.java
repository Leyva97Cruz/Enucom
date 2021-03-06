package com.mx.general;

import java.util.HashMap;

public class Implementacion  implements Metodos{
	
	HashMap<String, Deporte> hash = new HashMap<String, Deporte>();
	Deporte deporte = null;

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		deporte = (Deporte) obj;
		hash.put(deporte.getNombre(), deporte);
		
	}

	@Override
	public void editar(Object obj) {
		// TODO Auto-generated method stub
		deporte = (Deporte) obj;
		hash.put(deporte.getNombre(), deporte);
	}

	@Override
	public void eliminar(Object obj) {
		// TODO Auto-generated method stub
		deporte = (Deporte) obj;
		hash.remove(deporte.getNombre());
	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		deporte = (Deporte) obj;
		return hash.get(deporte.getNombre());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
		
	}
	
	public void contar() {
		System.out.println("El has tiene ~> " + hash.size() +" de Deportes");
	}
	public void eliminarTodo() {
		
		hash.clear();
	}
	
	public void vacio() {
		
		if (hash.isEmpty()) {
			
			System.out.println("El has está vacio");
		}
		else {
			System.out.println("El has  NO está vacio");
		}
		
	}

}
