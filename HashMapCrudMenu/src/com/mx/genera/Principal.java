package com.mx.genera;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int clave;
		String nombre;
		int anios;
		String pais;
		Lenguaje lenguaje = null;
		Implementacion imp = new Implementacion();
		Scanner lec = null;
		
		int menu, menuE;
		
		do {

			System.out.println("Bienvenidos a Enucom");
			System.out.println("1 alta");
			System.out.println("2 edita");
			System.out.println("3 eliminar");
			System.out.println("4 buscar");
			System.out.println("5 mostrar");
			System.out.println("6 salir");
			
			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println(" alta de lenguaje");
				
				System.out.println("Ecribe la clave del lenguaje");
				lec = new Scanner(System.in);
				clave= lec.nextInt();
				
				System.out.println("Ecribe el nombre del lenguaje");
				lec = new Scanner(System.in);
				nombre= lec.nextLine();
				
				System.out.println("Ecribe los años del lenguaje");
				lec = new Scanner(System.in);
				anios= lec.nextInt();
				
				System.out.println("Ecribe el pais del lenguaje");
				lec = new Scanner(System.in);
				pais= lec.nextLine();
				lenguaje =  new Lenguaje(clave, nombre, anios, pais);
				imp.guardar(lenguaje);
				System.out.println("Se guardo el lenguaje " + lenguaje.getNombre() + "Correctamente");
				
				break;
				
			case 2:
				System.out.println("Ecribe la clave del lenguaje a edita");
				lec = new Scanner(System.in);
				clave= lec.nextInt();
				lenguaje = new Lenguaje(clave);
				lenguaje = imp.buscar(lenguaje);
				do {
					System.out.println("opcion editar");
					System.out.println("1 nombre");	
					System.out.println("2 años");
					System.out.println("3 salir");
					
					lec = new Scanner(System.in);
					menuE = lec.nextInt();
					
					switch (menuE) {
					
					case 1:
						System.out.println("Ecribe el nombre del lenguaje a editar");
						lec = new Scanner(System.in);
						nombre= lec.nextLine();
						lenguaje.setNombre(nombre);
						
						break;

					case 2:
						System.out.println("Ecribe el año del lenguaje a editar");
						lec = new Scanner(System.in);
						anios= lec.nextInt();
						lenguaje.setAnios(anios);
						break;
					}
					
					
				} while (menuE < 3);
				
				break;
				
			case 3:
				System.out.println("Ecribe la clave del lenguaje a eliminar");
				lec = new Scanner(System.in);
				clave= lec.nextInt();
				lenguaje = new Lenguaje(clave);
				lenguaje = imp.buscar(lenguaje);
				imp.eliminar(lenguaje);
				System.out.println("Lenguaje eliminado ~> " + lenguaje);
				
				break;

			case 4:
				System.out.println("Ecribe la clave del lenguaje a buscar");
				lec = new Scanner(System.in);
				clave= lec.nextInt();
				lenguaje = new Lenguaje(clave);
				lenguaje = imp.buscar(lenguaje);
				System.out.println("Lenguaje encontrado ~> " + lenguaje);
				
				break;
				
			case 5:
				imp.mostrar();
				break;
				
			case 6:
				System.out.println("BYE");
				break;
			}
			
		} while (menu < 6);
		

	}

}
