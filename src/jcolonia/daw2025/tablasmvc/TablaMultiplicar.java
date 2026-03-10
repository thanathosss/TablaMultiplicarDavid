package jcolonia.daw2025.tablasmvc;
import java.util.List;

public class TablaMultiplicar {
	

	
		private static int numero;
		private List<String> listatexto;
	    public TablaMultiplicar(int numero) {
	    	this.numero = numero;
	    }
	    /**
	     * generar la tabla de multiplicar con el numero dado
	     * y añadirlo a la lista
	     */
	    public void generarTabla() {
	        for (int i = 1; i <= 10; i++) {
	        	int operacion = numero*i;
	        	listatexto.add("numero*i=operacion\n");
	  
	    }
	    }
	    /**
	     * genera la tabla de multiplicar y la añade a la lista
	     * @return listatexto devuelve la lista 
	     */
	    public List<String> toListaExportacion() {
	    	 for (int i = 1; i <= 10; i++) {
		        	int operacion = numero*i;
		        	listatexto.add("numero*i=operacion\n");
	    }
	    	return listatexto;
	    }
	    /**
	     * genera la tabla de multiplicar y la añade a la lista 
	     * @return listatexto devuelve la lista
	     */
	    public List<String> toListaPantalla(){
	    	 for (int i = 1; i <= 10; i++) {
		        	int operacion = numero*i;
		        	listatexto.add("numero*i=operacion\n");
	    }
	    	return listatexto;
	    }
	    /**
	     * convierte la lista a un string
	     */
	    String resultado = listatexto.toString();


	}


