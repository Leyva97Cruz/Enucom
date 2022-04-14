package com.mx.general;

import java.util.HashMap;

public class Implementacion implements Metodos {
	
	HashMap<String,RazaPerros> hash = new HashMap<String, RazaPerros>();

	@Override
	public void Guardar(RazaPerros rz) {
		// TODO Auto-generated method stub
		hash.put(rz.getNombre(), rz);
	}

	@Override
	public void Editar(RazaPerros rz) {
		// TODO Auto-generated method stub
		
		hash.put(rz.getNombre(), rz);
		
	}

	@Override
	public void Eliminar(RazaPerros rz) {
		// TODO Auto-generated method stub
		hash.remove(rz);
		
	}

	@Override
	public RazaPerros Buscar(RazaPerros rz) {
		// TODO Auto-generated method stub
		rz = hash.get(rz.getNombre());
		return rz;
	}

	@Override
	public void Mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
		
	}
	

}
