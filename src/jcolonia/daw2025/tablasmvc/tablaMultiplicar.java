package jcolonia.daw2025.tablasmvc;
import java.util.List;

public class tablaMultiplicar {

	
		private int numero;
		private List<String> listatexto;
	    public tablaMultiplicar(int numero) {
	       //tipo//
	    	this.numero = numero;
	    }

	    public void generarTabla() {
	        for (int i = 1; i <= 10; i++) {
	  
	    }
	    }
	    public List<String> toListaExportacion() {
			return listatexto;
	    	
	    }
	    public List<String> toListaPantalla(){
	    	return listatexto;
	    }

	    public static void main(String[] args) {
	        tablaMultiplicar tablaDeLoQueSea;
	        tablaDeLoQueSea = new tablaMultiplicar(7);
	        System.out.print(tablaDeLoQueSea.toString());
	    }


	}


