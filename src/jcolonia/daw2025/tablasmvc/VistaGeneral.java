package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

public class VistaGeneral {
	private String FORMATO_PRINTF_MOSTRARTEXTO;
	
	private String FORMATO_PRINTF_MOSTRARAVISO;
	
	
	public static void mostrarTexto(String texto) {
		System.out.println(texto);
		
	}

	public static void mostrarAviso(String texto) {
		System.out.println(texto);
		
	}
	public static void mostrarTítulo1(String texto) {
		System.out.println(texto);
		
	}
	public static void mostrarTítulo2(String texto) {
		System.out.println(texto);
		 
	}
	public static int pedirNumero(String texto) {
			System.out.printf("diga un número");
			Scanner numeropedido = getScEntrada() ;
			return numeropedido.nextInt();
		
	}
	public static void pausa(String texto) {	
	}
	
	public static boolean pedirConfirmacion(String texto) {
	    Scanner escanerEntrada;
	    String linea;
	    escanerEntrada = getScEntrada();

	    while (true) {
	        System.out.printf("%s (S/N): ", texto);
	        linea = escanerEntrada.nextLine().trim().toUpperCase();

	        if (linea.equals("S")) {
	            return true;
	        } 
	        else if (linea.equals("N")) {
	            return false;
	        } 
	        else {
	            System.out.println("Error, escriba S o N");
	        }
	    }
	}

	public static void mostrarLista(List<String> lista) {
	    for (String elemento : lista) {
	        System.out.println(elemento);
	    }
	}
	public static Scanner getScEntrada() {
		Scanner Sc = new Scanner(System.in);
		return Sc;
	}

}
