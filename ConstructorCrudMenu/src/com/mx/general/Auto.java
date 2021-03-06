package com.mx.general;

public class Auto {

	String modelo;
	String marca;
	double precio;
	int puertas;

	public Auto(String modelo, String marca, double precio, int puertas) {

		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "[modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", puertas=" + puertas + "]";
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

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

}
