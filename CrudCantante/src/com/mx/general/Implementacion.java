package com.mx.general;

import java.util.HashMap;

public class Implementacion implements Metodos {

	HashMap<String, Cantante> hash = new HashMap<String, Cantante>();
	Cantante cantante = null;

	@Override
	public void guardar(Object obj) {
		// TODO Auto-generated method stub
		cantante = (Cantante) obj;
		hash.put(cantante.getNombre(), cantante);

	}

	@Override
	public void editar(Object obj) {
		// TODO Auto-generated method stub
		cantante = (Cantante) obj;
		hash.put(cantante.getNombre(), cantante);
	}

	@Override
	public void eliminar(Object obj) {
		// TODO Auto-generated method stub
		cantante = (Cantante) obj;
		hash.remove(cantante.getNombre());

	}

	@Override
	public Object buscar(Object obj) {
		// TODO Auto-generated method stub
		cantante = (Cantante) obj;
		return hash.get(cantante.getNombre());
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

		System.out.println(hash);

	}

	public void contar() {

		System.out.println("El has tiene ~> " + hash.size() + " de Cantantes");
	}

	public void eliminarTodo() {
		hash.clear();
	}

	public void buscarGenero(Cantante can) { // Cantante can

		for (Cantante cantante : hash.values()) {

			if (cantante.getGenero().equals(can.getGenero())) {

				System.out.println("Genero Encontrado ~> " + cantante);

			}

		}

	}

	public void vacio() {

		if (hash.isEmpty()) {

			System.out.println("El has está vacio");
		} else {
			System.out.println("El has  NO está vacio");
		}

	}

}
