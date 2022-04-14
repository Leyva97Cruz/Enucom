package com.mx.general;

public class Cantante {
	
	String nombre;
	String app;
	String genero;
	String pais;
	int edad;
	
	public Cantante() {
		
	}

	public Cantante(String nombre) {
		this.nombre = nombre;
	}
	

	public Cantante(String nombre, String app, String genero, String pais, int edad) {
		this.nombre = nombre;
		this.app = app;
		this.genero = genero;
		this.pais = pais;
		this.edad = edad;
	}
	public Cantante(Object obj) {
		
		this.genero = (String) obj;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", app=" + app + ", genero=" + genero + ", pais=" + pais + ", edad="
				+ edad + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	

}
