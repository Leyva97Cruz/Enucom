package com.mx.general;

public class Refresco {
	
	String nombre;
	double precio;
	String marca;
	int contenido;
	
	//constructor vacio
	 public  Refresco() {
		
	}
	 
	 // constructor con parametros
	 
	 public Refresco(String nombre, double precio, String marca, int contenido) {
		 
		 this.nombre = nombre;
		 this.precio = precio;
		 this.marca = marca;
		 this.contenido = contenido;
		 
	 }
	 
	 
	
	
	@Override
	public String toString() {
		return "Refresco [nombre=" + nombre + ", precio=" + precio + ", marca=" + marca + ", contenido=" + contenido
				+ "]";
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	

}
