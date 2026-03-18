package jcolonia.daw2025.tablasmvc;
/**
 * Clase que contiene todo lo que se puede hacer para controlar TablaMultiplicar
 */
public class ControlTablaMultiplicar extends TablaMultiplicar {
	/**
	 * Formato que se le da a la ruta del archivo de exportacion 
	 */
    public static final String FORMATO_RUTA_ARCHIVO_EXPORTACIÓN =
            "tabla del %02d.txt";
    /**
     * constructor de la clase que maneja numero
     * @param numero int que contiene el numero con el que se quiere trabajar 
     * con la tabla de multiplicar 
     */
    public ControlTablaMultiplicar(int numero) {
        super(numero);
    }
    /**
     * lista que contiene las opciones del menu principal 
     */
    public static final java.util.List<String> OPCIONES_MENÚ_PRINCIPAL =
            java.util.Arrays.asList(
                    "Mostrar tabla",
                    "Cambiar tabla",
                    "Exportar tabla"
            );
    /**
     * metodo que guarda el numero y genera la tabla con este 
     */
    public void init() {
        int n = 0;
			n = VistaGeneral.pedirNumero("Introduzca un número");
        setNumero(n);
        generarTabla();
    }
    /**
     * muestra todas las posibles opciones del menu 
     */
    public void buclePrincipal() {
        VistaMenú menú;
        int opción;

        menú = new VistaMenú("Tablas de multiplicar", OPCIONES_MENÚ_PRINCIPAL);

        do {
            menú.mostrarOpciones();
            opción = menú.pedirOpcion();

            switch (opción) {
                case 1:
                    mostrarTabla();
                    break;
                case 2:
                    cambiarTabla();
                    break;
                case 3:
                    exportarTabla();
                    break;
                case 0:
                    break;
                default:
                    opciónNoDisponible();
            }

        } while (opción != 0);

        VistaGeneral.mostrarAviso("FIN");
    }
    /**
     * muestra la tabla 
     */
    private void mostrarTabla() {
        VistaGeneral.mostrarLista(getLista());
    }
    /**
     * cambia el numero del que se hace la tabla 
     */
    private void cambiarTabla() {
        int n = VistaGeneral.pedirNumero("Nuevo número:");
        setNumero(n);
        generarTabla();
    }
    /**
     * exporta la tabla 
     */
    private void exportarTabla() {
        String nombre = String.format(FORMATO_RUTA_ARCHIVO_EXPORTACIÓN, getNumero());

        ExportaciónArchivo exportador = new ExportaciónArchivo(nombre);
        exportador.guardar(getLista());

        VistaGeneral.mostrarAviso("Exportado a " + nombre);
    }
    /**
     * muestra un aviso si la opcion selecionada no esta disponible (no existe)
     */
    private void opciónNoDisponible() {
        System.out.println("Opción no disponible");
    }
}