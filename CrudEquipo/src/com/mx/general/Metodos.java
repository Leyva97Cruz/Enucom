package com.mx.general;

public interface Metodos {
	
	public void Guardar(EquiposDeFutbol equipo);
	public void Editar(int indice, EquiposDeFutbol equipo);
	public void Eliminar(int indice);
	public EquiposDeFutbol buscar(int indice);
	public void mostrar();

}
