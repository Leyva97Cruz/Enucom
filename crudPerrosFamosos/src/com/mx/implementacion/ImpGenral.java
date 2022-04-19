package com.mx.implementacion;

import java.util.HashMap;

import com.mx.entidad.Perro;
import com.mx.entidad.Raza;
import com.mx.general.Metodos;

public class ImpGenral implements Metodos {

	HashMap<Object, Object> hash = new HashMap<Object, Object>();
	@Override
	public void guardar(Object key, Object obj) {
		// TODO Auto-generated method stub
		hash.put(key, obj);
		
	}

	@Override
	public void editar(Object key, Object obj) {
		// TODO Auto-generated method stub
		hash.put(key, obj);
	}

	@Override
	public void eliminar(Object key) {
		// TODO Auto-generated method stub
		hash.remove(key);
	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		return hash.get(obj);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);
	}
	
	public void buscarRaza(Raza raza) {
		
		for (Object perro: hash.values()) {
			if(((Perro) perro).getRaza().equals(raza.getNombre())) {
				System.out.println("Raza Encontrada " + perro);
			}
		}
	}

}
