/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Lourdes
 */
public class ClientePaquete {
    private int idClientePaquete;
    private Cliente cliente;
    private Paquete paquete;

    // Constructores
    public ClientePaquete() {}

    public ClientePaquete(Cliente cliente, Paquete paquete) {
        this.cliente = cliente;
        this.paquete = paquete;
    }
    
    //constructor con id
    public ClientePaquete(int idClientePaquete, Cliente cliente, Paquete paquete) {
        this.idClientePaquete = idClientePaquete;
        this.cliente = cliente;
        this.paquete = paquete;
    }
   

    public int getIdClientePaquete() {
        return idClientePaquete;
    }

    public void setIdClientePaquete(int idClientePaquete) {
        this.idClientePaquete = idClientePaquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    // Getters y Setters
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    @Override
    public String toString() {
        return "ClientePaquete{" + "idClientePaquete=" + idClientePaquete + ", cliente=" + cliente + ", paquete=" + paquete + '}';
    }
    
   
}
