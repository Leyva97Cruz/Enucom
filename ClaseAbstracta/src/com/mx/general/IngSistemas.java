package com.mx.general;

public class IngSistemas extends Profesionista {
	String lenguaje;
	String framework;

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Haciendo el hola mundo");

	}

	public void codeando() {
		System.out.println("Programando la calculadora");
	}

	public IngSistemas() {

	}

	public IngSistemas(String nombre, String cedula, String titulo, String universidad, String lenguaje,
			String framework) {
		super(nombre, cedula, titulo, universidad);
		this.lenguaje = lenguaje;
		this.framework = framework;
	}

	@Override
	public String toString() {
		return "[lenguaje=" + lenguaje + ", framework=" + framework + ", nombre=" + nombre + ", cedula=" + cedula
				+ ", titulo=" + titulo + ", universidad=" + universidad + "]\n";
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getFramework() {
		return framework;
	}

	public void setFramework(String framework) {
		this.framework = framework;
	}

}
