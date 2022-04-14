package com.mx.general;

public interface Metodos {
	
	public void guardar(Celular celular);
	public void editar(Celular celular,int indice);
	public void eliminar(int indice);
	
	public Celular buscar (int indice);
	public void mostrar();
}
