package com.mx.general;

public class ConsolasVJ {
	String nombre;
	String marca;
	double precio;
	
	public ConsolasVJ() {
		
	}
	ConsolasVJ(String nombre){
		this.nombre = nombre;
		
	}

	public ConsolasVJ(String nombre, String marca, double precio) {
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", marca=" + marca + ", precio=" + precio + "]\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
