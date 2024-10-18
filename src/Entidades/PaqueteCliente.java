
package Entidades;



/**
 *
 * @author Lourdes
 */
public class PaqueteCliente {
    private int idPaqueteCliente;
    private Cliente idcliente;
    private Paquete idpaquete;
    private boolean pagado;
    
    //Constructor vacio

    public PaqueteCliente() {
    }
    
    
    //Constructor con id

    public PaqueteCliente(int idPaqueteCliente, Cliente idcliente, Paquete idpaquete, boolean pagado) {
        this.idPaqueteCliente = idPaqueteCliente;
        this.idcliente = idcliente;
        this.idpaquete = idpaquete;
        this.pagado = pagado;
    }
    
    //Constructor sin id

    public PaqueteCliente(Cliente idcliente, Paquete idpaquete, boolean pagado) {
        this.idcliente = idcliente;
        this.idpaquete = idpaquete;
        this.pagado = pagado;
    }

    //GETTER & SETTER
    public int getIdPaqueteCliente() {
        return idPaqueteCliente;
    }

    public void setIdPaqueteCliente(int idPaqueteCliente) {
        this.idPaqueteCliente = idPaqueteCliente;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public Paquete getIdpaquete() {
        return idpaquete;
    }

    public void setIdpaquete(Paquete idpaquete) {
        this.idpaquete = idpaquete;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "PaqueteCliente{" + "idPaqueteCliente=" + idPaqueteCliente + ", idcliente=" + idcliente + ", idpaquete=" + idpaquete + ", pagado=" + pagado + '}';
    }
    
    
    
            
}
