package com.mx.general;

public class Caricatura {
	
	 String nombre;
	 String genero;  
	 int capitulos;
	 String fechaEstreno;
	 
	 public Caricatura() {
		 
	 }
	 

	public Caricatura(String nombre) {
		this.nombre = nombre;
	}


	public Caricatura(String nombre, String genero, int capitulos, String fechaEstreno) {
		this.nombre = nombre;
		this.genero = genero;
		this.capitulos = capitulos;
		this.fechaEstreno = fechaEstreno;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", genero=" + genero + ", capitulos=" + capitulos + ", fechaEstreno="
				+ fechaEstreno + "]\n";
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

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}

	public String getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(String fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	
	
	 
	 

}
