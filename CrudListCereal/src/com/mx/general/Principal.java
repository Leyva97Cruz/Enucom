package com.mx.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		 String nombre;
		 String marca;
		 double precio;
		 int contenido;
		 
		 Cereal cereal = null;
		 Scanner lec = null;
		 int menu;
		 int indice;
		 
		 List<Cereal> lista = new ArrayList<Cereal>();
		 
		 do {
				System.out.println("Bienvenido al registro de cereal");
				System.out.println(" 1 Alta");
				System.out.println(" 2 Editar");
				System.out.println(" 3 Eliminar");
				System.out.println(" 4 Buscar");
				System.out.println(" 5 Contar");
				System.out.println(" 6 Mostrar");
				System.out.println(" 7 Salir");

				lec = new Scanner(System.in);
				menu = lec.nextInt();
				
				switch (menu) {
				case 1:
					System.out.println("OPCION ALTA");
					System.out.println("Escribe la nombre del cereal");
					lec = new Scanner(System.in);
					nombre = lec.nextLine();

					System.out.println("Escribe la marca del ceral");
					lec = new Scanner(System.in);
					marca = lec.nextLine();

					System.out.println("Escribe el precio");
					lec = new Scanner(System.in);
					precio = lec.nextDouble();
					
					System.out.println("Escribe el contenido");
					lec = new Scanner(System.in);
					contenido = lec.nextInt();

					cereal = new Cereal(nombre, marca, precio, contenido);

					lista.add(cereal);
					System.out.println("Se guardo el cereal --> " + cereal.getNombre() + " Correctamente");

					break;

				case 2:
					System.out.println("Escribe el indice del cereal para editar el precio");
					lec = new Scanner(System.in);
					indice = lec.nextInt();
					cereal = lista.get(indice);

					System.out.println("Escribe el precio del cereal");
					lec = new Scanner(System.in);
					precio = lec.nextDouble();
					cereal.setPrecio(precio);

					lista.set(indice, cereal);
					System.out.println(
							"Se edito el precio del cereal --> " + cereal.getNombre() + " Correctamente");

					break;

				case 3:
					System.out.println("Escribe el indice del cereal a Eliminar");
					lec = new Scanner(System.in);
					indice = lec.nextInt();
					cereal = lista.remove(indice);
					System.out.println("El continente eliminado es --> " + cereal.getNombre());
					break;
				case 4:
					System.out.println("Escribe el indice del acontinente a busca");
					lec = new Scanner(System.in);
					indice = lec.nextInt();
					cereal = lista.get(indice);
					System.out.println("El continente encontrado es --> " + cereal);
					;
					break;
				case 5:
					System.out.println("La lista contien --> " + lista.size() + " de Cereales ");
					break;
				case 6:
					System.out.println(lista);
					break;
				case 7:
					System.out.print("BYE");
				}
			
		} while (menu < 7);
		
		
	}

}
