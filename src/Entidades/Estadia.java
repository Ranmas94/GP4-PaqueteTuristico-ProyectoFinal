/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ranma
 */
import java.util.Date;

public class Estadia {
    private int idEstadia;
    private int idAlojamiento;
    private Date fechaCheckIn;
    private Date fechaCheckOut;
    private double total; //dias

    // Constructor
    public Estadia(int idEstadia, int idAlojamiento, Date fechaCheckIn, Date fechaCheckOut) {
        this.idEstadia = idEstadia;
        this.idAlojamiento = idAlojamiento;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.total = calcularTotal();
    }

    // Metodo para calcular el total de dias que se queda
    private double calcularTotal() {
        long diff = fechaCheckOut.getTime() - fechaCheckIn.getTime();
        long dias = diff / (1000 * 60 * 60 * 24); //si hay una forma mas simple modificar y avisar pls
        return dias * total; // Total de dias de estadia
    }

    // Getters y Setters

    public int getIdEstadia() {
        return idEstadia;
    }

    public void setIdEstadia(int idEstadia) {
        this.idEstadia = idEstadia;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public Date getFechaCheckIn() {
        return fechaCheckIn;
    }

    public void setFechaCheckIn(Date fechaCheckIn) {
        this.fechaCheckIn = fechaCheckIn;
    }

    public Date getFechaCheckOut() {
        return fechaCheckOut;
    }

    public void setFechaCheckOut(Date fechaCheckOut) {
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

