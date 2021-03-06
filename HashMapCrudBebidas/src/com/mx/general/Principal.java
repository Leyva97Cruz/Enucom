package com.mx.general;

import java.util.Scanner;

import com.mx.general.Bebida;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		double precio;
		double calorias;
		double contenido;

		Bebida bebida = null;
		Implementacion imp = new Implementacion();
		int menu, menuE;
		Scanner lec = null;

		do {

			System.out.println("Bienvenidos a su tienda de bebidas Enucom");
			System.out.println("1 alta");
			System.out.println("2 edita");
			System.out.println("3 eliminar");
			System.out.println("4 buscar");
			System.out.println("5 mostrar");
			System.out.println("6 contar");
			System.out.println("7 salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Opcion Alta");

				System.out.println("Ecribe el nombre de la bebida");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Ecribe el precio de la bebida");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();

				System.out.println("Ecribe las calorias de la bebida");
				lec = new Scanner(System.in);
				calorias = lec.nextDouble();

				System.out.println("Ecribe el contenido de la bebida");
				lec = new Scanner(System.in);
				contenido = lec.nextDouble();

				bebida = new Bebida(nombre, precio, calorias, contenido);
				imp.guardar(bebida);
				System.out.println("Se guardo la bebida " + bebida.getNombre() + "Correctamente");

				break;

			case 2:
				System.out.println("Ecribe el nombre de la bebida a editar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				bebida = new Bebida(nombre);
				bebida = imp.buscar(bebida);
				do {
					System.out.println("opcion editar");
					System.out.println("1 precio");
					System.out.println("2 calorias");
					System.out.println("3 salir");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {

					case 1:
						System.out.println("Ecribe el precio de la bebida");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						bebida.setCalorias(precio);

						break;

					case 2:
						System.out.println("Ecribe las calorias de la bebida");
						lec = new Scanner(System.in);
						calorias = lec.nextDouble();
						bebida.setCalorias(calorias);
						break;
					}

				} while (menuE < 3);

				break;
			case 3:
				System.out.println("Ecribe el nombre de la bebida");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				bebida = new Bebida(nombre);
				bebida = imp.buscar(bebida);
				imp.eliminar(bebida);
				System.out.println("bebida eliminada ~> " + bebida);

				break;

			case 4:
				System.out.println("Ecribe nombre de la bebida a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				bebida = new Bebida(nombre);
				bebida = imp.buscar(bebida);
				System.out.println("Bebida encontrada ~> " + bebida);
				break;

			case 5:
				imp.mostrar();

				break;

			case 6:
				imp.contar();
				break;
			case 7:
				System.out.println(" > Bye <");
				break;
			}

		} while (menu < 7);

	}

}
