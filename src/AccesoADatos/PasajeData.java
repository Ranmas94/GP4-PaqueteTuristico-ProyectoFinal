
package AccesoADatos;

import Entidades.Destino;
import Entidades.Pasaje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    String sql = "INSERT INTO pasajes (idTransporte, asiento, origen, destino) VALUES (?, ?, ?, ?)";

    try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        ps.setInt(1, pasaje.getIdTransporte().getIdTransporte());
        ps.setInt(2, pasaje.getAsiento());
        ps.setInt(3, pasaje.getOrigen().getIdDestino());
        ps.setInt(4, pasaje.getDestino().getIdDestino());

        ps.executeUpdate();

        try (ResultSet rs = ps.getGeneratedKeys()) {
            if (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));
            }
        }

        JOptionPane.showMessageDialog(null, "Pasaje agregado con éxito");
    } catch (SQLException ex) {
        System.out.println("Error al agregar el pasaje: " + ex.getMessage());
    }
}

// Método para actualizar un pasaje
public void actualizarPasaje(Pasaje pasaje) {
    String sql = "UPDATE pasajes SET idTransporte = ?, asiento = ?, origen = ?, destino = ? WHERE idPasaje = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, pasaje.getIdTransporte().getIdTransporte());
        ps.setInt(2, pasaje.getAsiento());
        ps.setInt(3, pasaje.getOrigen().getIdDestino());
        ps.setInt(4, pasaje.getDestino().getIdDestino());
        ps.setInt(5, pasaje.getIdPasaje());

        int filasActualizadas = ps.executeUpdate();
        if (filasActualizadas > 0) {
            JOptionPane.showMessageDialog(null, "Pasaje actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el pasaje con el ID especificado.");
        }
    } catch (SQLException ex) {
        System.out.println("Error al actualizar el pasaje: " + ex.getMessage());
    }
}

// Método para eliminar un pasaje por ID
public void eliminarPasaje(int idPasaje) {
    String sql = "DELETE FROM pasajes WHERE idPasaje = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, idPasaje);

        int filasEliminadas = ps.executeUpdate();
        if (filasEliminadas > 0) {
            JOptionPane.showMessageDialog(null, "Pasaje eliminado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el pasaje con el ID especificado.");
        }
    } catch (SQLException ex) {
        System.out.println("Error al eliminar el pasaje: " + ex.getMessage());
    }
}


}