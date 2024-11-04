/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;


import Entidades.Destino;
import Entidades.Estadia;
import Entidades.MenuPension;
import Entidades.Paquete;
import Entidades.Pasaje;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 *
 * @author Lourdes
 */
public class PaqueteData {
     private Connection con=null;

    public PaqueteData() {
        con = Conexion.getConexion();
    }
    
    //Guardar un paquete
    public void guardarPaquete(Paquete paquete){
        String sql = "INSERT INTO paquete(idEstadia, idPasaje, idMenu, origen, destino, fechaInicio, fechaFin, cantidadPasajeros, medioPago, pagado, cancelado, precioTotal"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        
         try {
             PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
             
             ps.setInt(1, paquete.getIdEstadia().getIdEstadia());
             ps.setInt(2, paquete.getIdPasaje().getIdPasaje());
             ps.setInt(3, paquete.getIdMenu().getIdMenu());
             ps.setInt(4,paquete.getOrigen().getIdDestino());
             ps.setInt(5,paquete.getDestino().getIdDestino());
             ps.setDate(6, (Date) paquete.getFechaInicio());
             ps.setDate(7, (Date) paquete.getFechaFin());
             ps.setInt(8, paquete.getCantidadPasajeros());
             ps.setString(9, paquete.getMedioPago());
             ps.setBoolean(10, paquete.isPagado());
             ps.setBoolean(11, paquete.isCancelado());
             ps.setDouble(12, paquete.getPrecioTotal());
             
             ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
               paquete.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete guardado con éxito.");
            }
            ps.close();
            rs.close();
             
             
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al guardar paquete.");
         }
    }
    
    public void modificarPaquete(Paquete paquete){
        String sql = "UPDATE paquete SET idEstadia = ?, idPasaje = ?, idMenu = ?, origen = ?, destino = ?, fechaInicio = ?, fechaFin = ?, cantidadPasajeros = ?, medioPago = ?"
                + ", pagado = ?, cancelado = ?, precioTotal = ? WHERE idPaquete = ?";
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
              ps.setInt(1, paquete.getIdEstadia().getIdEstadia());
             ps.setInt(2, paquete.getIdPasaje().getIdPasaje());
             ps.setInt(3, paquete.getIdMenu().getIdMenu());
             ps.setInt(4,paquete.getOrigen().getIdDestino());
             ps.setInt(5,paquete.getDestino().getIdDestino());
             ps.setDate(6, (Date) paquete.getFechaInicio());
             ps.setDate(7, (Date) paquete.getFechaFin());
             ps.setInt(8, paquete.getCantidadPasajeros());
             ps.setString(9, paquete.getMedioPago());
             ps.setBoolean(10, paquete.isPagado());
             ps.setBoolean(11, paquete.isCancelado());
             ps.setDouble(12, paquete.getPrecioTotal());
             ps.setInt(13, paquete.getIdPaquete());
             
              int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            System.out.println("Paquete actualizado correctamente.");
        } else {
            System.out.println("No se encontró Paquete con el ID especificado.");
        }
        
      
        ps.close();

         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al guardar paquete.");
         }
    }
    
    //cancelar paquete
    
  public void cancelarPaquetePorId(int idPaquete) {
    LocalDate fechaActual = LocalDate.now();
    LocalDate fechaInicioViaje = null;

    // Obtener la fecha de inicio del viaje usando el idPaquete
    String sqlFecha = "SELECT fechaInicio FROM paquete WHERE idPaquete = ?";

    try (PreparedStatement psFecha = con.prepareStatement(sqlFecha)) {
        psFecha.setInt(1, idPaquete);
        ResultSet rs = psFecha.executeQuery();
        
        if (rs.next()) {
            fechaInicioViaje = rs.getDate("fechaInicio").toLocalDate();
        }
        rs.close();
        
        // Validar si la fecha es suficiente para cancelar
        if (fechaInicioViaje != null && ChronoUnit.DAYS.between(fechaActual, fechaInicioViaje) >= 30) {
            String sqlCancel = "UPDATE paquete SET cancelado = ? WHERE idPaquete = ?";
            
            try (PreparedStatement psCancel = con.prepareStatement(sqlCancel)) {
                psCancel.setBoolean(1, true);
                psCancel.setInt(2, idPaquete);
                
                int filasActualizadas = psCancel.executeUpdate();
                
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "Paquete cancelado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el paquete especificado.");
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al cancelar el paquete: " + ex.getMessage());
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "No es posible cancelar el paquete con menos de 30 días de antelación.");
        }
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener la fecha de inicio del paquete: " + ex.getMessage());
    }
}
  
  public ArrayList<Paquete> resumenPaquetesComprados(){
      ArrayList<Paquete> resumen = new ArrayList<>();
     LocalDate fecha = LocalDate.now().minusMonths(2);
      String sql = "SELECT * FROM paquete WHERE paquete.fechaFin > ? AND paquete.cancelado = false";
      
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setDate(1, Date.valueOf(fecha));
             
             ResultSet rs = ps.executeQuery();
             while(rs.next()){
                 Paquete paquete = new Paquete();
                 
                 Estadia estadia = new Estadia();
                 Pasaje pasaje = new Pasaje();
                 MenuPension menu = new MenuPension();
                 Destino origen = new Destino();
                 Destino destino = new Destino();
                 
                 estadia.setIdEstadia(rs.getInt("idEstadia"));
                 pasaje.setIdPasaje(rs.getInt("idPasaje"));
                 menu.setIdMenu(rs.getInt("idMenu"));
                 origen.setIdDestino(rs.getInt("origen"));
                 destino.setIdDestino(rs.getInt("destino"));
                 
                 paquete.setIdPaquete(rs.getInt("idPaquete"));
                 paquete.setIdEstadia(estadia);
                 paquete.setIdPasaje(pasaje);
                 paquete.setIdMenu(menu);
                 paquete.setOrigen(origen);
                 paquete.setDestino(destino);
                 paquete.setFechaInicio(rs.getDate("fechaInicio"));
                 paquete.setFechaFin(rs.getDate("fechaFin"));
                 paquete.setTemporada(rs.getString("temporada"));
                 paquete.setCantidadPasajeros(rs.getInt("cantidadPasajeros"));
                 paquete.setMedioPago(rs.getString("medioPago"));
                 paquete.setPagado(rs.getBoolean("pagado"));
                 paquete.setCancelado(rs.getBoolean("cancelado"));
                 paquete.setPrecioTotal(rs.getDouble("precioTotal"));
                 
                 resumen.add(paquete);
             }
             ps.close();
             rs.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al encontrar coincidencias." + ex.getMessage());
         }
         return resumen;
  }
    
}
