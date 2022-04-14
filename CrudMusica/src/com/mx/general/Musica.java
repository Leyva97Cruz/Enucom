package com.mx.general;

public class Musica {
	
	String nombre; 
	String genero; 
	double duracion; 
	String cantante;
	
	public Musica() {
		
	}

	public Musica(String nombre, String genero, double duracion, String cantante) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracion = duracion;
		this.cantante = cantante;
	}

	@Override
	public String toString() {
		return "Musica [nombre=" + nombre + ", genero=" + genero + ", duracion=" + duracion + ", cantante=" + cantante
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}
	
	

}
