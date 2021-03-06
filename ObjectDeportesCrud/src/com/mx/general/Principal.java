package com.mx.general;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		String nombre;
		String pais;
		int anios;
		int jugadores;
		
		Implementacion imp = new Implementacion();
		Deporte deporte = null;
		Scanner lec= null;
		int menu,menuE;
		
		do {
			System.out.println("Bienvenidos");
			System.out.println("1 alta");
			System.out.println("2 editar");
			System.out.println("3 eliminar");
			System.out.println("4 buscar");
			System.out.println("5 contar");
			System.out.println("6 eliminar todo");
			System.out.println("7 mostrar");
			System.out.println("8 salir");
			
			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Opcion Alta");

				System.out.println("Ecribe el nombre del deporte");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();

				System.out.println("Ecribe el nombre del pais");
				lec = new Scanner(System.in);
				pais = lec.nextLine();

				System.out.println("Ecribe los años del deporte");
				lec = new Scanner(System.in);
				anios = lec.nextInt();

				System.out.println("Ecribe la cantidad de jugadores");
				lec = new Scanner(System.in);
				jugadores = lec.nextInt();

				deporte = new Deporte(nombre, pais, anios, jugadores);
				imp.guardar(deporte);
				System.out.println("Se guardo el deporte " + deporte.getNombre() + "Correctamente");

				
				break;

			case 2:
				System.out.println("Ecribe el nombre del deporte a editar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				deporte = new Deporte(nombre);
				deporte = (Deporte) imp.buscar(deporte);
				
				do {
					System.out.println("opcion editar");
					System.out.println("1 pais");
					System.out.println("2 años");
					System.out.println("3 salir");

					lec = new Scanner(System.in);
					menuE = lec.nextInt();

					switch (menuE) {

					case 1:
						System.out.println("Ecribe el pais del deporte");
						lec = new Scanner(System.in);
						pais = lec.nextLine();
						deporte.setPais(pais);

						break;

					case 2:
						System.out.println("Ecribe los años del deporte");
						lec = new Scanner(System.in);
						anios = lec.nextInt();
						deporte.setAnios(anios);
						break;
					}

				} while (menuE < 3);

				break;
				
			case 3:
				System.out.println("Ecribe el nombre del deporte a eliminar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				deporte = new Deporte(nombre);
				deporte = (Deporte) imp.buscar(deporte);
				imp.eliminar(deporte);
				System.out.println("deporte eliminado ~> " + deporte);

				break;
				
			case 4:
				System.out.println("Ecribe nombre de deporte a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				deporte = new Deporte(nombre);
				deporte = (Deporte) imp.buscar(deporte);
				System.out.println("deporte encontrado ~> " + deporte);
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
				System.out.println("<~ BYE ~>");
				break;
				
			}
			
		} while (menu < 8);
	}

}
