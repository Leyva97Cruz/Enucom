package com.mx.general;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		String Nombre;
		int NumeroDePlaneta;
		double Masa;
		String Vida;
		
		Planetas Planeta = null;
		
		int menu;
		Scanner lec = null;
		
		do {
			
			System.out.println("Bienvenidos");
			System.out.println("1 alta");
			System.out.println("2 mostrar");
			System.out.println("3 salir");
			
			lec = new Scanner(System.in);
			menu = lec.nextInt();
			
			switch (menu) {
			case 1:
				
				System.out.println("Opcion Alta");
				
				System.out.println("Escribe el nombre del planeta");
				lec = new Scanner(System.in);
				Nombre = lec.nextLine();
				
				System.out.println("Escribe que numero de planeta es");
				lec = new Scanner(System.in);
				NumeroDePlaneta = lec.nextInt();
				
				System.out.println("Escribe la masa del planeta");
				lec = new Scanner(System.in);
				Masa = lec.nextDouble();
				
				System.out.println("Escribe si el planeta esta en vida");
				lec = new Scanner(System.in);
				Vida = lec.nextLine();
						
				Planeta = new Planetas();
				
				Planeta.setNombre(Nombre);
				Planeta.setNumeroDePlaneta(NumeroDePlaneta);
				Planeta.setMasa(Masa);
				Planeta.setVida(Vida);

				
				System.out.println("Se dio de alta el celular" + Planeta.getNombre());
				break;
				
			case 2:
				System.out.println("Opcion mostar");
				System.out.println("Nombre del planeta -> " + Planeta.getNombre());
				System.out.println("Numero de planeta -> " + Planeta.getNumeroDePlaneta());
				System.out.println("Masa del planeta -> " + Planeta.getMasa());
				System.out.println("Tiene Vida -> " + Planeta.getVida());
				
				
				
			}
			
			
		} while (menu < 3);
		
	}

}
