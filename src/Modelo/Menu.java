/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ranma
 */
public class Menu {
    private int idMenu;
    private String tipo; // sin pension, solo desayuno, media pension, pension completa
    private double porcentaje; // es el porcentaje que se le sumará a el precio final 
    //(sin pensión 0%, desayuno (+1%), media pensión (+2%))

    // Constructor
    public Menu(int idMenu, String tipo, double porcentaje) {
        this.idMenu = idMenu;
        this.tipo = tipo;

    }
    
    // Getters y Setters
    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}