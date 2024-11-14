/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;


import Entidades.Cliente;
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
public class PaqueteData {
     private Connection con=null;

    public PaqueteData() {
        con = Conexion.getConexion();
    }
    
   // Guardar un paquete
public void guardarPaquete(Paquete paquete) {
    
    String sql = "INSERT INTO paquete(idEstadia, idPasaje, idMenu, origen, destino, fechaInicio, fechaFin, temporada, cantidadPasajeros, medioPago, pagado, cancelado, precioTotal)"
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        ps.setInt(1, paquete.getIdEstadia().getIdEstadia());
        ps.setInt(2, paquete.getIdPasaje().getIdPasaje());
        ps.setInt(3, paquete.getIdMenu().getIdMenu());
        ps.setInt(4, paquete.getOrigen().getIdDestino());
        ps.setInt(5, paquete.getDestino().getIdDestino());
        ps.setDate(6, new java.sql.Date(paquete.getFechaInicio().getTime()));
        ps.setDate(7, new java.sql.Date(paquete.getFechaFin().getTime()));
        ps.setString(8, paquete.getTemporada());
        ps.setInt(9, paquete.getCantidadPasajeros());
        ps.setString(10, paquete.getMedioPago());
        ps.setBoolean(11, paquete.isPagado());
        ps.setBoolean(12, paquete.isCancelado());
        ps.setDouble(13, paquete.getPrecioTotal());

        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            paquete.setIdPaquete(rs.getInt(1));
           
        }
        ps.close();
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar paquete: " + ex.getMessage());
    }
}

// Modificar paquete
public void modificarPaquete(Paquete paquete) {
    String sql = "UPDATE paquete SET idEstadia = ?, idPasaje = ?, idMenu = ?, origen = ?, destino = ?, fechaInicio = ?, fechaFin = ?, temporada = ?, cantidadPasajeros = ?, medioPago = ?, "
               + "pagado = ?, cancelado = ?, precioTotal = ? WHERE idPaquete = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, paquete.getIdEstadia().getIdEstadia());
        ps.setInt(2, paquete.getIdPasaje().getIdPasaje());
        ps.setInt(3, paquete.getIdMenu().getIdMenu());
        ps.setInt(4, paquete.getOrigen().getIdDestino());
        ps.setInt(5, paquete.getDestino().getIdDestino());
        ps.setDate(6, new java.sql.Date(paquete.getFechaInicio().getTime()));
        ps.setDate(7, new java.sql.Date(paquete.getFechaFin().getTime()));
        ps.setString(8, paquete.getTemporada());
        ps.setInt(9, paquete.getCantidadPasajeros());
        ps.setString(10, paquete.getMedioPago());
        ps.setBoolean(11, paquete.isPagado());
        ps.setBoolean(12, paquete.isCancelado());
        ps.setDouble(13, paquete.getPrecioTotal());
        ps.setInt(14, paquete.getIdPaquete());

        int filasAfectadas = ps.executeUpdate();
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(null, "Paquete actualizado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró paquete con el ID especificado.");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar paquete: " + ex.getMessage());
    }
}

// Mostrar todos los paquetes
public ArrayList<Paquete> mostrarPaquetes() {
    ArrayList<Paquete> paquetes = new ArrayList<>();
    String sql = "SELECT * FROM paquete";

    try (PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
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
            paquete.setCantidadPasajeros(rs.getInt("cantidadPasajeros"));
            paquete.setMedioPago(rs.getString("medioPago"));
            paquete.setPagado(rs.getBoolean("pagado"));
            paquete.setCancelado(rs.getBoolean("cancelado"));
            paquete.setPrecioTotal(rs.getDouble("precioTotal"));
            
            // Recuperar y asignar 'temporada'
            paquete.setTemporada(rs.getString("temporada"));

            paquetes.add(paquete);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al mostrar paquetes: " + ex.getMessage());
    }
    return paquetes;
}


