/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Alojamiento;
import Entidades.Estadia;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class EstadiaData {
     private Connection con = null;
    
    public EstadiaData(){
       con = Conexion.getConexion();
    }
    
    //guardar
     public void guardarEstadia(Estadia estadia) {
        String sql = "INSERT INTO estadia (idAlojamiento, fechaCheckIn, fechaCheckOut, total) VALUES (?, ?, ?, ?)";
         try {
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
          
             ps.setInt(1, estadia.getIdAlojamiento().getIdAlojamiento());
             ps.setDate(2, new java.sql.Date(estadia.getFechaCheckIn().getTime()));
             ps.setDate(3, new java.sql.Date(estadia.getFechaCheckOut().getTime()));
             ps.setDouble(4, estadia.getTotal());

             ps.executeUpdate();
             ResultSet rs = ps.getGeneratedKeys();
             while (rs.next()) {
               estadia.setIdEstadia(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Estadia guardada con éxito.");
            }
            ps.close();
            rs.close();
         } catch (SQLException ex) {
             System.out.println("Error al agregar estadía: " + ex.getMessage());
         }
              
    }
     
    //modificar
     public void actualizarEstadia(Estadia estadia) {
        String sql = "UPDATE estadia SET idAlojamiento = ?, fechaCheckIn = ?, fechaCheckOut = ?, total = ? WHERE idEstadia = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, estadia.getIdAlojamiento().getIdAlojamiento());
            ps.setDate(2,  new java.sql.Date(estadia.getFechaCheckIn().getTime()));
            ps.setDate(3, new java.sql.Date(estadia.getFechaCheckOut().getTime()));
            ps.setDouble(4, estadia.getTotal());
            ps.setInt(5, estadia.getIdEstadia());

             int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            System.out.println("Estadia actualizada correctamente.");
        } else {
            System.out.println("No se encontró una Estadia con el ID especificado.");
        }
        
      
        ps.close();
            
            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar estadía: " + ex.getMessage());
        }
    }
     
     public Estadia obtenerEstadia(int idEstadia) {
        String sql = "SELECT * FROM estadia WHERE idEstadia = ?";
        Estadia estadia = null;
        try (PreparedStatement statement = con.prepareStatement(sql)) {
            statement.setInt(1, idEstadia);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    estadia = new Estadia();
                    estadia.setIdEstadia(resultSet.getInt("idEstadia"));
                    estadia.setFechaCheckIn(resultSet.getDate("fechaCheckIn"));
                    estadia.setFechaCheckOut(resultSet.getDate("fechaCheckOut"));
                    estadia.setTotal(resultSet.getDouble("total"));
                    
                    Alojamiento alojamiento = new Alojamiento();
                    alojamiento.setIdAlojamiento(resultSet.getInt("idAlojamiento"));
                    estadia.setIdAlojamiento(alojamiento);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener estadía: " + ex.getMessage());
        }
        return estadia;
    }
     
    
}
