package com.mx.general;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String modelo;
		String marca;
		double precio;
		int puertas;

		Auto auto = null;
		Scanner lec = null;
		int menu;

		do {
			System.out.println("Bienvenidos a su concesionaria Enucom");
			System.out.println("1 Alta");
			System.out.println("2 Editar");
			System.out.println("3 Mostrar");
			System.out.println("4 Salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Opción Alta");

				System.out.println("Escribe el modelo del Auto");
				lec = new Scanner(System.in);
				modelo = lec.nextLine();

				System.out.println("Escribe la Marca del Auto");
				lec = new Scanner(System.in);
				marca = lec.nextLine();

				System.out.println("Escribe el Precio del Auto");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				System.out.println("Escribe el Numero de Puertas del Auto");
				lec = new Scanner(System.in);
				puertas = lec.nextInt();

				auto = new Auto(modelo, marca, precio, puertas);
				System.out.println("Se dio de alta el auto " + auto.getModelo());
				break;

			case 2:
				System.out.println("Escribe el precio del auto a editar");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				auto.setPrecio(precio);

				System.out.println("Se edito el precio del auto " + auto.getModelo() + "Correctamente");
				break;

			case 3:
				System.out.println(auto);
				break;

			}

		} while (menu < 4);

	}

}
