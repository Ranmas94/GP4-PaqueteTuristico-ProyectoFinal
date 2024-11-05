/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.sql.Date;

/**
 *
 * @author Lourdes
 */
public class PaqueteDetalle {
    private Paquete idPaquete;
    private String ciudadOrigen;
    private String ciudadDestino;
    private Date fechaInicio;
    private Date fechaFin;
    private String nombreAlojamiento;
    private String direccionAlojamiento;
    private String tipoMenu;
    private String tipoTransporte;
    private int cantidadPasajeros;
    private String medioPago;
    private double precioTotal;
    private boolean pagado;
    private boolean cancelado;

    public PaqueteDetalle() {
    }

    public PaqueteDetalle(Paquete idPaquete, String ciudadOrigen, String ciudadDestino, Date fechaInicio, Date fechaFin, String nombreAlojamiento, String direccionAlojamiento, String tipoMenu, String tipoTransporte, int cantidadPasajeros, String medioPago, double precioTotal, boolean pagado, boolean cancelado) {
        this.idPaquete = idPaquete;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreAlojamiento = nombreAlojamiento;
        this.direccionAlojamiento = direccionAlojamiento;
        this.tipoMenu = tipoMenu;
        this.tipoTransporte = tipoTransporte;
        this.cantidadPasajeros = cantidadPasajeros;
        this.medioPago = medioPago;
        this.precioTotal = precioTotal;
        this.pagado = pagado;
        this.cancelado = cancelado;
    }

    public PaqueteDetalle(String ciudadOrigen, String ciudadDestino, Date fechaInicio, Date fechaFin, String nombreAlojamiento, String direccionAlojamiento, String tipoMenu, String tipoTransporte, int cantidadPasajeros, String medioPago, double precioTotal, boolean pagado, boolean cancelado) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombreAlojamiento = nombreAlojamiento;
        this.direccionAlojamiento = direccionAlojamiento;
        this.tipoMenu = tipoMenu;
        this.tipoTransporte = tipoTransporte;
        this.cantidadPasajeros = cantidadPasajeros;
        this.medioPago = medioPago;
        this.precioTotal = precioTotal;
        this.pagado = pagado;
        this.cancelado = cancelado;
    }

    public Paquete getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(Paquete idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudaDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public String getDireccionAlojamiento() {
        return direccionAlojamiento;
    }

    public void setDireccionAlojamiento(String direccionAlojamiento) {
        this.direccionAlojamiento = direccionAlojamiento;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    @Override
    public String toString() {
        return "PaqueteDetalle{" + "idPaquete=" + idPaquete + ", ciudadOrigen=" + ciudadOrigen + ", ciudaDestino=" + ciudadDestino + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", nombreAlojamiento=" + nombreAlojamiento + ", direccionAlojamiento=" + direccionAlojamiento + ", tipoMenu=" + tipoMenu + ", tipoTransporte=" + tipoTransporte + ", cantidadPasajeros=" + cantidadPasajeros + ", medioPago=" + medioPago + ", precioTotal=" + precioTotal + ", pagado=" + pagado + ", cancelado=" + cancelado + '}';
    }
    
    
    
    
}
