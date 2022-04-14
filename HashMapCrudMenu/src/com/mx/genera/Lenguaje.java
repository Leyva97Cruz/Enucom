package com.mx.genera;

public class Lenguaje {
	int clave;
	String nombre;
	int anios;
	String pais;
	
	public Lenguaje() {
		
	}
	public Lenguaje(int clave) {
		this.clave = clave;
	}
	public Lenguaje(int clave, String nombre, int anios, String pais) {
		this.clave = clave;
		this.nombre = nombre;
		this.anios = anios;
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "[clave=" + clave + ", nombre=" + nombre + ", anios=" + anios + ", pais=" + pais + "]\n";
	}
	public int getClave() {
		return clave;
	}
	public void setClave(int clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

}
