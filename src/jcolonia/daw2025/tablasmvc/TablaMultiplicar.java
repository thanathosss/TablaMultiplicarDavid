package jcolonia.daw2025.tablasmvc;

import java.util.List;

public class TablaMultiplicar {

    protected int numero;
    protected List<String> listatexto;

    public TablaMultiplicar(int numero) {
        this.numero = numero;
        this.listatexto = new java.util.ArrayList<>();
    }

    public void generarTabla() {
        listatexto.clear();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            listatexto.add(numero + " * " + i + " = " + resultado);
        }
    }

    public List<String> getLista() {
        return listatexto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}