package Modelo;

import DAO.*;
import java.util.Date;

public class Ventas {
    
    private int idVentas;
    private int idproductos;
    private int idcliente;
    private Date fecha;
    private int cantidad;
    private String detalleVenta;
    private double precioUnitario;
    private double total;
    private String indicador;

    public Ventas() {}

    public int getIdVentas() {return idVentas;}
    public void setIdVentas(int idVentas) {this.idVentas = idVentas;}

    public Date getFecha() {return fecha;}
    public void setFecha(Date Fecha) {this.fecha = Fecha;}

    public int getIdcliente() {return idcliente;}
    public void setIdcliente(int idcliente) {this.idcliente = idcliente;}

    public int getCantidad() {return cantidad;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}

    public String getDetalleVenta() {return detalleVenta;}
    public void setDetalleVenta(String detalleVenta) {this.detalleVenta = detalleVenta;}

    public double getPrecioUnitario() {return precioUnitario;}
    public void setPrecioUnitario(double precioUnitario) {this.precioUnitario = precioUnitario;}

    public double getTotal() {return total;}
    public void setTotal(double total) {this.total = total;}

    public String getIndicador() {return indicador;}
    public void setIndicador(String indicador) {this.indicador = indicador;}

    public int getIdproductos() {return idproductos;}
    public void setIdproductos(int idproductos) {this.idproductos = idproductos;}
    
    public Object[] RegistroVenta(int numeracion){
        AdministrarClaves ac1 = new AdministrarClaves();
        String nombreprod = ac1.RecuperarNombre(ac1.consulta2, idproductos);
        String nombrescli = ac1.RecuperarNombre(ac1.consulta1, idcliente);
        
        Object[] fila = {numeracion, idVentas, nombreprod, nombrescli, fecha, cantidad, 
            detalleVenta, precioUnitario, total};
        return fila;
    }
    
}
