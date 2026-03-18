package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase que genera la vista del menu 
 */
public class VistaMenú extends VistaGeneral {
	/**
	 * formato para el texto que sale cuando se intenta selecionar 
	 * una opcion en el menu que no existe 
	 */
    private static final String FORMATO_FUERA_DE_RANGO =
            "*** Escriba un número entre %d y %d%n";
    /**
     * titulo de menu 
     */
    private String titulo;
    /**
     * lista con las opciones del menu 
     */
    private List<String> opciones;
    /**
     * constructor de vistamenu 
     * @param titulo string que contiene el titulo del menu 
     * @param opciones lista con las opciones del menu 
     */
    public VistaMenú(String titulo, List<String> opciones) {
        this.titulo = titulo;
        this.opciones = new ArrayList<>(opciones);
    }
    /**
     * metodo que muestra el titulo y las opciones del menu 
     */
    public void mostrarOpciones() {
        mostrarTitulo(titulo);

        int contador = 1;
        for (String opcion : opciones) {
            System.out.printf("  %d) %s%n", contador, opcion);
            contador++;
        }

        System.out.println("  0) Salir");
    }
    /**
     * metodo que pide que se seleccione una opcion 
     * @return opcion la opcion seleccionada 
     */
    public int pedirOpcion() {
        int opcion;
        int min = 0;
        int max = opciones.size();

        while (true) {
            opcion = pedirNumero("Elige una opción");

            if (opcion >= min && opcion <= max) {
                return opcion;
            } else {
                System.out.printf(FORMATO_FUERA_DE_RANGO, min, max);
            }
        }
    }
}