package com.mx.general;

import java.util.Scanner;


import com.mx.entidad.Pais;
import com.mx.entidad.Perro;
import com.mx.entidad.Raza;
import com.mx.implementacion.ImpPais;
import com.mx.implementacion.ImpPerro;
import com.mx.implementacion.ImpRaza;

public class Principal {
	public static void main(String[] args) {

		ImpPais impPais = new ImpPais();
		ImpRaza impRaza = new ImpRaza();
		ImpPerro impPerro = new ImpPerro();

		Pais p = new Pais();
		Raza r = new Raza();

		System.out.println("CD Paises");

		p = new Pais("Mexico", "Americano");
		impPais.guardar(p.getNombre(), p);

		p = new Pais("Usa", "Americano");
		impPais.guardar(p.getNombre(), p);

		p = new Pais("Alemania", "Europeo");
		impPais.guardar(p.getNombre(), p);

		impPais.mostrar();

		System.out.println("CD Raza");

		r = new Raza("Pastor Aleman", "Grande", 10);
		impRaza.guardar(r.getNombre(), r);

		r = new Raza("Chihuahua", "Chico", 9);
		impRaza.guardar(r.getNombre(), r);

		r = new Raza("Pitbull", "Mediano", 10);
		impRaza.guardar(r.getNombre(), r);

		impRaza.mostrar();

		String nombre;
		String color;
		int edad;
		Raza raza;
		Pais pais;

		Scanner lec = null;
		Perro perro = null;

		int menu = 0;
		int menuE = 0;

		try {
			do {
				System.out.println("1 Alta perro");
				System.out.println("2 Mostrar perro");
				System.out.println("3 Editar perro");
				System.out.println("4 Eliminar perro");
				System.out.println("5 Buscar perro");
				System.out.println("6 Buscar perro por raza");
				System.out.println("7 salir");

				lec = new Scanner(System.in);
				menu = lec.nextInt();

				switch (menu) {

				case 1:
					System.out.println("Ocion alta");

					System.out.println("Escribe el nombre del perro");
					lec = new Scanner(System.in);
					nombre = lec.nextLine();

					System.out.println("Escribe el color del perro");
					lec = new Scanner(System.in);
					color = lec.nextLine();

					System.out.println("Escribe la edad del perro");
					lec = new Scanner(System.in);
					edad = lec.nextInt();

					impRaza.mostrar();
					System.out.println("escribe el nombre de la raza de acuerdo a lo anterior");
					lec = new Scanner(System.in);
					raza = (Raza) impRaza.buscar(lec.nextLine());

					impPais.mostrar();
					System.out.println("Escribe el nombre del Pais de acuerdo a lo anterior");
					lec = new Scanner(System.in);
					pais = (Pais) impPais.buscar(lec.nextLine());

					perro = new Perro(nombre, color, edad, raza, pais);
					impPerro.guardar(perro.getNombre(), perro);
					System.out.println("Se guardo correctamente el perro " + perro.getNombre());

					break;

				case 2:
					impPerro.mostrar();
					break;

				case 3:

					System.out.println("Escribe el nombre del perro a editar ");
					lec = new Scanner(System.in);
					nombre = lec.nextLine();
					perro = (Perro) impPerro.buscar(nombre);

					do {
						System.out.println("Opcion editar ");
						System.out.println("1 Editar edad");
						System.out.println("2 Editar color");
						System.out.println("3 Editar raza");
						System.out.println("4 Editar pais");
						System.out.println("5 salir");

						lec = new Scanner(System.in);
						menuE = lec.nextInt();
						switch (menuE) {

						case 1:
							System.out.println("Escribe la nueva edad del perro");
							lec = new Scanner(System.in);
							edad = lec.nextInt();
							perro.setEdad(edad);

							break;

						case 2:
							System.out.println("Escribe el nuevo color del perro");
							lec = new Scanner(System.in);
							color = lec.nextLine();
							perro.setColor(color);
							break;

						case 3:

							impRaza.mostrar();
							System.out.println("Escribe la nueva raza del perro");
							lec = new Scanner(System.in);
							raza = (Raza) impRaza.buscar(lec.nextLine());
							perro.setRaza(raza);

							break;

						case 4:

							impPais.mostrar();
							System.out.println("Escribe el nevo pais del perro");
							lec = new Scanner(System.in);
							pais = (Pais) impPais.buscar(lec.nextLine());
							perro.setPais(pais);

							break;

						}

					} while (menuE < 5);

					break;
				case 4:
					System.out.println("Escribe el nombre del perro a eliminar");
					lec = new Scanner(System.in);
					nombre = lec.nextLine();
					perro = (Perro) impPerro.buscar(nombre);
					impPerro.eliminar(perro.getNombre());
					System.out.println("Perro eliminado " + perro);

					break;

				case 5:
					System.out.println("Escribe el nombre del perro a buscar");
					lec = new Scanner(System.in);
					nombre = lec.nextLine();
					perro = (Perro) impPerro.buscar(nombre);
					System.out.println("Perro encontrado " + perro);
					break;

				case 6:

					System.out.println("Escribe la raza del perro a buscar");
					lec = new Scanner(System.in);
					raza = (Raza) impRaza.buscar(lec.nextLine());
					impPerro.buscarRaza(raza);

					break;

				case 7:
					System.out.println("BYE");
					break;

				}

			} while (menu < 7);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}

	}
}
