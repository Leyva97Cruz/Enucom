package com.mx.general;

public class Padre {
	
	public String nombre;
	public String app;
	public int edad;
	
	public Padre()
	{
		
	}

	public Padre(String nombre, String app, int edad) {
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", app=" + app + ", edad=" + edad + "]\n";
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
