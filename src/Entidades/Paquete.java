
package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lourdes
 */
public class Paquete {
    private int idPaquete;
    private List<Cliente> clientes;
    private Estadia idEstadia;
    private Pasaje idPasaje;
    private Menu idMenu;
    private String origen;
    private String destino;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precioTotal;
    
    
    //Constructor vacio

    public Paquete() {
    }
    
    //Constructor con id

    public Paquete(int idPaquete, List<Cliente> clientes, Estadia idEstadia, Pasaje idPasaje, Menu idMenu, String origen, String destino, LocalDate fechaInicio, LocalDate fechaFin, double precioTotal) {
        this.idPaquete = idPaquete;
        this.clientes = new ArrayList<>();
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

    public Paquete(List<Cliente> clientes, Estadia idEstadia, Pasaje idPasaje, Menu idMenu, String origen, String destino, LocalDate fechaInicio, LocalDate fechaFin, double precioTotal) {
        this.clientes = new ArrayList<>();
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
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

       //TO STRING SIN ARRAY DE CLIENTES, SOLO QUEREMOS LOS DETALLES CONCRETOS DEL PAQUETE
    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", idEstadia=" + idEstadia + ", idPasaje=" + idPasaje + ", idMenu=" + idMenu + ", origen=" + origen + ", destino=" + destino + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precioTotal=" + precioTotal + '}';
    }
    
    
}
