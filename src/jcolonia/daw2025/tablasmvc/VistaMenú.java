package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VistaMenú {
	private static final String FORMATO_FUERA_DE_RANGO = "*** por favor, ¡escriba un numero entre %d y %d!%n";
	private String titulo;
	private List<String> opciones;
	private static Scanner scIn;
	
	static {
		scIn = new Scanner(System.in);
	}
	
public VistaMenú(String titulo, List<String> opciones) {
	this.titulo = titulo;
	this.opciones = new ArrayList<String>(opciones);
}
	public void mostrarTitulo() {
		System.out.println(titulo);
		for (int i = 0; i<titulo.length();i++) {
			System.out.print("_");
		}
	}
	public void mostrarOpciones() {
		
		int contador;
		contador = 1;
		
		
		for(int i = 0; i<opciones.size(); i++) {
			System.out.printf("     %d) %s",contador, opciones.get(i));
			contador ++;
		}
		System.out.println("    0) Salir");
	}
	public int pedirOpcion() {
		int OpcionElegida = 0;
		int min, max;
		String linea;
		boolean salir;
		
		min = 0;
		max = opciones.size();
		salir = false;

	
		
		
	do {
		try {
			System.out.print("Introduce el número: ");
			
			linea = scIn.nextLine();
			OpcionElegida = Integer.parseInt(linea);
			if(OpcionElegida<min||OpcionElegida>max) {
				System.out.printf(FORMATO_FUERA_DE_RANGO, min, max);
			}else {
				salir = true;
			}
		} catch (NumberFormatException e) {
				System.out.printf(FORMATO_FUERA_DE_RANGO, min, max);
		}
	}while(!salir);{
	}
	return OpcionElegida;
	}
}
