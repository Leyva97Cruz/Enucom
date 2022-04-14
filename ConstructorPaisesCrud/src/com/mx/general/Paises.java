package com.mx.general;

public class Paises {

	String Nombre;
	String Capital;
	int Habitantes;
	double extencion;

	public Paises() {

	}

	public Paises(String nombre, String capital, int habitantes, double extencion) {

		Nombre = nombre;
		Capital = capital;
		Habitantes = habitantes;
		this.extencion = extencion;
	}

	@Override
	public String toString() {
		return "Paises [Nombre=" + Nombre + ", Capital=" + Capital + ", Habitantes=" + Habitantes + ", extencion="
				+ extencion + "]";
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getCapital() {
		return Capital;
	}

	public void setCapital(String capital) {
		Capital = capital;
	}

	public int getHabitantes() {
		return Habitantes;
	}

	public void setHabitantes(int habitantes) {
		Habitantes = habitantes;
	}

	public double getExtencion() {
		return extencion;
	}

	public void setExtencion(double extencion) {
		this.extencion = extencion;
	}

}
