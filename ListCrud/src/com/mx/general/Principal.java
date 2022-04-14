package com.mx.general;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Paises> lista = new ArrayList<Paises>();
		
		Paises pais1 = new Paises("Mexico", "CDMX", 3000);
		Paises pais2 = new Paises("Alemania", "Berlin", 3300);
		Paises pais3 = new Paises("Francia", "Paris", 3040);
		Paises paisC = null;
		
		lista.add(pais1);
		lista.add(pais2);
		lista.add(pais3);
		
		System.out.println("Lista --> " + lista );
		
		// buscar
		paisC = lista.get(1);
		System.out.println("El pais encontrado es --> " + paisC);
		
		// Editar
		paisC = lista.get(2);
		paisC.setHabitantes(202000);
		System.out.println("Lista --> " + lista );
		// Eliminar
		
		lista.remove(0);
		System.out.println("Lista --> " + lista );
		
		
		
		
		
		
	}

}
