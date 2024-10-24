
package AccesoADatos;

import Entidades.Cliente;
import java.sql.Connection;

/**
 *
 * @author Stefani Nair Escobar
 */
public class mainPruebas {

    
    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        
        //Creamos clientes con los datos de los integrantes del grupo
        //public Cliente(int idCliente, String nombre, String apellido, String correo, String telefono)
        Cliente cli1 = new Cliente(1,"Lourdes", "Escudero", "lourdesescudero@gmail.com", "26640000");
        Cliente cli2 = new Cliente(2,"Victor", "Aguilera", "victoraguilera@gmail.com", "2664111111");
        Cliente cli3 = new Cliente(3,"Stefani", "Escobar", "stefaniescobar@gmail.com", "2664222222");
        Cliente cli4 = new Cliente(4,"Dante", "Poblete", "dantepoblete@gmail.com", "2664333333");
        Cliente cli5 = new Cliente(5,"Federico", "Grippo", "federicogrippo@gmail.com", "2664444444");
        Cliente cli6 = new Cliente(6,"Maximiliano", "Matilla", "maximilianomatilla@gmail.com", "2664555555");
        
        //Agregamos los clientes a la base de datos a través de ClienteData
        ClienteData cliente = new ClienteData();
        cliente.guardarCliente(cli1);
        cliente.guardarCliente(cli2);
        cliente.guardarCliente(cli3);
        cliente.guardarCliente(cli4);
        cliente.guardarCliente(cli5);
        cliente.guardarCliente(cli6);
       
        //Mostramos por pantalla los clientes agregados
        for (Cliente cli:cliente.listarClientes()) {
            System.out.println(cli);
        }     
    }    
}
