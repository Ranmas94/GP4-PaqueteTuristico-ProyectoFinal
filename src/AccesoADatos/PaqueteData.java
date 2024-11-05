/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;


import Entidades.Destino;
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
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

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
    
    //MODIFICAR PAQUETE
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
  
  
  //METODO QUE MUESTRA TODOS LOS PAQUETES. USAR DE BASE SI SE REQUIERE AGREGAR UNA CONDICION.
  public ArrayList<Paquete> mostrarPaquetes(){
      ArrayList<Paquete> paquetes = new ArrayList<>();
     
      String sql = "SELECT * FROM paquete ";
      
         try {
             PreparedStatement ps = con.prepareStatement(sql);
     
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
                 
                 paquetes.add(paquete);
             }
             ps.close();
             rs.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al encontrar coincidencias." + ex.getMessage());
         }
         return paquetes;
  }
  
  //METODO QUE MUESTRA LOS PAQUETES QUE FUERON COMPRADOS LOS ULTIMOS DOS MESES
  
  public ArrayList<Paquete> resumenPaquetesComprados(){
      ArrayList<Paquete> resumen = new ArrayList<>();
     LocalDate fecha = LocalDate.now().minusMonths(2); //le restamos dos meses a la fecha actual
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
  
  //metodo para obtener el paquete con detalles especificos. SE PUEDE MODIFICAR PARA MOSTRAR SOLO LOS PAGADOS O CANCELADOS EM WHERE
  public ArrayList<PaqueteDetalle> obtenerDetallePaquetes() {
    ArrayList<PaqueteDetalle> detallesPaquetes = new ArrayList<>();
    String sql = """
        SELECT p.idPaquete,o.ciudad AS ciudadOrigen,d.ciudad AS ciudadDestino, p.fechaInicio, p.fechaFin, a.nombre AS nombreAlojamiento, a.direccion AS direccionAlojamiento,
               t.tipo as tipoTransporte, p.cantidadPasajeros,p.medioPago,p.precioTotal, p.pagado, p.cancelado    
        FROM paquete p
        LEFT JOIN estadia e ON e.idEstadia = p.idEstadia
        LEFT JOIN alojamiento a ON a.idAlojamiento = e.idAlojamiento
        LEFT JOIN pasaje pa ON pa.idPasaje = p.idPasaje
        LEFT JOIN transporte t ON t.idTransporte = pa.idTransporte
        LEFT JOIN menu m ON m.idMenu = p.idMenu
        LEFT JOIN destino o ON o.idDestino = p.origen
        LEFT JOIN destino d ON d.idDestino = p.destino;
    """;

    try (PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            PaqueteDetalle detalle = new PaqueteDetalle();
            Paquete paquete = new Paquete();
            paquete.setIdPaquete(rs.getInt("idPaquete"));
            // Asignación de datos al objeto PaqueteDetalle
            detalle.setIdPaquete(paquete); // Constructor que recibe idPaquete en Paquete
            detalle.setCantidadPasajeros(rs.getInt("cantidadPasajeros"));
            detalle.setMedioPago(rs.getString("medioPago"));
            detalle.setPrecioTotal(rs.getDouble("precioTotal"));
            detalle.setPagado(rs.getBoolean("pagado"));
            detalle.setCancelado(rs.getBoolean("cancelado"));
            detalle.setFechaInicio(rs.getDate("fechaInicio"));
            detalle.setFechaFin(rs.getDate("fechaFin"));
            detalle.setCiudadOrigen(rs.getString("ciudadOrigen"));
            detalle.setCiudadDestino(rs.getString("ciudadDestino"));
            detalle.setNombreAlojamiento(rs.getString("nombreAlojamiento"));
            detalle.setDireccionAlojamiento(rs.getString("direccionAlojamiento"));
            detalle.setTipoMenu(rs.getString("tipoMenu"));
            detalle.setTipoTransporte(rs.getString("tipoTransporte"));
            
            detallesPaquetes.add(detalle);
        }
    } catch (SQLException ex) {
        System.out.println("Error al obtener detalles de paquetes: " + ex.getMessage());
    }
    
    return detallesPaquetes;
}
  
  
    
}
