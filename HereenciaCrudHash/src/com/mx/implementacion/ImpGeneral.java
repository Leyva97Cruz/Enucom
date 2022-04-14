package com.mx.implementacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.mx.general.Metodos;

public class ImpGeneral implements Metodos {

	HashMap<Object, Object> hash = new HashMap<Object, Object>();

	@Override
	public void guardar(Object key,Object obj) {
		// TODO Auto-generated method stub
		hash.put(key, obj);

	}

	@Override
	public void editar(Object key,Object obj) {
		// TODO Auto-generated method stub
		hash.put(key, obj);
	}

	@Override
	public void eliminar(Object key) {
		// TODO Auto-generated method stub
		hash.remove(key);
	}

	@Override
	public Object buscar(Object key) {
		// TODO Auto-generated method stub
		return hash.get(key);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hash);

	}

}
