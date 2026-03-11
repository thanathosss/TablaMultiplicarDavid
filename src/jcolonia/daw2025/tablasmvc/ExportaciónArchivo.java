package jcolonia.daw2025.tablasmvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
/**
 * Exporta los resultados en un documento externo y los guarda
 */
public class ExportaciónArchivo {
	private File refArchivo = new File(refArchivo);
	/**
	 * exporta los ficheros a un archivo 
	 * @param rutaArchivo la ruta del archivo en el que se quiere exportar los resultados 
	 */
	public void exportacionArchivo(String rutaArchivo) {
		try {
			PrintWriter out = new PrintWriter(refArchivo);
			out.println("HolaMundo");
			out.close();
			} catch (FileNotFoundException e) {
			System.err.printf("Ruta no encontrada: %s",
			e.getLocalizedMessage());
			}
	};
	/**
	 * Guarda los contenidos 
	 * @param contenidos lista de strings que contiene los contenidos que se desean guardar 
	 */
	public void  guardar(List<String> contenidos) {
		
	};
}
