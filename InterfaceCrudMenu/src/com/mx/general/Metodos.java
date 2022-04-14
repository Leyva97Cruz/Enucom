package com.mx.general;

public interface Metodos {
	
	public void Guardar(ConsolasVJ consola);
	public void Editar(int indice, ConsolasVJ consola);
	public void Eliminar(int indice);
	public ConsolasVJ buscar(int indice);
	public void mostrar();

}
