/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ranma
 */
import java.time.LocalDate;


public class Estadia {
    private int idEstadia;
    private Alojamiento idAlojamiento;
    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;
    private double total; 

     // Constructor vacio
    public Estadia() {    
    }

    // Constructor
    public Estadia(int idEstadia, Alojamiento idAlojamiento, LocalDate fechaCheckIn, LocalDate fechaCheckOut) {
        this.idEstadia = idEstadia;
        this.idAlojamiento = idAlojamiento;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;

    }
    
    //Contructor sin id

    public Estadia(Alojamiento idAlojamiento, LocalDate fechaCheckIn, LocalDate fechaCheckOut, double total) {
        this.idAlojamiento = idAlojamiento;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.total = total;
    }
    

    // Getters y Setters

    public int getIdEstadia() {
        return idEstadia;
    }

    public void setIdEstadia(int idEstadia) {
        this.idEstadia = idEstadia;
    }

    public Alojamiento getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(Alojamiento idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(LocalDate fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public LocalDate getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(LocalDate fechaCheckOut) {
        this.fechaCheckOut = fechaCheckOut;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    

    // Metodo para mostrar info de la estadia
    public void mostrarInfo() {
        System.out.println("Estadia: Check-in: " + fechaCheckIn + " - Check-out: " + fechaCheckOut + " - Total de dias: " + total);
    }
}

