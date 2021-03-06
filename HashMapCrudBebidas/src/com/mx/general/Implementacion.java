package com.mx.general;

import java.util.HashMap;

public class Implementacion implements Metodos {
	
	HashMap<String, Bebida> hash = new HashMap<String, Bebida>();

	@Override
	public void guardar(Bebida bebida) {
		// TODO Auto-generated method stub
		hash.put(bebida.getNombre(), bebida);
		
	}

	@Override
	public void editar(Bebida bebida) {
		// TODO Auto-generated method stub
		hash.put(bebida.getNombre(), bebida);
	}

	@Override
	public void eliminar(Bebida bebida) {
		// TODO Auto-generated method stub
		hash.remove(bebida.getNombre());
		
	}

	@Override
	public Bebida buscar(Bebida bebida) {
		// TODO Auto-generated method stub
		return hash.get(bebida.getNombre());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}
	
	public void contar() {
		System.out.println("el HashMap tiene ~> " + hash.size() +" de bebidas");
	}

}
