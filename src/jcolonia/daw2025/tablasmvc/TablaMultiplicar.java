package jcolonia.daw2025.tablasmvc;

import java.util.List;
/**
 * clase que crea la tabla de multiplicar 
 */
public class TablaMultiplicar {

    protected int numero;
    protected List<String> listatexto;
    /**
     * constructor de la tabla de multiplicar 
     * @param numero int numero del que se genera la tabla de multiplicar 
     */
    public TablaMultiplicar(int numero) {
        this.numero = numero;
        this.listatexto = new java.util.ArrayList<>();
    }
    /**
     * metodo que genera la tabla 
     */
    public void generarTabla() {
        listatexto.clear();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            listatexto.add(numero + " * " + i + " = " + resultado);
        }
    }
    /**
     * metodo que devuelve una lista que contiene una tabla de multiplicar
     * @return
     */
    public List<String> getLista() {
        return listatexto;
    }
    /**
     * metodo que devuelve el numero con el que se ha generado la tabla de multiplicar 
     * @return numero int
     */
    public int getNumero() {
        return numero;
    }
    /**
     * cambia el numero con el que se hace la tabla de multiplicar 
     * @param numero int
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}