package com.mx.general;

public class Continentes {
	
	String nombre;
	int habitantes;
	double extencion;
	
	public Continentes() {
		
	}

	public Continentes(String nombre, int habitantes, double extencion) {
		this.nombre = nombre;
		this.habitantes = habitantes;
		this.extencion = extencion;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", habitantes=" + habitantes + ", extencion=" + extencion + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public double getExtencion() {
		return extencion;
	}

	public void setExtencion(double extencion) {
		this.extencion = extencion;
	}
	

}
