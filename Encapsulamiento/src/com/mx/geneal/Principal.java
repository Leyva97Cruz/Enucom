package com.mx.geneal;

public class Principal {
	
	public static void main(String[] args) {
		
		// Instanciar clase
		
		Perro perro = new Perro();
		
		// Setear Valores
		
		perro.setNombre("Arya");
		perro.setRaza("Bull dog");
		perro.setEdad(5);
		
		System.out.println("El Perro tiene lo siguiente");
		System.out.println("Nombre -> " + perro.getNombre());
		System.out.println("Edad -> " + perro.getEdad());
		System.out.println("Raza -> " + perro.getRaza());
		
	}

}
