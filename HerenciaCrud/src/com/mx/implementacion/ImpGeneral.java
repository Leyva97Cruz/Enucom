package com.mx.implementacion;

import java.util.ArrayList;
import java.util.List;

import com.mx.general.Metodos;

public class ImpGeneral  implements Metodos{

	List<Object> lista = new ArrayList<Object>();
	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		lista.add(obj);
		
	}

	@Override
	public void editar(Object obj, int indice) {
		// TODO Auto-generated method stub
		lista.add(indice, obj);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

	@Override
	public Object buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
		
	}

}
