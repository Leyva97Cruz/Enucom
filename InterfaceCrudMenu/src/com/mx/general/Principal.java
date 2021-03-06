package com.mx.general;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		String nombre;
		String marca;
		double precio;
		ConsolasVJ consola = null;
		int menu,menuE,indice;
		Scanner lec = null;
		
		Implementacion imp = new Implementacion();
		
		do {
			System.out.println("Bienvenidos a su tienda de video juegos enucom");
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
				
				System.out.println("Ecribe el nombre de la consola");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				System.out.println("Ecribe la marca de la consola");
				lec = new Scanner(System.in);
				marca = lec.nextLine();
				
				
				System.out.println("Ecribe el precio de la consola");
				lec = new Scanner(System.in);
				precio = lec.nextDouble();
				
				consola = new ConsolasVJ(nombre, marca, precio);
				imp.Guardar(consola);
				System.out.println("Se guardo la consola " + consola.getNombre());
				
				break;

			case 2:
				System.out.println("Escribre el indice de la consola a editar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				consola = imp.buscar(indice);
				do {
					System.out.println("Opcion editar");
					System.out.println("1 ~> Precio");
					System.out.println("2 ~> Marca");
					System.out.println("3 ~> Menu Principal");
					
					lec = new Scanner(System.in);
					menuE = lec.nextInt();
					switch (menuE) {
					case 1:
						System.out.println("Escribe el nuevo precio de la consola");
						lec = new Scanner(System.in);
						precio = lec.nextDouble();
						consola.setPrecio(precio);
						
						break;

					case 2:
						System.out.println("Escribe la nueva marca de la consola");
						lec = new Scanner(System.in);
						marca = lec.nextLine();
						consola.setMarca(marca);
						break;
					}
					
				} while (menuE < 3);

				
				break;
				
			case 3:
				System.out.println("Escribre el indice de la consola a leiminar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				consola = imp.buscar(indice);
				imp.Eliminar(indice);
				System.out.println("Se elimino la consola" + consola.getNombre());
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
				System.out.println("Escribe el indice de la consola a buscar");
				lec = new Scanner(System.in);
				indice = lec.nextInt();
				consola = imp.buscar(indice);
				System.out.println("Consola Encontrada ~> " + consola);
				break;

			case 8:
				System.out.println("Escribe el nombre de la consola a buscar");
				lec = new Scanner(System.in);
				nombre = lec.nextLine();
				
				consola = new ConsolasVJ(nombre);
				System.out.println("Consola sin buscar ~> " + consola);
				imp.buscarNoombre(consola);
				break;
			case 9:
				imp.mostrar();
				
				break;

			case 10:
				System.out.println(" ~> BYE <~");
				break;
			}
			

		} while (menu <10);
		 
	}

}
