package Modelo;

public class Clientes {
    
    private int idcliente;
    private String nombres;
    private String genero;
    private String telefono;
    private String correo;
    private String direccion;
    private String indicador;
    
    public Clientes(){}

    public int getIdcliente() {return idcliente;}
    public void setIdcliente(int idcliente) {this.idcliente = idcliente;}

    public String getNombres() {return nombres;}
    public void setNombres(String nombres) {this.nombres = nombres;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getCorreo() {return correo;}
    public void setCorreo(String correo) {this.correo = correo;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}
    
    public Object[] RegistrarClientes(int numeracion){
        Object[] fila = {numeracion, idcliente, nombres, genero, telefono, correo,
        direccion};
        return fila;
    }
}
