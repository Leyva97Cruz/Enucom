package com.mx.general;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {

		String Nombre;
		String Capital;
		int Habitantes;
		double extencion;

		Paises Pais = null;
		Scanner lec = null;
		int menu;

		do {
			System.out.println("Bienvenidos a Enucom");
			System.out.println("1 Alta");
			System.out.println("2 Editar");
			System.out.println("3 Mostrar");
			System.out.println("4 Salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Opción Alta");

				System.out.println("Escribe el Nombre del Pais");
				lec = new Scanner(System.in);
				Nombre = lec.nextLine();

				System.out.println("Escribe la Capital del Pais");
				lec = new Scanner(System.in);
				Capital = lec.nextLine();

				System.out.println("Escribe el Numero de Habitantes");
				lec = new Scanner(System.in);
				Habitantes = lec.nextInt();

				System.out.println("Escribe el Numero de Kilometros que mide el Pais");
				lec = new Scanner(System.in);
				extencion = lec.nextDouble();

				Pais = new Paises(Nombre, Capital, Habitantes, extencion);
				System.out.println("Se dio de alta el auto " + Pais.getNombre());
				break;

			case 2:
				System.out.println("Escribe el Numero de habitantes a editar");
				lec = new Scanner(System.in);
				Habitantes = lec.nextInt();

				Pais.setHabitantes(Habitantes);

				System.out.println("Se edito el numero de habitantes del pais " + Pais.getNombre() + "Correctamente");
				break;

			case 3:
				System.out.println(Pais);
				break;

			}

		} while (menu < 4);

	}

}
