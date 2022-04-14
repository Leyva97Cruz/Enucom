package com.mx.general;

public class Principal {
	
	public static void main(String[] args) {
		
		Medico m = new Medico("Gregory", "c1", "t1", "Buap", "No usa", "Diagnosta");
		System.out.println("Medico -> " + m);
		
		m.cobrar(1000, "Efectivo");
		// metodo abstracto
		m.trabajar();
		m.consultando();
		System.out.println("Ing Sistemas <- ----------------- ->");
		IngSistemas i = new IngSistemas("Mark", "c2", "t2", "UNAM", "php", "Angular");
		i.cobrar(5000, "Nomina");
		// metodo abstracto
		i.trabajar();
		// metodo propio de la clase
		i.codeando();
	}
	
	

}