public Paquete BuscarPaquete(int id) {
    Paquete paquete = new Paquete();
    String sql = "SELECT * FROM paquete WHERE idPaquete = ?";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, id);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
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
                paquete.setCantidadPasajeros(rs.getInt("cantidadPasajeros"));
                paquete.setMedioPago(rs.getString("medioPago"));
                paquete.setPagado(rs.getBoolean("pagado"));
                paquete.setCancelado(rs.getBoolean("cancelado"));
                paquete.setPrecioTotal(rs.getDouble("precioTotal"));
                
                // Recuperar y asignar 'temporada'
                paquete.setTemporada(rs.getString("temporada"));
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar paquete: " + ex.getMessage());
    }
    return paquete;
}
//estadisticas por temporada

  public List<DestinoEstadistica> obtenerEstadisticasPorTemporada(String temporada) {
    List<DestinoEstadistica> estadisticas = new ArrayList<>();
    String sql = """
                 SELECT d.ciudad, d.lugar, SUM(p.cantidadPasajeros) AS totalPersonas 
                 FROM paquete p 
                 JOIN destino d ON d.idDestino = p.destino 
                 WHERE p.cancelado = false AND p.temporada = ? 
                 GROUP BY d.ciudad, d.lugar 
                 ORDER BY totalPersonas DESC;
                 """;

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, temporada);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            estadisticas.add(new DestinoEstadistica(
                rs.getString("ciudad"),
                rs.getString("lugar"),
                rs.getInt("totalPersonas")
            ));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en estadísticas por temporada: " + ex.getMessage());
    }
    return estadisticas;
}
  
  //estadistica por mes
   public List<DestinoEstadistica> obtenerEstadisticasPorMes(int mes) {
    List<DestinoEstadistica> estadisticas = new ArrayList<>();
    String sql = """
                 SELECT d.ciudad, d.lugar, SUM(p.cantidadPasajeros) AS totalPersonas 
                 FROM paquete p 
                 JOIN destino d ON d.idDestino = p.destino 
                 WHERE p.cancelado = false AND MONTH(p.fechaInicio) = ? 
                 GROUP BY d.ciudad, d.lugar 
                 ORDER BY totalPersonas DESC;
                 """;

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, mes);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            estadisticas.add(new DestinoEstadistica(
                rs.getString("ciudad"),
                rs.getString("lugar"),
                rs.getInt("totalPersonas")
            ));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error en estadísticas por mes: " + ex.getMessage());
    }
    return estadisticas;
}
    
    
   public ArrayList<Paquete> resumenPaquetesComprados() {
    ArrayList<Paquete> resumen = new ArrayList<>();
    LocalDate fecha = LocalDate.now().minusMonths(2); // le restamos dos meses a la fecha actual
    

    String sql = """
        SELECT p.*, 
               o.ciudad AS origenCiudad, 
               d.ciudad AS destinoCiudad
        FROM paquete p
        JOIN destino o ON p.origen = o.idDestino
        JOIN destino d ON p.destino = d.idDestino
        WHERE p.fechaFin > ? AND p.cancelado = false AND p.fechaFin < NOW() AND p.pagado = true
    """;
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, Date.valueOf(fecha));
        
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Paquete paquete = new Paquete();
            
            Estadia estadia = new Estadia();
            Pasaje pasaje = new Pasaje();
            MenuPension menu = new MenuPension();
            Destino origen = new Destino();
            Destino destino = new Destino();
            
            estadia.setIdEstadia(rs.getInt("idEstadia"));
            pasaje.setIdPasaje(rs.getInt("idPasaje"));
            menu.setIdMenu(rs.getInt("idMenu"));
            
            // Asignar IDs y ciudades a origen y destino
            origen.setIdDestino(rs.getInt("origen"));
            origen.setCiudad(rs.getString("origenCiudad"));
            
            destino.setIdDestino(rs.getInt("destino"));
            destino.setCiudad(rs.getString("destinoCiudad"));
            
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
  
   
  public ArrayList<PaqueteDetalle> obtenerDetallePaquetes(int id) {
    ArrayList<PaqueteDetalle> detallesPaquetes = new ArrayList<>();
    String sql = "SELECT p.idPaquete, o.ciudad AS ciudadOrigen, d.ciudad AS ciudadDestino, " +
                 "p.fechaInicio, p.fechaFin, a.nombre AS nombreAlojamiento, a.direccion AS direccionAlojamiento, " +
                 "t.tipo AS tipoTransporte, p.cantidadPasajeros, p.medioPago, p.precioTotal, p.pagado, p.cancelado, " +
                 "m.tipo AS tipoMenu " +
                 "FROM paquete p " +
                 "LEFT JOIN estadia e ON e.idEstadia = p.idEstadia " +
                 "LEFT JOIN alojamiento a ON a.idAlojamiento = e.idAlojamiento " +
                 "LEFT JOIN pasaje pa ON pa.idPasaje = p.idPasaje " +
                 "LEFT JOIN transporte t ON t.idTransporte = pa.idTransporte " +
                 "LEFT JOIN menu m ON m.idMenu = p.idMenu " +
                 "LEFT JOIN destino o ON o.idDestino = p.origen " +
                 "LEFT JOIN destino d ON d.idDestino = p.destino " +
                 "WHERE p.idPaquete = ? AND p.cancelado = false;";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, id); // Asignación del parámetro id

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                PaqueteDetalle detalle = new PaqueteDetalle();
                Paquete paquete = new Paquete();

                // Asignación de datos al objeto Paquete
                paquete.setIdPaquete(rs.getInt("idPaquete"));
                detalle.setIdPaquete(paquete);

                // Asignación de datos al objeto PaqueteDetalle
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
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al encontrar coincidencias: " + ex.getMessage());
    }

    return detallesPaquetes;
}
  
  //cancelar un paquete por id
  public void cancelarPaquete(int idPaquete) {
    String sql = "UPDATE paquete SET cancelado = true WHERE idPaquete = ?";
    

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, idPaquete);
        int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
           
            JOptionPane.showMessageDialog(null,"El paquete con ID " + idPaquete + " ha sido cancelado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null,"No se encontró ningún paquete con el ID especificado.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"Error al cancelar el paquete: " + ex.getMessage());
    }

  
}
}
