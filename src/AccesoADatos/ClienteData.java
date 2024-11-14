
package AccesoADatos;
import Entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class ClienteData {
    private Connection con = null;
    
    public ClienteData(){
       con = Conexion.getConexion();
    }
    
    
    //Guardar Cliente
    
    public void guardarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente(nombre, apellido, documento ,correo, telefono) "
                + "VALUES (?, ? , ? , ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre() );
            ps.setString(2, cliente.getApellido());
            ps.setLong(3, cliente.getDocumento());
            ps.setString(4, cliente.getCorreo() );
            ps.setString(5, cliente.getTelefono());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                cliente.setIdCliente(rs.getInt(1));
                
            }
            
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al intentar guardar cliente. " +ex);
        }
        
    }
    
    public void actualizarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET nombre = ?, apellido = ?, documento = ?, correo = ?, telefono = ?"
                + "WHERE idCliente = ?";
        
        try {
            PreparedStatement ps =  con.prepareStatement(sql);
            
            ps.setString(1, cliente.getNombre() );
            ps.setString(2, cliente.getApellido() );
            ps.setLong(3, cliente.getDocumento());
            ps.setString(4, cliente.getCorreo() );
            ps.setString(5, cliente.getTelefono());
            
           int exito = ps.executeUpdate();
           if(exito == 1){
                 JOptionPane.showMessageDialog(null, "Cliente modificado");
            }
            
            ps.close();
          
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al intentar modificar cliente. " +ex);
        }
    }
    
    public void borrarCliente(int idCliente){
        String sql = "DELETE FROM cliente WHERE idCliente = ?";
        
        try {
            PreparedStatement ps = con.prepareCall(sql);
            ps.setInt(1, idCliente);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
            }

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al intentar eliminar cliente. " +ex);
        }
}
    
    //listar Clientes
      public List<Cliente> listarClientes(){
          String sql = "SELECT idCliente, nombre, apellido, documento, correo, telefono FROM cliente WHERE 1";
                 
          ArrayList<Cliente> clientes = new ArrayList<>();
          
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery(); 
             
             while(rs.next()){
                 Cliente cli = new Cliente();
                 cli.setIdCliente(rs.getInt("idCliente"));
                 cli.setNombre(rs.getString("nombre"));
                 cli.setApellido(rs.getString("apellido"));
                 cli.setDocumento(rs.getLong("documento"));
                 cli.setCorreo(rs.getString("correo"));
                 cli.setTelefono(rs.getString("telefono"));
                 
                  
                  clientes.add(cli);
             }
             
             ps.close();
             rs.close();
             
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Cliente"+ ex);
         }
         return clientes;  
      }
      
}