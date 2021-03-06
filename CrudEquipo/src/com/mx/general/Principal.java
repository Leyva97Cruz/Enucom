package com.mx.general;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		String nombre;
		String ciudad;
		int copas;
		int anios;
		
		int menu, menuE, indice;
		EquiposDeFutbol equipo = null;
		Scanner lec = null;
		Implementacion imp = new Implementacion();
		
		do {
			System.out.println("Bienvenidos");
			System.out.println(" 1 ~> Alta");
			System.out.println(" 2 ~> Editar");
			System.out.println(" 3 ~> Eliminar");
			System.out.println(" 4 ~> Eliminar Todo");
			System.out.println(" 5 ~> Vacia");
			System.out.println(" 6 ~> Contar");
			System.out.println(" 7 ~> Buscar");
			System.out.println(" 8 ~> Buscar Nombre");
			System.out.println(" 9 ~> Mostrar");
			System.out.println(" 10 ~> Salir");
			
			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch (menu) {
			case 1:

				System.out.println(" Opcion Alta");

				System.out.println("Ecribe el nombre del equipo");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Ecribe la cuida del equipo");
				lec = new Scanner(System.in);
				ciudad = lec.nextLine();

				System.out.println("Ecribe Cuantas Copas tiene");
				lec = new Scanner(System.in);
				copas = lec.nextInt();

				System.out.println("Ecribe los años del equipo");
				lec = new Scanner(System.in);
				anios = lec.nextInt();

				equipo = new EquiposDeFutbol(nombre, ciudad, copas, anios);
				imp.Guardar(equipo);
				System.out.println("Se guardo el quipo " + equipo.getNombre());

				break;

			case 2:
				System.out.println("Escribre el indice del quipo a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				equipo= imp.buscar(indice);
				do {
					System.out.println("Opcion editar");
					System.out.println("1 ~> Copas");
					System.out.println("2 ~> Años");
					System.out.println("3 ~> Menu Principal");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();
					switch (menuE) {
					case 1:
						System.out.println("Escribe los Años "); //capiutlos o fechaEstreno
						lec = new Scanner(System.in);
						anios = lec.nextInt();
						equipo.setAnios(anios);

						break;

					case 2:
						System.out.println("Escribe las copas");
						lec = new Scanner(System.in);
						copas = lec.nextInt();
						equipo.setCopas(copas);
						break;
					}

				} while (menuE < 3);

				break;

			case 3:
				System.out.println("Escribre el indice del equipo a eiminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				equipo = imp.buscar(indice);
				imp.Eliminar(indice);
				System.out.println("Se elimino el quipo" + equipo.getNombre() + " Corectamente");

				break;

			case 4:
				imp.EliminarTodo();

				break;
			case 5:
				imp.vacia();

				break;

			case 6:
				imp.contar();

				break;
			case 7:
				System.out.println("Escribe el indice del equipo a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				equipo = imp.buscar(indice);
				System.out.println("Equipo encontrado ~> " + equipo);

				break;

			case 8:
				System.out.println("Escribe el nombre del equipo a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				equipo = new EquiposDeFutbol(nombre);
				System.out.println("Equipo encontrado ~> " + equipo);
				imp.buscarNoombre(equipo);

				break;
			case 9:
				imp.mostrar();

				break;

			case 10:
				System.out.println(" ~> BYE <~");

				break;

			}
			
			
		} while (menu < 10);
	}

}
