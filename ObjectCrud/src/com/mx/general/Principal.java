package com.mx.general;

public class Principal {
	
	public static void main(String[] args) {
		Implementacion imp = new Implementacion();
		
		Heroe e = null;
		
		e = new Heroe(1, "Peter Parker", "Spiderman", 20);
		imp.guardar(e);
		
		e = new Heroe(2,"Dyana","Wonder Woman",160);
		imp.guardar(e);
		
		e = new Heroe(3,"Barry","Flas",25);
		imp.guardar(e);
		
		imp.mostrar();
		
		// buscar
		 e = new Heroe(2);
		 e = (Heroe) imp.buscar(e);
		 
		 System.out.println("Heroe econtrado ~> " + e);
		 
		 //editar
		 e.setEdad(200);
		 imp.editar(e);
		 imp.mostrar();
		 
		 //eliminar
		 imp.eliminar(e);
		 imp.mostrar();
		
	}

}
