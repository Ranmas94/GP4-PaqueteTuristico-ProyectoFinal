/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Ranma
 */
public class Menu {
    
    public enum tipoMenu{
        SIN_PENSION, 
        SOLO_DESAYUNO, 
        MEDIA_PENSION, 
        PENSION_COMPLETA;
    };
    
    private int idMenu;
    private tipoMenu tipo; // sin pension, solo desayuno, media pension, pension completa
    private double porcentaje; // es el porcentaje que se le sumará a el precio final 
    //(sin pensión 0%, desayuno (+1%), media pensión (+2%))

    
     //Contructor vacio
    public Menu() {
    }

    // Constructor
    public Menu(int idMenu, tipoMenu tipo, double porcentaje) {
        this.idMenu = idMenu;
        this.tipo = tipo;
    }
    
    //Constructor si id

    public Menu(tipoMenu tipo, double porcentaje) {
        this.tipo = tipo;
        this.porcentaje = porcentaje;
    }
    
    
    // Getters y Setters
    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public tipoMenu getTipo() {
        return tipo;
    }

    public void setTipo(tipoMenu tipo) {
        this.tipo = tipo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
}