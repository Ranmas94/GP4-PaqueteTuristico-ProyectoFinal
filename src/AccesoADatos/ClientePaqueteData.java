/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.ClientePaquete;
import java.sql.Connection;
import Entidades.Destino;
import Entidades.DestinoEstadistica;
import Entidades.Estadia;
import Entidades.MenuPension;
import Entidades.Paquete;
import Entidades.PaqueteDetalle;
import Entidades.Pasaje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lourdes
 */
public class ClientePaqueteData {
     private Connection con=null;

    public ClientePaqueteData() {
        con = Conexion.getConexion();
    }
    
    public void guardarClientePaquete(ClientePaquete clientePaquete) {
    String sql = "INSERT INTO cliente_paquete (idCliente, idPaquete) VALUES (?, ?)";
    try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
        ps.setInt(1, clientePaquete.getCliente().getIdCliente());
        ps.setInt(2, clientePaquete.getPaquete().getIdPaquete());

        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            clientePaquete.setIdClientePaquete(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Cliente asociado al paquete con éxito.");
        }
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al asociar cliente al paquete: " + ex.getMessage());
    }
}
    
    public void modificarClientePaquete(ClientePaquete clientePaquete) {
    String sql = "UPDATE cliente_paquete SET idCliente = ?, idPaquete = ? WHERE idClientePaquete = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, clientePaquete.getCliente().getIdCliente());
        ps.setInt(2, clientePaquete.getPaquete().getIdPaquete());
        ps.setInt(3, clientePaquete.getIdClientePaquete());

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Asociación cliente-paquete actualizada.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la asociación con el ID especificado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al actualizar la asociación: " + ex.getMessage());
    }
}
    
    public void eliminarClientePaquete(int idClientePaquete) {
    String sql = "DELETE FROM cliente_paquete WHERE idClientePaquete = ?";
    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, idClientePaquete);

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Asociación cliente-paquete eliminada.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la asociación con el ID especificado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la asociación: " + ex.getMessage());
    }
}
}
