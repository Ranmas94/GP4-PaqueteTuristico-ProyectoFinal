/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ranma
 */
public class Alojamiento {
    private int idAlojamiento;
    private int idDestino;
    private String nombre;
    private String direccion;
    private int capacidad;
    private int nroAmbientes;
    private int camas;
    private int banios;
    private double precioPorNoche;

    // Constructor
    public Alojamiento(int idAlojamiento, int idDestino, String nombre, String direccion, int capacidad,
                       int nroAmbientes, int camas, int banios, double precioPorNoche) {
        this.idAlojamiento = idAlojamiento;
        this.idDestino = idDestino;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.nroAmbientes = nroAmbientes;
        this.camas = camas;
        this.banios = banios;
        this.precioPorNoche = precioPorNoche;
    }

    // Getters y Setters

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNroAmbientes() {
        return nroAmbientes;
    }

    public void setNroAmbientes(int nroAmbientes) {
        this.nroAmbientes = nroAmbientes;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    

    // Metodo para mostrar info del alojamiento
    public void mostrarInfo() {
        System.out.println("Alojamiento: " + nombre + " - Direccion: " + direccion + " - Precio por noche: " + precioPorNoche);
    }
}

