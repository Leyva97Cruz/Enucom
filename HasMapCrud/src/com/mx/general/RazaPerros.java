package com.mx.general;

public class RazaPerros {
	
	String nombre;
	String raza;
	int anios;
	
	public RazaPerros() {
		
	}
	
	public RazaPerros(String nombre) {
		this.nombre = nombre;
		
	}
	
	public RazaPerros(String nombre, String raza, int anios) {
		this.nombre = nombre;
		this.raza = raza;
		this.anios = anios;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", raza=" + raza + ", anios=" + anios + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}


	
	

}
