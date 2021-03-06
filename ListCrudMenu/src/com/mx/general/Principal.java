package com.mx.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String nombre;
		int habitantes;
		double extencion;

		Continentes contienente = null;
		Scanner lec = null;
		int menu;
		int indice;

		List<Continentes> lista = new ArrayList<Continentes>();

		do {
			System.out.println("Bienvenido al registro del continente");
			System.out.println(" 1 Alta");
			System.out.println(" 2 Editar");
			System.out.println(" 3 Eliminar");
			System.out.println(" 4 Buscar");
			System.out.println(" 5 Mostrar");
			System.out.println(" 6 Salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			switch (menu) {
			case 1:
				System.out.println("OPCION ALTA");
				System.out.println("Escribe el nombre del contiente");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Escribe el numero de habitantes");
				lec = new Scanner(System.in);
				habitantes = lec.nextInt();

				System.out.println("Escribe la extencion");
				lec = new Scanner(System.in);
				extencion = lec.nextDouble();

				contienente = new Continentes(nombre, habitantes, extencion);

				lista.add(contienente);
				System.out.println("Se guardo el continente --> " + contienente.getNombre() + " Correctamente");

				break;

			case 2:
				System.out.println("Escribe el indice del acontinente a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				contienente = lista.get(indice);

				System.out.println("Escribe la nueva extencion");
				lec = new Scanner(System.in);
				extencion = lec.nextDouble();
				contienente.setExtencion(extencion);

				lista.set(indice, contienente);
				System.out.println(
						"Se edito la extencion del continente --> " + contienente.getNombre() + " Correctamente");

				break;

			case 3:
				System.out.println("Escribe el indice del acontinente a Eliminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				contienente = lista.remove(indice);
				System.out.println("El continente eliminado es --> " + contienente.getNombre());
				break;
			case 4:
				System.out.println("Escribe el indice del acontinente a busca");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				contienente = lista.get(indice);
				System.out.println("El continente encontrado es --> " + contienente);

				break;
			case 5:
				System.out.println(lista);
				break;
			case 6:
				System.out.println("BYE");
				break;
			}

		} while (menu < 6);

	}

}
