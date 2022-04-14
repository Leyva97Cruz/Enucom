package com.mx.general;

public class Heroe {
	int clave;
	String nombre;
	String alias;
	int edad;
	
	public Heroe () {
		
	}

	public Heroe(int clave, String nombre, String alias, int edad) {
		this.clave = clave;
		this.nombre = nombre;
		this.alias = alias;
		this.edad = edad;
	}

	public Heroe(int clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "[clave=" + clave + ", nombre=" + nombre + ", alias=" + alias + ", edad=" + edad + "]\n";
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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
