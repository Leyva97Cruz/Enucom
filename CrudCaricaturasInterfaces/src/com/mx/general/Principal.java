package com.mx.general;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		String genero;
		int capitulos;
		String fechaEstreno;

		int menu, menuE, indice;
		Caricatura caricatura = null;
		Scanner lec = null;
		Implementacion imp = new Implementacion();

		do {
			System.out.println("Bienvenidos tv de caricaturas enucom");
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

				System.out.println("Ecribe el nombre de la Caricatura");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Ecribe el genero de la caricatura");
				lec = new Scanner(System.in);
				genero = lec.nextLine();

				System.out.println("Ecribe Cuantos capitulos tiene");
				lec = new Scanner(System.in);
				capitulos = lec.nextInt();

				System.out.println("Ecribel la fecha de estreno");
				lec = new Scanner(System.in);
				fechaEstreno = lec.nextLine();

				caricatura = new Caricatura(nombre, genero, capitulos, fechaEstreno);
				imp.Guardar(caricatura);
				System.out.println("Se guardo la caricatura " + caricatura.getNombre());

				break;

			case 2:
				System.out.println("Escribre el indice de la caricatura a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				caricatura = imp.buscar(indice);
				do {
					System.out.println("Opcion editar");
					System.out.println("1 ~> Precio");
					System.out.println("2 ~> Marca");
					System.out.println("3 ~> Menu Principal");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();
					switch (menuE) {
					case 1:
						System.out.println("Escribe los caputulos "); //capiutlos o fechaEstreno
						lec = new Scanner(System.in);
						capitulos = lec.nextInt();
						caricatura.setCapitulos(capitulos);

						break;

					case 2:
						System.out.println("Escribe la nueva fecha de estreno");
						lec = new Scanner(System.in);
						fechaEstreno = lec.nextLine();
						caricatura.setFechaEstreno(fechaEstreno);
						break;
					}

				} while (menuE < 3);

				break;

			case 3:
				System.out.println("Escribre el indice de la caricatura a leiminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				caricatura = imp.buscar(indice);
				imp.Eliminar(indice);
				System.out.println("Se elimino la caricatura" + caricatura.getNombre());

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
				System.out.println("Escribe el indice de la caricatura a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				caricatura = imp.buscar(indice);
				System.out.println("Consola Encontrada ~> " + caricatura);

				break;

			case 8:
				System.out.println("Escribe el nombre de la Caricatura a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				caricatura = new Caricatura(nombre);
				System.out.println("Consola sin buscar ~> " + caricatura);
				imp.buscarNoombre(caricatura);

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
