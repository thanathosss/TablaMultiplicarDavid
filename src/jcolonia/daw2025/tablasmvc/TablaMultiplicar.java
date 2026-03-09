package jcolonia.daw2025.tablasmvc;
import java.util.List;

public class TablaMultiplicar {
	

	
		private static int numero;
		private List<String> listatexto;
	    public TablaMultiplicar(int numero) {
	       //tipo//
	    	this.numero = numero;
	    }

	    public void generarTabla() {
	        for (int i = 1; i <= 10; i++) {
	        	int operacion = numero*i;
	        	listatexto.add("numero*i=operacion");
	  
	    }
	    }
	    public List<String> toListaExportacion() {
			return listatexto;
	    	
	    }
	    public List<String> toListaPantalla(){
	    	return listatexto;
	    }

	    public static void main(String[] args) {
	    }


	}


