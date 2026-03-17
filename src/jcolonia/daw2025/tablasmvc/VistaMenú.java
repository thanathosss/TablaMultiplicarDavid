package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

public class VistaMenú extends VistaGeneral {

    private static final String FORMATO_FUERA_DE_RANGO =
            "*** Escriba un número entre %d y %d%n";

    private String titulo;
    private List<String> opciones;

    public VistaMenú(String titulo, List<String> opciones) {
        this.titulo = titulo;
        this.opciones = new ArrayList<>(opciones);
    }

    public void mostrarOpciones() {
        mostrarTitulo(titulo);

        int contador = 1;
        for (String opcion : opciones) {
            System.out.printf("  %d) %s%n", contador, opcion);
            contador++;
        }

        System.out.println("  0) Salir");
    }

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