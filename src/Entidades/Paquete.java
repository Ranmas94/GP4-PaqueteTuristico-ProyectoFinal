
package Entidades;


import java.sql.Date;


/**
 *
 * @author Lourdes
 */
public class Paquete {
    private int idPaquete;
    private Cliente idCliente;
    private Estadia idEstadia;
    private Pasaje idPasaje;
    private MenuPension idMenu;
    private Destino origen;
    private Destino destino;
    private Date fechaInicio;
    private Date fechaFin;
    private String temporada;
    private int cantidadPasajeros;
    private String medioPago;
    private boolean pagado;
    private boolean cancelado;
    private double precioTotal;
    
    
    //Constructor vacio

    public Paquete() {
    }
    
    //Constructor con id

    public Paquete(int idPaquete,Cliente idCliente, Estadia idEstadia, Pasaje idPasaje, MenuPension idMenu, Destino origen, Destino destino, Date fechaInicio, Date fechaFin, String temporada,int cantidadPasajeros, String medioPago,boolean pagado,boolean cancelado, double precioTotal) {
        this.idPaquete = idPaquete;
        this.idCliente = idCliente;
        this.idEstadia = idEstadia;
        this.idPasaje = idPasaje;
        this.idMenu = idMenu;
        this.origen = origen;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.temporada = temporada;
        this.cantidadPasajeros = cantidadPasajeros;
        this.medioPago = medioPago;
        this.pagado = pagado;
        this.cancelado = cancelado;
        this.precioTotal = precioTotal;
    }
    
    //Constructor sin id

    public Paquete(Cliente idCliente, Estadia idEstadia, Pasaje idPasaje, MenuPension idMenu, Destino origen, Destino destino, Date fechaInicio, Date fechaFin, String temporada,int cantidadPasajeros, String medioPago,boolean pagado,boolean cancelado,double precioTotal) {
       this.idCliente = idCliente;
        this.idEstadia = idEstadia;
        this.idPasaje = idPasaje;
        this.idMenu = idMenu;
        this.origen = origen;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.temporada = temporada;
        this.cantidadPasajeros = cantidadPasajeros;
        this.medioPago = medioPago;
        this.pagado = pagado;
        this.cancelado = cancelado;
        this.precioTotal = precioTotal;
    }

    //GETTER & SETTER
    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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

    public MenuPension getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(MenuPension idMenu) {
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

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    
    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
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
    
       //TO STRING 

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", idCliente=" + idCliente + ", idEstadia=" + idEstadia + ", idPasaje=" + idPasaje + ", idMenu=" + idMenu + ", origen=" + origen + ", destino=" + destino + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", temporada=" + temporada + ", cantidadPasajeros=" + cantidadPasajeros + ", medioPago=" + medioPago + ", pagado=" + pagado + ", cancelado=" + cancelado + ", precioTotal=" + precioTotal + '}';
    }

   

}
