package com.mx.general;

public class Hijo extends Padre {
	String ojos;
	double estatura;

	public Hijo() {
		
	}

	public Hijo(String nombre, String app, int edad, String ojos, double estatura) {
		super(nombre, app, edad);
		this.ojos = ojos;
		this.estatura = estatura;
	}
	

	@Override
	public String toString() {
		return "[ojos=" + ojos + ", estatura=" + estatura + ", nombre=" + nombre + ", app=" + app + ", edad="
				+ edad + "]\n";
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	
	
}
