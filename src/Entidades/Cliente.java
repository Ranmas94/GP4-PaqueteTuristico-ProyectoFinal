/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ranma
 */
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String apellido;
    private String correo;
    private long telefono;

    // Constructor
    public Cliente(int idCliente, String nombre, String apellido, String correo, long telefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Getters y Setters

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefonos(long telefono) {
        this.telefono = telefono;
    }
    

    // Metodo para mostrar info del cliente
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + " " + apellido + " - Correo: " + correo);
    }
}

