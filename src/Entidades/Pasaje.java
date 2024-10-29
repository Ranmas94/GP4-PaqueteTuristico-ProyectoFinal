
package Entidades;

/**
 *
 * @author Ranma
 */


public class Pasaje {
    

    
    private int idPasaje;
    private String tipo;
    private double costo;
    private Destino origen;
    private Destino destino;
    private int asiento;
    
    //Constructor vacio

    public Pasaje() {
    }
    
    
    // Constructor
    public Pasaje(int idPasaje, String tipo, double costo, Destino origen, Destino destino, int asiento) {
        this.idPasaje = idPasaje;
        this.tipo = tipo;
        this.costo = costo;
        this.origen = origen;
        this.destino = destino;
        this.asiento = asiento;
    }
    
    //Constructor sin id

    public Pasaje(String tipo, double costo, Destino origen, Destino destino, int asiento) {
        this.tipo = tipo;
        this.costo = costo;
        this.origen = origen;
        this.destino = destino;
        this.asiento = asiento;
    }


    // Getters y Setters

    public int getIdPasaje() {
        return idPasaje;
    }

    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
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
    

    // Metodo para mostrar info del pasaje
    public void mostrarInfo() {
        System.out.println("Pasaje: " + tipo + " - Costo: " + costo + " - Asiento: " + asiento);
    }
}

