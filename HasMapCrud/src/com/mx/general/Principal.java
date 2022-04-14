package com.mx.general;

public class Principal {
	
	public static void main(String[] args) {
		Implementacion imp = new Implementacion();
		
		RazaPerros rp = null;
		
		rp = new RazaPerros("PitBull","USA", 100);
		imp.Guardar(rp);
		
		rp = new RazaPerros("Chihuahua","Mexico", 90);
		imp.Guardar(rp);
		
		rp = new RazaPerros("Husky","Alaska", 100);
		imp.Guardar(rp);
		
		// mostrar
		imp.Mostrar();
		

		// buscar
		rp = new RazaPerros("Husky");
		rp = imp.Buscar(rp);
		System.out.println("Raza Encontrada ~> " + rp);
		
		// Editar
		
		rp = imp.Buscar(new RazaPerros("PitBull"));
		rp.setAnios(20);
		imp.Editar(rp);
		imp.Mostrar();
		
		// eliminar
		
		imp.Eliminar(new RazaPerros("Chihuahua"));
		imp.Mostrar();
	}

}
