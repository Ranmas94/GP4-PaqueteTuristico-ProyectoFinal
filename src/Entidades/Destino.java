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
    private String ciudad;
    private String lugar; //Codigo SL san luis, BSAS buenos aires, etc

       //Contructor vacio

    public Destino() {
    }
    
    
    // Constructor
    public Destino(int idDestino, String nombre, String codigo) {
        this.idDestino = idDestino;
        this.ciudad = nombre;
        this.lugar = codigo;
    }
    
    //Contructor sin idDestino

    public Destino(String nombre, String codigo) {
        this.ciudad = nombre;
        this.lugar = codigo;
    }
    

    // Getters y Setters

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
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
    

    // Motodo para mostrar info del destino
    public void mostrarInfo() {
        System.out.println("Destino: " + ciudad + " (Código: " + lugar + ")");
    }
}

