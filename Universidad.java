import java.util.ArrayList;

/**
 * Write a description of class Universidad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Universidad {
    private ArrayList<Estudiante> estudiantes;

    // Constructor
    public Universidad() {
        this.estudiantes = new ArrayList<>();
    }

    // Método para asignar ayuda a un estudiante
    public void asignarAyuda(Estudiante estudiante, String tipoAyuda) {
        Ayuda ayuda = new Ayuda(tipoAyuda);
        estudiante.setAyuda(ayuda);
    }

    // Método para entregar ayuda a un estudiante
    public void entregarAyuda(Estudiante estudiante, String estado) {
        estudiante.getAyuda().entregarAyuda(estado);
    }

    // Método para obtener el resumen de ayudas entregadas y estudiantes favorecidos
    public void obtenerResumen() {
        int ayudasEntregadas = 0;
        int estudiantesFavorecidos = 0;

        for (Estudiante estudiante : estudiantes) {
            Ayuda ayuda = estudiante.getAyuda();
            if (ayuda != null && ayuda.getEstado().equals("Entregada")) {
                ayudasEntregadas++;
                estudiantesFavorecidos++;
            } else if (ayuda != null && ayuda.getEstado().equals("Rechazada")) {
                ayudasEntregadas++;
            }
        }

        System.out.println("Cantidad de ayudas entregadas: " + ayudasEntregadas);
        System.out.println("Número de estudiantes favorecidos: " + estudiantesFavorecidos);
    }
}
