package com.mx.general;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		String app;
		String genero;
		String pais;
		int edad;

		Implementacion imp = new Implementacion();
		int menu, menuE;
		Scanner lec = null;
		Cantante cantante = null;

		do {
			System.out.println("Bienvenidos");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 eliminar");
			System.out.println("4 buscar");
			System.out.println("5 contar");
			System.out.println("6 eliminar todo");
			System.out.println("7 mostrar");
			System.out.println("8 vacio");
			System.out.println("9 burcar por genero");
			System.out.println("10 salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {

			case 1:
				System.out.println("Opcion Alta");

				System.out.println("Ecribe el nombre del cantante");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Ecribe la app");
				lec = new Scanner(System.in);
				app = lec.nextLine();

				System.out.println("Ecribe escribe el genero");
				lec = new Scanner(System.in);
				genero = lec.nextLine();

				System.out.println("Ecribe la edad del cantante");
				lec = new Scanner(System.in);
				edad = lec.nextInt();

				System.out.println("Ecribe el pais del cantante");
				lec = new Scanner(System.in);
				pais = lec.nextLine();

				cantante = new Cantante(nombre, app, genero, pais, edad);
				imp.guardar(cantante);
				System.out.println("Se guardo el cantante " + cantante.getNombre() + " Correctamente");
				break;

			case 2:
				System.out.println("Ecribe el nombre del cantante a editar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				cantante = new Cantante(nombre);
				cantante = (Cantante) imp.buscar(cantante);

				do {
					System.out.println("opcion editar");
					System.out.println("1 genero");
					System.out.println("2 pais");
					System.out.println("3 salir");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {

					case 1:
						System.out.println("Ecribe el genero del cantante");
						lec = new Scanner(System.in);
						genero = lec.nextLine();
						cantante.setGenero(genero);

						break;

					case 2:
						System.out.println("Ecribe el pais del cantante");
						lec = new Scanner(System.in);
						pais = lec.nextLine();
						cantante.setPais(pais);
						break;
					}

				} while (menuE < 3);

				break;
			case 3:
				System.out.println("Ecribe el nombre del cantante a eliminar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				cantante = new Cantante(nombre);
				cantante = (Cantante) imp.buscar(cantante);
				imp.eliminar(cantante);
				System.out.println("Cantante eliminado ~> " + cantante);

				break;

			case 4:
				System.out.println("Ecribe nombre del cantante a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				cantante = new Cantante(nombre);
				cantante = (Cantante) imp.buscar(cantante);
				System.out.println("cantante encontrado ~> " + cantante);
				break;
			case 5:
				imp.contar();
				break;

			case 6:
				imp.eliminarTodo();
				break;
			case 7:
				imp.mostrar();
				break;

			case 8:
				imp.vacio();
				break;
			case 9:
				System.out.println("Escribe el genero buscar");
				lec = new Scanner(System.in);
				genero = lec.nextLine();
				cantante = new Cantante();
				cantante.setGenero(genero);
				imp.buscarGenero(cantante);
				break;

			case 10:
				System.out.println("<~ BYE ~>");
				break;
			}

		} while (menu < 10);

	}

}
