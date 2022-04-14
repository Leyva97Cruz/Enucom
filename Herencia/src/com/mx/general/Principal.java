package com.mx.general;

public class Principal {

	public static void main(String[] args) {
		 Hijo h = new Hijo("Gohan", "Son", 13, "cafe", 1.5);
		 
		 System.out.println(h);
		 // metodo de la clase padre
		 h.setApp("Occsatan");
		 // metodo de la clase hija
		 h.setOjos("Verde");
		 System.out.println(h);
	}
}
