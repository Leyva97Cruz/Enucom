package com.mx.general;

public interface Metodos {
	
	public void Guardar(Caricatura caricatura);
	public void Editar(int indice, Caricatura caricatura);
	public void Eliminar(int indice);
	public Caricatura buscar(int indice);
	public void mostrar();

}
