package Modelo;

public class Proveedores {
    
    private int idproveedor;
    private String nombrecompania;
    private String nombrecontacto;
    private String cargocontacto;
    private String direccion;
    private String telefono;
    private String paginaweb;
    private String indicador;
    
    public Proveedores(){}

    public int getIdproveedor() {return idproveedor;}
    public void setIdproveedor(int idproveedor) {this.idproveedor = idproveedor;}

    public String getNombrecompania() {return nombrecompania;}
    public void setNombrecompania(String nombrecompania) {this.nombrecompania = nombrecompania;}

    public String getNombrecontacto() {return nombrecontacto;}
    public void setNombrecontacto(String nombrecontacto) {this.nombrecontacto = nombrecontacto;}

    public String getCargocontacto() {return cargocontacto;}
    public void setCargocontacto(String cargocontacto) {this.cargocontacto = cargocontacto;}

    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getPaginaweb() {return paginaweb;}
    public void setPaginaweb(String paginaweb) {this.paginaweb = paginaweb;}

    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}
    
    public Object[] RegistrarProveedores(int numeracion){
        Object[] fila = {numeracion, idproveedor, nombrecompania, nombrecontacto, cargocontacto,direccion, telefono, paginaweb};
        return fila;
    }
}
