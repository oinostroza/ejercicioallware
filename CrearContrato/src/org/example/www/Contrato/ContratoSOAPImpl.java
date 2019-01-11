/**
 * ContratoSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Contrato;
import java.util.LinkedList;
import org.apache.log4j.Logger;

import cl.datos.ObjetoLista;
import cl.fuente.GenerarDatosPrueba;

public class ContratoSOAPImpl implements org.example.www.Contrato.Contrato_PortType{
	
	static Logger log = Logger.getLogger(ContratoSOAPImpl.class);
	
    public org.example.www.Contrato.ListaType[] listarTodo() throws java.rmi.RemoteException {
        	
		GenerarDatosPrueba datos = new GenerarDatosPrueba();
		datos.llenarLista();
			
		LinkedList<ObjetoLista> lista = datos.getOper().getLista();
		
		ListaType[] canciones = new ListaType[lista.size()];

		int cont = 0;
		for (ObjetoLista cancion : lista) {
			
			ListaType ListaType = new ListaType();
			ItemType item = new ItemType();	
			item.setCodigo_cancion(cancion.getNumero());
			item.setNombre_cancion(cancion.getDescripcion());
			ListaType.setItem(item);
			
			canciones[cont] = ListaType ;
			cont++;

		}
				
		return canciones;
    }

    public org.example.www.Contrato.ListarPorIDResponse listarPorID(org.example.www.Contrato.ListarPorIDRequest listarPorID) throws java.rmi.RemoteException {
    	ListarPorIDResponse retorno = new ListarPorIDResponse();
		GenerarDatosPrueba datos = new GenerarDatosPrueba();
		
		datos.llenarLista();			
		LinkedList<ObjetoLista> lista = datos.getOper().getLista();
		 
		try {
			ObjetoLista cancion = lista.get(listarPorID.getCodigo_cancion()-1);		
			retorno.setCodigo_cancion(cancion.getNumero());
			retorno.setNombre_cancion(cancion.getDescripcion());
		} catch (Exception e) {
			retorno.setCodigo_cancion(0);
			retorno.setNombre_cancion("Cancion no encontrada");
			
			log.error("Mensaje de error: " + e.getMessage());
			
		}
	    
		
		return retorno;
    }

}
