package com.mx.entidad;

public class Perro {

	String nombre;
	String color;
	int edad;
	Raza raza;
	Pais pais;

	public Perro() {
	}

	public Perro(String nombre) {
		this.nombre = nombre;
	}

	public Perro(String nombre, String color, int edad, Raza raza, Pais pais) {
		this.nombre = nombre;
		this.color = color;
		this.edad = edad;
		this.raza = raza;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", raza=" + raza + ", pais=" + pais
				+ " ]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
