
package Entidades;

/**
 *
 * @author Ranma
 */


public class Pasaje {
    
private int idPasaje;
private Transporte idTransporte;
private Destino origen;
private Destino destino;
private int asiento;

    public Pasaje() {
    }

    public Pasaje(int idPasaje, Transporte idTransporte, Destino origen, Destino destino, int asiento) {
        this.idPasaje = idPasaje;
        this.idTransporte = idTransporte;
        this.origen = origen;
        this.destino = destino;
        this.asiento = asiento;
    }

    public Pasaje(Transporte idTransporte, Destino origen, Destino destino, int asiento) {
        this.idTransporte = idTransporte;
        this.origen = origen;
        this.destino = destino;
        this.asiento = asiento;
    }

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public Transporte getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Transporte idTransporte) {
        this.idTransporte = idTransporte;
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

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "idTransporte=" + idTransporte + ", origen=" + origen + ", destino=" + destino + ", asiento=" + asiento + '}';
    }



}

