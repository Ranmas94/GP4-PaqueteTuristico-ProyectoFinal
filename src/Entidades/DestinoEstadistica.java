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
    private String ciudad;
    private String lugar;
    private int cantidad;

    public DestinoEstadistica() {
    }

    public DestinoEstadistica(String ciudad, String lugar, int cantidad) {
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.cantidad = cantidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "DestinoEstadistica{" + "ciudad=" + ciudad + ", lugar=" + lugar + ", cantidad=" + cantidad + '}';
    }

   
    
    
}
