package Modelo;

import java.util.Date;

public class Ventas {
    
    private int idVentas;
    private Date fecha;
    private String producto;
    private String cliente;
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

    public String getProducto() {return producto;}
    public void setProducto(String producto) {this.producto = producto;}

    public String getCliente() {return cliente;}
    public void setCliente(String cliente) {this.cliente = cliente;}

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
    
    public Object[] RegistroVenta(int numeracion){
        Object[] fila = {numeracion, idVentas, fecha, producto, cliente, cantidad, 
            detalleVenta, precioUnitario, total};
        return fila;
    }
    
}
