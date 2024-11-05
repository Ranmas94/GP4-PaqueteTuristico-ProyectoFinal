/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Lourdes
 */
public class DestinoEstadistica {
    private Destino destino;
    private int cantidad;

    public DestinoEstadistica(Destino destino, int cantidad) {
        this.destino = destino;
        this.cantidad = cantidad;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DestinoEstadistica{" + "destino=" + destino + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
