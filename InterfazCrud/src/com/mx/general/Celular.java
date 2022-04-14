package com.mx.general;

public class Celular {
	
	String modelo;
	String marca;
	double precio;
	int rom;
	
	public Celular() {
		
	}

	public Celular(String modelo, String marca, double precio, int rom) {
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.rom = rom;
	}

	@Override
	public String toString() {
		return "[modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", rom=" + rom + "]\n";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}
	

}
