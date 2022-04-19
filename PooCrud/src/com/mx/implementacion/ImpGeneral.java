package com.mx.implementacion;

import java.util.HashMap;
import java.util.Map;

import com.mx.entidad.Celular;
import com.mx.entidad.Marca;
import com.mx.entidad.So;
import com.mx.general.Metodos;

public class ImpGeneral implements Metodos {

	HashMap<Object, Object> hash = new HashMap<Object, Object>();
	Object dato;

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

	public void buscarMarca(Marca marca) {

		for (Object valor : hash.values())

			if (((Celular) valor).getMarca().equals(marca)) {
				System.out.println("Celular \n " + valor);
			}
	}

	public void eliminarMarca(Marca marca) {

		for (Object valor : hash.values()) {

			if ( ((Celular) valor).getMarca().equals(marca)) {
				dato = valor;
				System.out.println(valor);
			}
			
		}
	}

	public void contartSo(So so) {

		int j = 0;
		for (Object i : hash.values()) {

			if (((Celular) i).getSo().equals(so)) {

				j++;

			}
		}
		System.out.println("Hay " + j + " de este sistema operativo");
	}

}
