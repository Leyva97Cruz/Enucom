package com.mx.general;

import java.util.HashMap;

public class Implementacion implements Metodos{
	HashMap<Integer, Heroe> hash = new HashMap<Integer, Heroe>();
	Heroe heroe = null;

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		heroe = (Heroe) obj;
		hash.put(heroe.getClave(), heroe);
		
	}

	@Override
	public void editar(Object obj) {
		// TODO Auto-generated method stub
		heroe = (Heroe) obj;
		hash.put(heroe.getClave(), heroe);
	}

	@Override
	public void eliminar(Object obj) {
		// TODO Auto-generated method stub
		heroe = (Heroe) obj;
		hash.remove(heroe.getClave());
		
	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		heroe = (Heroe) obj;
		return hash.get(heroe.getClave());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
		System.out.println(hash);
		
	}

}
