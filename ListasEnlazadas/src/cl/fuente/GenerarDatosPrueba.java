package cl.fuente;

import cl.datos.ObjetoLista;
import cl.operaciones.Operaciones;




public class GenerarDatosPrueba {
		
	public Operaciones oper;
	
	/**
	 * @author oscar
	 *Canciones de la banda NOSOUND del disco Sol29 
	 */
	public static String[] canciones = {"In the White Air",
			"Wearing Lies on Your Lips",
			"The Child's Game",
			"The Moment She Knew",
			"Waves of Time",
			"Overloaded",
			"The Broken Parts",
			"Idle End",
			"Hope For the Future",
			"Sol29"}; 
	
	public GenerarDatosPrueba(){	
		 oper = new Operaciones();
	}
	
	public Operaciones getOper() {
		return oper;
	}

	public void setOper(Operaciones oper) {
		this.oper = oper;
	}
	/**
	 * @author oscar
	 *Metodo que almacena una cantidad finita de canciones en un lista
	 */
	public void llenarLista() {				
		int contador = 1;
		for (String nombreCancion : canciones) {			
			ObjetoLista obj = new  ObjetoLista();
			obj.setDescripcion(nombreCancion);
			obj.setNumero(contador);
			
			getOper().agregarElemento(obj);
			contador++;
		}
			
	}

	public ObjetoLista obtenerCancionPorID(int index) {
		return getOper().obtenerElemento(index);
	}

}

