/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Menu {
    
// Enum para tipo de menú
    public enum tipoMenu {
        SIN_PENSION("Sin Pensión"),
        DESAYUNO("Desayuno"),
        MEDIA_PENSION("Media Pensión"),
        PENSION_COMPLETA("Pensión Completa");

        private final String descripcion;

        tipoMenu(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }

        // Método para obtener el TipoMenu a partir de una cadena
        public static tipoMenu fromString(String descripcion) {
            for (tipoMenu tipo : tipoMenu.values()) {
                if (tipo.descripcion.equalsIgnoreCase(descripcion)) {
                    return tipo;
                }
            }
            throw new IllegalArgumentException("Tipo de menú desconocido: " + descripcion);
        }
    }

    
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
        this.porcentaje = porcentaje;
    }
    
    //Constructor sin id

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