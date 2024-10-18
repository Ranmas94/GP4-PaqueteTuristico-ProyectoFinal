
package Entidades;

import java.time.LocalDate;


/**
 *
 * @author Lourdes
 */
public class Paquete {
    private int idPaquete;
    private Estadia idEstadia;
    private Pasaje idPasaje;
    private Menu idMenu;
    private Destino origen;
    private Destino destino;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioTotal;
    
    
    //Constructor vacio

    public Paquete() {
    }
    
    //Constructor con id

    public Paquete(int idPaquete, Estadia idEstadia, Pasaje idPasaje, Menu idMenu, Destino origen, Destino destino, LocalDate fechaInicio, LocalDate fechaFin, double precioTotal) {
        this.idPaquete = idPaquete;
        
        this.idEstadia = idEstadia;
        this.idPasaje = idPasaje;
        this.idMenu = idMenu;
        this.origen = origen;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
    }
    
    //Constructor sin id

    public Paquete( Estadia idEstadia, Pasaje idPasaje, Menu idMenu, Destino origen, Destino destino, LocalDate fechaInicio, LocalDate fechaFin, double precioTotal) {
       
        this.idEstadia = idEstadia;
        this.idPasaje = idPasaje;
        this.idMenu = idMenu;
        this.origen = origen;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
    }

    //GETTER & SETTER
    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }


    public Estadia getIdEstadia() {
        return idEstadia;
    }

    public void setIdEstadia(Estadia idEstadia) {
        this.idEstadia = idEstadia;
    }

    public Pasaje getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(Pasaje idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Menu getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Menu idMenu) {
        this.idMenu = idMenu;
    }

    public Destino getOrigen() {
        return origen;
    }

    public void setOrigen(Destino origen) {
        this.origen = origen;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

       //TO STRING 
    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", idEstadia=" + idEstadia + ", idPasaje=" + idPasaje + ", idMenu=" + idMenu + ", origen=" + origen + ", destino=" + destino + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precioTotal=" + precioTotal + '}';
    }
    
    
}
