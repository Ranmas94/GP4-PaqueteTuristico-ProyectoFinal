/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ranma
 */
public class Destino {
    private int idDestino;
    private String nombre;
    private String codigo; //Codigo SL san luis, BSAS buenos aires, etc

       //Contructor vacio

    public Destino() {
    }
    
    
    // Constructor
    public Destino(int idDestino, String nombre, String codigo) {
        this.idDestino = idDestino;
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    //Contructor sin idDestino

    public Destino(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    

    // Getters y Setters

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    

    // Motodo para mostrar info del destino
    public void mostrarInfo() {
        System.out.println("Destino: " + nombre + " (Código: " + codigo + ")");
    }
}

