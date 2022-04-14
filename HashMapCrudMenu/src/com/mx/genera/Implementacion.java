package com.mx.genera;

import java.util.HashMap;

public class Implementacion implements Metodos {
	HashMap<Integer, Lenguaje> hash = new HashMap<Integer, Lenguaje>();

	@Override
	public void guardar(Lenguaje leguaje) {
		// TODO Auto-generated method stub
		hash.put(leguaje.getClave(), leguaje);
		
	}

	@Override
	public void editar(Lenguaje leguaje) {
		// TODO Auto-generated method stub
		hash.put(leguaje.getClave(), leguaje);
		
	}

	@Override
	public void eliminar(Lenguaje leguaje) {
		// TODO Auto-generated method stub
		hash.remove(leguaje.getClave());
		
	}

	@Override
	public Lenguaje buscar(Lenguaje leguaje) {
		// TODO Auto-generated method stub
		return hash.get(leguaje.getClave());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
		System.out.println(hash);
		
	}

}
