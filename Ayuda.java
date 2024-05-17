import java.util.Date;

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

class Ayuda {
    private String tipoAyuda;
    private String estado;
    private Date fechaAsignacion;
    private Date fechaEntrega;

    // Constructor
    public Ayuda(String tipoAyuda) {
        this.tipoAyuda = tipoAyuda;
        this.estado = "Asignada";
        this.fechaAsignacion = new Date();
        this.fechaEntrega = null;
    }

    // Método para actualizar el estado y la fecha de entrega
    public void entregarAyuda(String estado) {
        this.estado = estado;
        this.fechaEntrega = new Date();
    }

    // Métodos Getters
    public String getEstado() {
        return estado;
    }
}
