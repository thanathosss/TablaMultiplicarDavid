package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

/**
 * Clase base para todas las vistas.
 */
public class VistaGeneral {

    protected static final Scanner sc = new Scanner(System.in);
    /**
     * metodo que muestra el texto 
     * @param texto String que contiene lo que se quiere mostrar 
     */
    public void mostrarTexto(String texto) {
        System.out.println(texto);
    }
    /**
     * metodo que muestra un texto como aviso 
     * @param texto el texto que se quiere mostrar 
     */
    public static void mostrarAviso(String texto) {
        System.out.println("[AVISO] " + texto);
    }
    /**
     * metodo que muestra el titulo 
     * @param texto String que contiene lo que se quiere mostrar 
     */
    public void mostrarTitulo(String texto) {
        System.out.println(texto);
        for (int i = 0; i < texto.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }
    /**
     * metodo que pide el numero 
     * @param texto String que contiene el texto que se quiere mostrar 
     * @return numero int 
     */
    public static int pedirNumero(String texto) {
        int numero = 0;
        boolean correcto = false;

        do {
            try {
                System.out.print(texto + ": ");
                numero = Integer.parseInt(sc.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: introduce un número válido");
            }
        } while (!correcto);

        return numero;
    }
    /**
     * metodo para pedir confirmacion antes de hacer algo 
     * @param texto String que contiene el texto que se quiere mostrar 
     * @return boolean 
     */
    public boolean pedirConfirmacion(String texto) {
        String linea;

        while (true) {
            System.out.print(texto + " (S/N): ");
            linea = sc.nextLine().trim().toUpperCase();

            if (linea.equals("S")) return true;
            if (linea.equals("N")) return false;

            System.out.println("Error, escribe S o N");
        }
    }
    /**
     * metodo que muestra la lista 
     * @param lista la lista que se quiere mostrar 
     */
    public static void mostrarLista(List<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}