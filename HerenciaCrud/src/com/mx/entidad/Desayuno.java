package com.mx.entidad;

public class Desayuno {
	
	String nombre;
	double precio;
	int porcion;
	
	public Desayuno() {
		
	}

	public Desayuno(String nombre, double precio, int porcion) {
		this.nombre = nombre;
		this.precio = precio;
		this.porcion = porcion;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", precio=" + precio + ", porcion=" + porcion + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPorcion() {
		return porcion;
	}

	public void setPorcion(int porcion) {
		this.porcion = porcion;
	}

}
