
package AccesoADatos;

import Entidades.Destino;
import Entidades.Pasaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Stefani
 */
public class PasajeData {
    
    private Connection con = null;

    public PasajeData() {
        con = Conexion.getConexion();
    }
    
 // Método para agregar un pasaje
    public void agregarPasaje(Pasaje pasaje) {
        String sql = "INSERT INTO pasajes (tipo, costo, origen_id, destino_id, asiento) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, pasaje.getTipo());
            ps.setDouble(2, pasaje.getCosto());
            ps.setInt(3, pasaje.getOrigen().getIdDestino()); 
            ps.setInt(4, pasaje.getDestino().getIdDestino());
            ps.setInt(5, pasaje.getAsiento());

            ps.executeUpdate();
            
            
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));
            }
            
            System.out.println("Pasaje agregado con éxito");
        } catch (SQLException ex) {
            System.out.println("Error al agregar el pasaje: " + ex.getMessage());
        }
    }

    // Método para actualizar un pasaje
    public void actualizarPasaje(Pasaje pasaje) {
        String sql = "UPDATE pasajes SET tipo = ?, costo = ?, origen_id = ?, destino_id = ?, asiento = ? WHERE idPasaje = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, pasaje.getTipo());
            ps.setDouble(2, pasaje.getCosto());
            ps.setInt(3, pasaje.getOrigen().getIdDestino());
            ps.setInt(4, pasaje.getDestino().getIdDestino());
            ps.setInt(5, pasaje.getAsiento());
            ps.setInt(6, pasaje.getIdPasaje());

            ps.executeUpdate();
            System.out.println("Pasaje actualizado con éxito");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el pasaje: " + ex.getMessage());
        }
    }

    // Método para eliminar un pasaje por ID
    public void eliminarPasaje(int idPasaje) {
        String sql = "DELETE FROM pasajes WHERE idPasaje = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idPasaje);

            ps.executeUpdate();
            System.out.println("Pasaje eliminado con éxito");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el pasaje: " + ex.getMessage());
        }
    }

   

    // Método para obtener todos los pasajes
    public List<Pasaje> obtenerTodosLosPasajes() {
        List<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasajes";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo(rs.getString("tipo"));
                pasaje.setCosto(rs.getDouble("costo"));
                
       
                pasajes.add(pasaje);
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener todos los pasajes: " + ex.getMessage());
        }

        return pasajes;
    }
}