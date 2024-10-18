
package AccesoADatos;
import Entidades.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class ClienteData {
    private Connection con = null;
    
    public ClienteData(){
       // con = Conexion.getConexion();
    }
    
    
    //Guardar Cliente
    
    public void guardarCliente(Cliente cliente){
        String sql = "INSERT INTO cliente(nombre, apellido, correo, telefono) "
                + "VALUES (?, ? , ? , ? )";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre() );
            ps.setString(2, cliente.getApellido() );
            ps.setString(3, cliente.getCorreo() );
            ps.setLong(4, cliente.getTelefono());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                cliente.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente guardado con éxito.");
            }
            
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al intentar guardar cliente. " +ex);
        }
        
    }
    
    public void actualizarCliente(Cliente cliente){
        String sql = "UPDATE cliente SET nombre = ?, apellido = ?, correo = ?, telefono = ?"
                + "WHERE idCliente = ?";
        
        try {
            PreparedStatement ps =  con.prepareStatement(sql);
            
            ps.setString(1, cliente.getNombre() );
            ps.setString(2, cliente.getApellido() );
            ps.setString(3, cliente.getCorreo() );
            ps.setLong(4, cliente.getTelefono());
            
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
}