package jcolonia.daw2025.tablasmvc;

import java.util.List;
import java.util.Scanner;

public class VistaGeneral {
	private String FORMATO_PRINTF_MOSTRARTEXTO;
	
	private String FORMATO_PRINTF_MOSTRARAVISO;
	
	
	public static void mostrarTexto(String texto) {
		System.out.println(texto);
		
	}

	public static void mostrarAviso(String aviso) {
		System.out.println(aviso);
		
	}
	public static void mostrarTítulo1(String Título1) {
		System.out.println(Título1);
		
	}
	public static void mostrarTítulo2(String Título2) {
		System.out.println(Título2);
		 
	}
	public static int pedirNumero() {
		try (Scanner numero = new Scanner(System.in)) {
			int numeropedido = numero.nextInt();
			return numeropedido;
		}
	}
	public static void pausa(String string) {
	
		
	}
	public static boolean pedirConfirmacion(String string) {
		System.out.println("Esta seguro de esto?");
		Scanner confirmacion = new Scanner(System.in);
		String confir = confirmacion.nextLine();
		if (confir = "Y") {
			return true;
		}
		if (confir = "N") {
			return false;
		}
		else {
			System.out.println("Error, escriba Y o N");
		}

		
	}

	public static void mostrarLista( List<String> lista) {
	
		
	}
	public void getScEntrada() {
		
	}

}
