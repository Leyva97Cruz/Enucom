package com.mx.general;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String modelo;
		String marca;
		double precio;
		int ram;

		Celular cel = null;
		int menu;
		Scanner lec = null; // Lectura del teclado
		do {
			System.out.println("Bienvenidos a la tienda Enucom");
			System.out.println("1 alta");
			System.out.println("2 mostrar");
			System.out.println("e salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			
			case 1:
				System.out.println("Opcion Alta");
				
				System.out.println("Escribe el modelo");
				lec = new Scanner(System.in);
				modelo = lec.nextLine();
				
				System.out.println("Escribe la marca del celular");
				lec = new Scanner(System.in);
				marca = lec.nextLine();
				
				System.out.println("Escribe el precio del celular");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
						
				cel = new  Celular();
				cel.setModelo(modelo);
				cel.setMarca(marca);
				cel.setPrecio(precio);
				
				System.out.println("Se dio de alta el celular" + cel.getModelo());
				break;
				
			case 2:
				System.out.println("Opcion mostar");
				System.out.println("Modelo -> " + cel.getModelo());
				System.out.println("Marca -> " + cel.getMarca());
				System.out.println("Precio -> " + cel.getPrecio());

			}
		} while (menu < 3);

	}

}
