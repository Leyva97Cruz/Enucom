package com.mx.general;

import com.mx.entidad.Alumno;
import com.mx.implementacion.ImpAlumno;

public class Principal {
	public static void main(String[] args) {
		Alumno alumno = new Alumno("Aaron", "Leyva", 30) ;
		ImpAlumno alum = new ImpAlumno();
		alum.guardar(alumno);
		alum.mostrar();
	}

}
