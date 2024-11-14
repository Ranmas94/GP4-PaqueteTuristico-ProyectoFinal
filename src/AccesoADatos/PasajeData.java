
package AccesoADatos;

import Entidades.Destino;
import Entidades.Pasaje;
import Entidades.Transporte;

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
    String sql = "INSERT INTO pasaje (asiento, idTransporte,  origen, destino) VALUES (?, ?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
       
        ps.setInt(1, pasaje.getAsiento());
         ps.setInt(2, pasaje.getIdTransporte().getIdTransporte());
        ps.setInt(3, pasaje.getOrigen().getIdDestino());
        ps.setInt(4, pasaje.getDestino().getIdDestino());

        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys(); 
            if (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));
                
            }
        

        
    } catch (SQLException ex) {
        System.out.println("Error al agregar el pasaje: " + ex.getMessage());
    }
}

// Método para actualizar un pasaje
public void actualizarPasaje(Pasaje pasaje) {
    String sql = "UPDATE pasaje SET  asiento = ?,idTransporte = ?, origen = ?, destino = ? WHERE idPasaje = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, pasaje.getAsiento());
        ps.setInt(2, pasaje.getIdTransporte().getIdTransporte());
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


// Método para buscar un pasaje por ID
public Pasaje buscarPasajePorId(int idPasaje) {
    String sql = "SELECT idPasaje, asiento, idTransporte, origen, destino FROM pasaje WHERE idPasaje = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, idPasaje);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            // Crear y llenar un objeto Pasaje
            Pasaje pasaje = new Pasaje();
            pasaje.setIdPasaje(rs.getInt("idPasaje"));
            pasaje.setAsiento(rs.getInt("asiento"));

            // Solo asignamos los IDs para Transporte y Destino
            Transporte transporte = new Transporte();
            transporte.setIdTransporte(rs.getInt("idTransporte"));
            pasaje.setIdTransporte(transporte);

            Destino origen = new Destino();
            origen.setIdDestino(rs.getInt("origen"));
            pasaje.setOrigen(origen);

            Destino destino = new Destino();
            destino.setIdDestino(rs.getInt("destino"));
            pasaje.setDestino(destino);

            return pasaje; // Devolver el objeto Pasaje
        }
    } catch (SQLException ex) {
        System.out.println("Error al buscar el pasaje: " + ex.getMessage());
    }
    return null; // Si no se encontró el pasaje
}

// Método para eliminar un pasaje por ID
public void eliminarPasaje(int idPasaje) {
    String sql = "DELETE FROM pasaje WHERE idPasaje = ?";

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