package com.mx.general;

public interface Metodos {
	
	public void guardar(Object obj);
	public void editar(Object obj,int indice);
	public void eliminar(int indice);
	
	public Object buscar (int indice);
	public void mostrar();

}
