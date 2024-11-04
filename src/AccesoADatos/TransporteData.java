/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;


import Entidades.Transporte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TransporteData {
    
    private Connection con = null;

    public TransporteData() {
        con = Conexion.getConexion();
    }
    
    
     // Método para agregar un transporte
    public void agregarTransporte(Transporte transporte) {
        String sql = "INSERT INTO transporte (tipo, costo) VALUES (?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, transporte.getTipo());
            ps.setDouble(2, transporte.getCosto());

            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    transporte.setIdTransporte(rs.getInt(1));
                }
            }

            JOptionPane.showMessageDialog(null, "Transporte agregado con éxito");
        } catch (SQLException ex) {
            System.out.println("Error al agregar el transporte: " + ex.getMessage());
        }
    }

    // Método para actualizar un transporte
    public void actualizarTransporte(Transporte transporte) {
        String sql = "UPDATE transporte SET tipo = ?, costo = ? WHERE idTransporte = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, transporte.getTipo());
            ps.setDouble(2, transporte.getCosto());
            ps.setInt(3, transporte.getIdTransporte());

            int filasActualizadas = ps.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "Transporte actualizado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el transporte con el ID especificado.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el transporte: " + ex.getMessage());
        }
    }

    // Método para eliminar un transporte por ID
    public void eliminarTransporte(int idTransporte) {
        String sql = "DELETE FROM transporte WHERE idTransporte = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, idTransporte);

            int filasEliminadas = ps.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "Transporte eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el transporte con el ID especificado.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el transporte: " + ex.getMessage());
        }
    }

    // Método para obtener el costo de un transporte a partir de su tipo
public Double obtenerCostoPorTipo(String tipo) {
    String sql = "SELECT costo FROM transporte WHERE tipo = ?";
    Double costo = null;

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, tipo);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                costo = rs.getDouble("costo");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el transporte con el tipo especificado.");
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error al obtener el costo del transporte: " + ex.getMessage());
    }

    return costo;
}

// Método para obtener todos los tipos de transporte en un ArrayList
public ArrayList<String> obtenerTodosLosTipos() {
    ArrayList<String> tipos = new ArrayList<>();
    String sql = "SELECT tipo FROM transporte";

    try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            tipos.add(rs.getString("tipo"));
        }
    } catch (SQLException ex) {
        System.out.println("Error al obtener los tipos de transporte: " + ex.getMessage());
    }

    return tipos;
}

// Método para obtener un objeto Transporte a partir del tipo de transporte
public Transporte obtenerTransportePorTipo(String tipo) {
    String sql = "SELECT * FROM transporte WHERE tipo = ?";
    Transporte transporte = null;

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, tipo);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                transporte = new Transporte();
                transporte.setIdTransporte(rs.getInt("idTransporte"));
                transporte.setTipo(rs.getString("tipo"));
                transporte.setCosto(rs.getDouble("costo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el transporte con el tipo especificado.");
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error al obtener el transporte: " + ex.getMessage());
    }

    return transporte;
}

// Método para obtener un objeto Transporte a partir de su ID
public Transporte obtenerTransportePorId(int idTransporte) {
    String sql = "SELECT * FROM transporte WHERE idTransporte = ?";
    Transporte transporte = null;

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, idTransporte);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                transporte = new Transporte();
                transporte.setIdTransporte(rs.getInt("idTransporte"));
                transporte.setTipo(rs.getString("tipo"));
                transporte.setCosto(rs.getDouble("costo"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el transporte con el ID especificado.");
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error al obtener el transporte por ID: " + ex.getMessage());
    }

    return transporte;
}

}

