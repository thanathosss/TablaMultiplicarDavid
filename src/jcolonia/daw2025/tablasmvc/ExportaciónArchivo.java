package jcolonia.daw2025.tablasmvc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Gestion de los resultados en un documento externo y los guarda
 */
public class ExportaciónArchivo {
	private File refArchivo;

	/**
	 * Exporta los ficheros a un archivo
	 * 
	 * @param rutaArchivo la ruta del archivo en el que se quiere exportar los
	 *                    resultados
	 */
	public ExportaciónArchivo(String rutaArchivo) {
		refArchivo = new File(rutaArchivo);
	}

	/**
	 * Guarda los contenidos
	 * 
	 * @param contenidos lista de strings que contiene los contenidos que se desean
	 *                   guardar
	 */
	public void guardar(List<String> contenidos) {
		try (PrintWriter out = new PrintWriter(refArchivo)) {
			for (int i = 0; i < contenidos.size(); i++) {
				out.println(contenidos.get(i));
			}
		} catch (FileNotFoundException e) {
			System.err.printf("Ruta no encontrada: %s", e.getLocalizedMessage());
		}
	}
}
