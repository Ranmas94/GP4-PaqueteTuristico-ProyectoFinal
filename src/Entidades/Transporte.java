/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Lourdes
 */
public class Transporte {
    private int idTransporte;
    private String tipo;
    private double costo;

    public Transporte() {
    }

    public Transporte(int idTransporte, String tipo, double costo) {
        this.idTransporte = idTransporte;
        this.tipo = tipo;
        this.costo = costo;
    }

    public Transporte(String tipo, double costo) {
        this.tipo = tipo;
        this.costo = costo;
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
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

    @Override
    public String toString() {
        return "Transporte{" + "idTransporte=" + idTransporte + ", tipo=" + tipo + ", costo=" + costo + '}';
    }
    
    
    
}
