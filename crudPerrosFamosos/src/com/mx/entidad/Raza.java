package com.mx.entidad;

public class Raza {

	String nombre;
	String tamano;
	int anios;

	public Raza() {
	}

	public Raza(String nombre) {
		this.nombre = nombre;
	}

	public Raza(String nombre, String tamano, int anios) {
		this.nombre = nombre;
		this.tamano = tamano;
		this.anios = anios;
	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", tamano=" + tamano + ", anios=" + anios + " ]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

}
