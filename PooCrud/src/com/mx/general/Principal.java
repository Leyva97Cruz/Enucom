package com.mx.general;

import java.util.Scanner;

import com.mx.entidad.Celular;
import com.mx.entidad.Marca;
import com.mx.entidad.So;
import com.mx.implementacion.ImpCelular;
import com.mx.implementacion.ImpMarca;
import com.mx.implementacion.ImpSo;

public class Principal {

	public static void main(String[] args) {

		try {
			ImpCelular impCelular = new ImpCelular();
			ImpSo impSo = new ImpSo();
			ImpMarca impMarca = new ImpMarca();

			System.out.println("<- Marcas de celulares ->");

			Marca marca1 = new Marca("Sony", "Japon", 100);
			impMarca.guardar(marca1.getNombre(), marca1);

			Marca marca2 = new Marca("Xiaomi", "China", 90);
			impMarca.guardar(marca2.getNombre(), marca2);

			Marca marca3 = new Marca("Samsumg", "Corea del sur", 105);
			impMarca.guardar(marca3.getNombre(), marca3);

			impMarca.mostrar();

			System.out.println("<- Sistemas opereativos ->");

			So so1 = new So("Android", "nativo", "10");
			impSo.guardar(so1.getNombre(), so1);

			So so2 = new So("BlackBerry OS", "nativo", "11");
			impSo.guardar(so2.getNombre(), so2);

			So so3 = new So("IOS", "nativo", "12");
			impSo.guardar(so3.getNombre(), so3);

			impSo.mostrar();

			String modelo;
			double precio;
			int ram;
			int rom;
			Marca marca;
			String marcaB;
			So so;
			String soB;

			Celular celular = null;

			Scanner lec = null;
			int menu, menuE;

			do {

				System.out.println("Bienvenidos a Enucom");
				System.out.println("1 -> Alta");
				System.out.println("2 -> Edita");
				System.out.println("3 -> Eliminar");
				System.out.println("4 -> Mostrar celular por su marca");
				System.out.println("5 -> Buscar celular");
				System.out.println("6 -> Motrar celular");
				System.out.println("7 -> Elimar por Marca");
				System.out.println("8 -> Contar Celulares por sistema operativo");
				System.out.println("9 -> Salir");

				lec = new Scanner(System.in);
				menu = lec.nextInt();

				switch (menu) {
				case 1:
					System.out.println(" -> Opcion Alta <-");

					System.out.println("Escribe el modelo del celular");
					lec = new Scanner(System.in);
					modelo = lec.nextLine();

					System.out.println("Escribe el precio del celular");
					lec = new Scanner(System.in);
					precio = lec.nextDouble();

					System.out.println("Escribe la ram del celular");
					lec = new Scanner(System.in);
					ram = lec.nextInt();

					System.out.println("Escribe la rom del celular");
					lec = new Scanner(System.in);
					rom = lec.nextInt();

					System.out.println("Marcas de celulares");
					impMarca.mostrar();
					System.out.println("Selecciona una marca escribiendo su nombre");

					lec = new Scanner(System.in);
					marca = (Marca) impMarca.buscar(lec.nextLine());

					System.out.println("Sistemas Operativos");
					impSo.mostrar();
					System.out.println("Selecciona un So escribiendo su nombre");

					lec = new Scanner(System.in);
					so = (So) impSo.buscar(lec.nextLine());

					celular = new Celular(modelo, precio, ram, rom, marca, so);
					impCelular.guardar(celular.getModelo(), celular);

					System.out.println(" Se guardo correctamente el celular " + celular.getModelo());

					break;

				case 2:
					System.out.println("Escribe el modelo del celular a editar");

					lec = new Scanner(System.in);
					modelo = lec.nextLine();
					celular = (Celular) impCelular.buscar(modelo);

					do {
						System.out.println("Opcion Editar");
						System.out.println("1 Precio");
						System.out.println("2 Ram");
						System.out.println("3 Rom");
						System.out.println("4 Marca");
						System.out.println("5 So");
						System.out.println("6 Salir");

						lec = new Scanner(System.in);
						menuE = lec.nextInt();

						switch (menuE) {

						case 1:

							System.out.println("Escribe el nuevo precio del celular");
							lec = new Scanner(System.in);
							precio = lec.nextDouble();
							celular.setPrecio(precio);

							break;

						case 2:

							System.out.println("Escribe la nueva ram del celular");
							lec = new Scanner(System.in);
							ram = lec.nextInt();
							celular.setRam(ram);

							break;
						case 3:

							System.out.println("Escribe la nueva rom del celular");
							lec = new Scanner(System.in);
							rom = lec.nextInt();
							celular.setRom(rom);

							break;

						case 4:

							impMarca.mostrar();
							System.out.println("Selecciona una marca escribiendo su nombre");

							lec = new Scanner(System.in);
							marca = (Marca) impMarca.buscar(lec.nextLine());
							celular.setMarca(marca);
							break;
						case 5:

							impSo.mostrar();
							System.out.println("Selecciona un So escribiendo su nombre");

							lec = new Scanner(System.in);

							so = (So) impSo.buscar(lec.nextLine());
							celular.setSo(so);

							break;

						}

					} while (menuE < 6);

					break;
				case 3:

					System.out.println("Escribe el modelo del celular a eliminar");
					lec = new Scanner(System.in);
					modelo = lec.nextLine();
					impCelular.eliminar(modelo);

					break;

				case 4:
					System.out.println("Escribe la marca a buscar");
					lec = new Scanner(System.in);
					String marcaCelular = lec.nextLine();
					marca = (Marca) impMarca.buscar(marcaCelular);
					impCelular.buscarMarca(marca);

					break;
				case 5:
					System.out.println("Escribe el modelo del celular a buscar");
					lec = new Scanner(System.in);
					modelo = lec.nextLine();
					celular = (Celular) impCelular.buscar(modelo);
					System.out.println(" Celular encontrado " + celular);
					break;

				case 6:
					impCelular.mostrar();
					break;
				case 7:
					System.out.println("Escribe la marca a eliminar");
					lec = new Scanner(System.in);
					marca = (Marca) impMarca.buscar(lec.nextLine());
					impCelular.eliminarMarca(marca);
					break;
				case 8:
					System.out.println("Escribe el sistema operativo para contar");
					lec = new Scanner(System.in);
					so = (So) impSo.buscar(lec.nextLine());
					impCelular.contartSo(so);
					
					break;
				case 9:
					System.out.println(" <~ BYE ~>");
					break;
				}

			} while (menu < 9);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
