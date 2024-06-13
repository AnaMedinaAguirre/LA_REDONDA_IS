package Modelo;

import DAO.AdministrarClaves;
import java.util.Date;

public class Productos {
    private int idproductos;
    private int idproveedor;
    private String nombre;
    private String descripcion;
    private Date fechaven;
    private double precio;
    private int stock;
    private String indicador;

    public Productos() {}

    public int getIdproductos() {return idproductos;}
    public void setIdproductos(int idproductos) {this.idproductos = idproductos;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public Date getFechaven() {return fechaven;}
    public void setFechaven(Date fechaven) {this.fechaven = fechaven;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public int getStock() {return stock;}
    public void setStock(int stock) {this.stock = stock;}

    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}

    public int getIdproveedor() {return idproveedor;}
    public void setIdproveedor(int idproveedor) {this.idproveedor = idproveedor;}
    
    public Object[] RegistrarProductos(int numeracion){
        AdministrarClaves ac1 = new AdministrarClaves();
        String nombreprov = ac1.RecuperarNombre(ac1.consulta3, idproveedor);
        
        Object[] fila = {numeracion, idproductos, nombre, nombreprov, descripcion, fechaven, precio, stock};
        return fila;
    }
    
}
