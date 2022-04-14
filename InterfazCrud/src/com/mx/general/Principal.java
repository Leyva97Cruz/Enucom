package com.mx.general;

public class Principal {

	public static void main(String[] args) {

		Celular c1 = new Celular("G9 Plus", "Motorola", 5, 64);
		Celular c2 = new Celular("13 Pro Max", "Iphone", 42, 1000);
		Celular c3 = new Celular("S22 Plus", "Samsung", 28, 560);
		Celular cc = null;

		Implementacion imp = new Implementacion();
		// guardar
		imp.guardar(c1);
		imp.guardar(c2);
		imp.guardar(c3);

		imp.mostrar();

		cc = imp.buscar(1);
		System.out.println("Celular encontrado --> " + cc);
		// editar
		cc = imp.buscar(2);
		cc.setPrecio(29000);
		imp.editar(cc, 2);
		imp.mostrar();

		// eliminar
		imp.eliminar(0);
		imp.mostrar();
		
		imp.contar();

	}

}
