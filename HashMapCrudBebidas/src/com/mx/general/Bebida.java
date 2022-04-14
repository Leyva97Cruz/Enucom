package com.mx.general;

public class Bebida {

	String nombre;
	double precio;
	double calorias;
	double contenido;

	public Bebida() {

	}

	public Bebida(String nombre) {
		this.nombre = nombre;
	}

	public Bebida(String nombre, double precio, double calorias, double contenido) {
		this.nombre = nombre;
		this.precio = precio;
		this.calorias = calorias;
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", precio=" + precio + ", calorias=" + calorias + ", contenido=" + contenido
				+ "]\n";
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

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}

}
