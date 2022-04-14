package com.mx.general;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		String nombre; 
		String genero; 
		double duracion; 
		String cantante;
		
		Musica musica = null;
		Scanner lec = null;
		int menu;
		
		do {
			
			System.out.println("Bienvenidos a su playlist Enucom");
			System.out.println("1 Alta");
			System.out.println("2 Editar");
			System.out.println("3 Mostrar");
			System.out.println("4 Salir");

			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("OPCION ALTA");
				
				System.out.println("Escribe el Nombre de la cacion");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				System.out.println("Escribe el Genero de la cacion");
				lec = new Scanner(System.in);
				genero = lec.nextLine();
				
				System.out.println("Escribe la duracion de la cacion");
				lec = new Scanner(System.in);
				duracion = lec.nextDouble();
				
				System.out.println("Escribe el Nombre del cantante");
				lec = new Scanner(System.in);
				cantante= lec.nextLine();
				
				musica = new Musica(nombre, genero, duracion, cantante);
				
				System.out.println("Se dio de alta la cancion" + musica.getNombre());
				
				break;
			case 2:
				System.out.println("Escribe el nuevo genero de la cancion");
				lec = new Scanner(System.in);
				genero = lec.nextLine();

				musica.setGenero(genero);

				System.out.println("Se edito el genero de la cancion " + musica.getNombre() + "Correctamente");
				break;
				
			case 3:
				System.out.println(musica);
				break;
			case 4:
				System.out.println("BYE");
			}
			
			
		} while (menu < 4);
	}

}
