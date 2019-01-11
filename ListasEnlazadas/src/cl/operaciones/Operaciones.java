package cl.operaciones;

import java.util.LinkedList;

import cl.datos.ObjetoLista;

public class Operaciones {

	public LinkedList<ObjetoLista>  lista;

	public LinkedList<ObjetoLista> getLista() {
		return lista;
	}
	public void setLista(LinkedList<ObjetoLista> lista) {
		this.lista = lista;
	}
	public Operaciones() {
		this.lista = new LinkedList<ObjetoLista>();
	}
	
	public void agregarElemento(ObjetoLista obj) {		
		getLista().add(obj);	
	} 		
	public ObjetoLista obtenerElemento(int index) {
		return getLista().get(index);
	}
	public void eliminarElemento(int index) {
		getLista().remove(index);
	}
	
}
