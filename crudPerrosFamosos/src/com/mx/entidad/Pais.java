package com.mx.entidad;

public class Pais {
	String nombre;
	String continente;

	public Pais() {
	}

	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public Pais(String nombre, String contienete) {
		this.nombre = nombre;
		this.continente = contienete;

	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", contienete=" + continente + " ]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

}
