package jcolonia.daw2025.tablasmvc;

public class ControlTablaMultiplicar extends TablaMultiplicar {

    public static final String FORMATO_RUTA_ARCHIVO_EXPORTACIÓN =
            "tabla del %02d.txt";

    public ControlTablaMultiplicar(int numero) {
        super(numero);
    }

    public static final java.util.List<String> OPCIONES_MENÚ_PRINCIPAL =
            java.util.Arrays.asList(
                    "Mostrar tabla",
                    "Cambiar tabla",
                    "Exportar tabla"
            );

    public void init() {
        int n = 0;
		try {
			n = VistaGeneral.pedirNumero("Introduzca un número");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        setNumero(n);
        generarTabla();
    }

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

    private void mostrarTabla() {
        VistaGeneral.mostrarLista(getLista());
    }

    private void cambiarTabla() {
        int n = VistaGeneral.pedirNumero("Nuevo número:");
        setNumero(n);
        generarTabla();
    }

    private void exportarTabla() {
        String nombre = String.format(FORMATO_RUTA_ARCHIVO_EXPORTACIÓN, getNumero());

        ExportaciónArchivo exportador = new ExportaciónArchivo(nombre);
        exportador.guardar(getLista());

        VistaGeneral.mostrarAviso("Exportado a " + nombre);
    }

    private void opciónNoDisponible() {
        System.out.println("Opción no disponible");
    }
}