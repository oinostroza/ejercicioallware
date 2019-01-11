package cl.main;

import cl.datos.ObjetoLista;
import cl.fuente.GenerarDatosPrueba;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		GenerarDatosPrueba datos = new GenerarDatosPrueba();
		datos.llenarLista();
		for (ObjetoLista lista : datos.getOper().getLista()) {					
			System.out.println(lista.getDescripcion());		
		}

	}

}
