package com.mx.general;

import com.mx.entidad.Alumno;
import com.mx.implementacion.ImpAlumno;

public class Principal {
	public static void main(String[] args) {
		
		ImpAlumno impAlumno = new ImpAlumno();
		
		Alumno alumno = new Alumno("Carlos", "Hernandez", 20);
		Alumno alumno1 = new Alumno("Pedro", "Cruz", 30);
		Alumno alumno2 = new Alumno("Jesus", "Sanches", 50);
		
		impAlumno.guardar(alumno.getNombre(),alumno);
		impAlumno.guardar(alumno1.getNombre(),alumno1);
		impAlumno.guardar(alumno2.getNombre(),alumno2);
		impAlumno.mostrar();
		
		// Buscar
		alumno = (Alumno) impAlumno.buscar("Carlos");
		System.out.println("Alumno encontrado -> " + alumno);

		impAlumno.mostrar();
		
		// editar 
		
		alumno = (Alumno) impAlumno.buscar("Pedro");
		alumno.setApp("Fenandez");
		System.out.println("Alumno editado -> " + alumno);
		impAlumno.mostrar();
		
		// Eliminar 
		
		impAlumno.eliminar("Jesus");
		
		impAlumno.mostrar();

	}

}
