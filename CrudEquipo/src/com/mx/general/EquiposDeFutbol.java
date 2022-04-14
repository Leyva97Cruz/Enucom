package com.mx.general;

public class EquiposDeFutbol {
	
	String nombre;
	String ciudad;
	int copas;
	int anios;
	
	public EquiposDeFutbol() {
		
	}

	public EquiposDeFutbol(String nombre) {
		this.nombre = nombre;
	}

	public EquiposDeFutbol(String nombre, String ciudad, int copas, int anios) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.copas = copas;
		this.anios = anios;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", ciudad=" + ciudad + ", copas=" + copas + ", anios=" + anios
				+ "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCopas() {
		return copas;
	}

	public void setCopas(int copas) {
		this.copas = copas;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}
	
	
	

}
