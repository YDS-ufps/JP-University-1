
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Date;

class Estudiante{
    private String codigo;
    private String documento;
    private String tipoDocumento;
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private char genero;
    private int estrato;
    private String direccionCorreo;
    private Ayuda ayuda;

    // Constructor
    public Estudiante(String codigo, String documento, String tipoDocumento, String nombres, String apellidos, Date fechaNacimiento, char genero, int estrato, String direccionCorreo) {
        this.codigo = codigo;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estrato = estrato;
        this.direccionCorreo = direccionCorreo;
    }

    // Métodos Getters y Setters para Ayuda
    public Ayuda getAyuda() {
        return ayuda;
    }
    public void setAyuda(Ayuda ayuda) {
        this.ayuda = ayuda;
    }
    
    public String getCodigo() {
        return codigo;
    }
    public String getDocumento() {
        return documento;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public char getGenero() {
        return genero;
    }
    public int getEstrato() {
        return estrato;
    }
    public String getDireccionCorreo() {
        return direccionCorreo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }
    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }
    
}

