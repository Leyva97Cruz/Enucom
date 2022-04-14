package com.mx.general;

public class Paises {
	
	String nombre;
	String capital;
	int habitantes;
	
	public Paises() {
		
	}

	public Paises(String nombre, String capital, int habitantes) {
		this.nombre = nombre;
		this.capital = capital;
		this.habitantes = habitantes;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", capital=" + capital + ", habitantes=" + habitantes + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}
	
	

}
