/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ranma
 */
public class Pasaje {
    private int idPasaje;
    private String tipo;
    private double costo;
    private String origen;
    private String destino;
    private String asiento;

    // Constructor
    public Pasaje(int idPasaje, String tipo, double costo, String origen, String destino, String asiento) {
        this.idPasaje = idPasaje;
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

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    

    // Metodo para mostrar info del pasaje
    public void mostrarInfo() {
        System.out.println("Pasaje: " + tipo + " - Costo: " + costo + " - Asiento: " + asiento);
    }
}

