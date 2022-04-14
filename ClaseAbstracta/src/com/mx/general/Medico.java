package com.mx.general;

public class Medico extends Profesionista {

	String coloBata;
	String especialidad;

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("operando ando");
	}

	public void consultando() {
		System.out.println("Tienes COVID");
	}

	public Medico() {

	}

	@Override
	public String toString() {
		return "[coloBata=" + coloBata + ", especialidad=" + especialidad + ", nombre=" + nombre + ", cedula=" + cedula
				+ ", titulo=" + titulo + ", universidad=" + universidad + "]\n";
	}

	public Medico(String nombre, String cedula, String titulo, String universidad, String coloBata,
			String especialidad) {
		super(nombre, cedula, titulo, universidad);
		this.coloBata = coloBata;
		this.especialidad = especialidad;
	}

	public String getColoBata() {
		return coloBata;
	}

	public void setColoBata(String coloBata) {
		this.coloBata = coloBata;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
