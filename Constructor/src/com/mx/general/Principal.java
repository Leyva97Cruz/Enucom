package com.mx.general;

public class Principal {
	
	public static void main(String[] args) {
		
		Refresco R1 = new Refresco();
		
		R1.setNombre("COCA COLA");
		R1.setMarca("Coca Cola");
		R1.setContenido(600);
		R1.setPrecio(15);
		
		System.out.println("Refresco");
		System.out.println("Nombre -> " + R1.getNombre());
		System.out.println("Marca -> " + R1.getMarca());
		System.out.println("Contenido -> " + R1.getContenido());
		System.out.println("Precio -> $" + R1.getPrecio());
		
		// constructor con parametros
		
		Refresco R2 = new Refresco("Mirinda",15,"pepsi",600);
		
		System.out.println("Refresco 2");
		System.out.println(R2);
	}

}
