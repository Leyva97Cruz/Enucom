package com.mx.general;



public class Deporte {
	
	String nombre;
	String pais;
	int anios;
	int jugadores;
	
	public Deporte() {
		
	}

	public Deporte(String nombre) {
		this.nombre = nombre;
	}

	public Deporte(String nombre, String pais, int anios, int jugadores) {
		this.nombre = nombre;
		this.pais = pais;
		this.anios = anios;
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", pais=" + pais + ", anios=" + anios + ", jugadores=" + jugadores + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

	public int getJugadores() {
		return jugadores;
	}

	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}

}
