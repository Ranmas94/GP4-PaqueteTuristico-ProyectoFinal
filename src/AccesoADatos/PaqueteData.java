
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
    String sql = "INSERT INTO paquete(idCliente, idEstadia, idPasaje, idMenu, origen, destino, fechaInicio, fechaFin, cantidadPasajeros, medioPago, pagado, cancelado, precioTotal"
               + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
         ps.setInt(1, paquete.getIdCliente().getIdCliente()); // Nuevo atributo idCliente
        ps.setInt(2, paquete.getIdEstadia().getIdEstadia());
        ps.setInt(3, paquete.getIdPasaje().getIdPasaje());
        ps.setInt(4, paquete.getIdMenu().getIdMenu());
        ps.setInt(5, paquete.getOrigen().getIdDestino());
        ps.setInt(6, paquete.getDestino().getIdDestino());
        ps.setDate(7, (Date) paquete.getFechaInicio());
        ps.setDate(8, (Date) paquete.getFechaFin());
        ps.setInt(9, paquete.getCantidadPasajeros());
        ps.setString(10, paquete.getMedioPago());
        ps.setBoolean(11, paquete.isPagado());
        ps.setBoolean(12, paquete.isCancelado());
        ps.setDouble(13, paquete.getPrecioTotal());
       

        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        while (rs.next()) {
            paquete.setIdPaquete(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Paquete guardado con éxito.");
        }
        ps.close();
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al guardar paquete.");
    }
}

// Modificar paquete
public void modificarPaquete(Paquete paquete) {
    String sql = "UPDATE paquete SET idCliente = ?, idEstadia = ?, idPasaje = ?, idMenu = ?, origen = ?, destino = ?, fechaInicio = ?, fechaFin = ?, cantidadPasajeros = ?, medioPago = ?, "
               + "pagado = ?, cancelado = ?, precioTotal = ? WHERE idPaquete = ?";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
         ps.setInt(1, paquete.getIdCliente().getIdCliente()); // Nuevo atributo idCliente
        ps.setInt(2, paquete.getIdEstadia().getIdEstadia());
        ps.setInt(3, paquete.getIdPasaje().getIdPasaje());
        ps.setInt(4, paquete.getIdMenu().getIdMenu());
        ps.setInt(5, paquete.getOrigen().getIdDestino());
        ps.setInt(6, paquete.getDestino().getIdDestino());
        ps.setDate(7, (Date) paquete.getFechaInicio());
        ps.setDate(8, (Date) paquete.getFechaFin());
        ps.setInt(9, paquete.getCantidadPasajeros());
        ps.setString(10, paquete.getMedioPago());
        ps.setBoolean(11, paquete.isPagado());
        ps.setBoolean(12, paquete.isCancelado());
        ps.setDouble(13, paquete.getPrecioTotal());
        ps.setInt(14, paquete.getIdPaquete());

        int filasAfectadas = ps.executeUpdate();

        if (filasAfectadas > 0) {
            System.out.println("Paquete actualizado correctamente.");
        } else {
            System.out.println("No se encontró Paquete con el ID especificado.");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar paquete.");
    }
}

// Mostrar todos los paquetes
public ArrayList<Paquete> mostrarPaquetes() {
    ArrayList<Paquete> paquetes = new ArrayList<>();

    String sql = "SELECT * FROM paquete";

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Paquete paquete = new Paquete();
            Estadia estadia = new Estadia();
            Pasaje pasaje = new Pasaje();
            MenuPension menu = new MenuPension();
            Destino origen = new Destino();
            Destino destino = new Destino();
            Cliente cliente = new Cliente(); // Nuevo objeto cliente

            estadia.setIdEstadia(rs.getInt("idEstadia"));
            pasaje.setIdPasaje(rs.getInt("idPasaje"));
            menu.setIdMenu(rs.getInt("idMenu"));
            origen.setIdDestino(rs.getInt("origen"));
            destino.setIdDestino(rs.getInt("destino"));
            cliente.setIdCliente(rs.getInt("idCliente")); // Set idCliente en Cliente

            paquete.setIdPaquete(rs.getInt("idPaquete"));
            paquete.setIdEstadia(estadia);
            paquete.setIdPasaje(pasaje);
            paquete.setIdMenu(menu);
            paquete.setOrigen(origen);
            paquete.setDestino(destino);
            paquete.setIdCliente(cliente); // Asignación de cliente al paquete
            paquete.setFechaInicio(rs.getDate("fechaInicio"));
            paquete.setFechaFin(rs.getDate("fechaFin"));
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
  //estadistica por temporada
  public List<DestinoEstadistica> obtenerEstadisticasPorTemporada(String temporada) {
    List<DestinoEstadistica> estadisticas = new ArrayList<>();
    String sql = "SELECT d.ciudad, d.lugar, SUM(p.cantidadPasajeros) AS totalPersonas " +
"                 FROM paquete p " +
"                 JOIN destino d ON d.idDestino = p.destino " +
"                WHERE p.cancelado = false AND p.temporada = ? " +
"                 GROUP BY d.ciudad, d.lugar " + 
"                 ORDER BY totalPersonas DESC;";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setString(1, temporada);

        
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            DestinoEstadistica estadistica = new DestinoEstadistica(
                rs.getString("ciudad"),
                rs.getString("lugar"),
                rs.getInt("totalPersonas")
            );
            estadisticas.add(estadistica);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener estadísticas por temporada y mes: " + ex.getMessage());
    }
    return estadisticas;
}
    //estadistica por mes
    public List<DestinoEstadistica> obtenerEstadisticasPorMes(int mes) {
    List<DestinoEstadistica> estadisticas = new ArrayList<>();
        String sql = "SELECT d.ciudad, d.lugar, SUM(p.cantidadPasajeros) AS totalPersonas "
                + "FROM paquete p "
                + "JOIN destino d ON d.idDestino = p.destino "
                + "WHERE p.cancelado = false "
                + " AND MONTH(p.fechaInicio) = ?"
                + "GROUP BY d.ciudad, d.lugar "
                + "ORDER BY totalPersonas DESC;";

    try (PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, mes);

        
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            DestinoEstadistica estadistica = new DestinoEstadistica(
                rs.getString("ciudad"),
                rs.getString("lugar"),
                rs.getInt("totalPersonas")
            );
            estadisticas.add(estadistica);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener estadísticas por mes: " + ex.getMessage());
    }
    return estadisticas;
}
    //paquetes comprados los ultimos dos meses
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
  
      public ArrayList<PaqueteDetalle> obtenerDetallePaquetes() {
    ArrayList<PaqueteDetalle> detallesPaquetes = new ArrayList<>();
    String sql = "SELECT p.idPaquete,o.ciudad AS ciudadOrigen,d.ciudad AS ciudadDestino, p.fechaInicio, p.fechaFin, a.nombre AS nombreAlojamiento, a.direccion AS direccionAlojamiento,"
                + "t.tipo as tipoTransporte, p.cantidadPasajeros,p.medioPago,p.precioTotal, p.pagado, p.cancelado"    
         + "FROM paquete p"
         + "LEFT JOIN estadia e ON e.idEstadia = p.idEstadia"
         + "LEFT JOIN alojamiento a ON a.idAlojamiento = e.idAlojamiento"
         + "LEFT JOIN pasaje pa ON pa.idPasaje = p.idPasaje"
         + "LEFT JOIN transporte t ON t.idTransporte = pa.idTransporte"
         + "LEFT JOIN menu m ON m.idMenu = p.idMenu"
         + "LEFT JOIN destino o ON o.idDestino = p.origen"
         + "LEFT JOIN destino d ON d.idDestino = p.destino;";

    try (PreparedStatement ps = con.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()){
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
        ps.close();
        rs.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al encontrar coincidencias." + ex.getMessage());
    }
    
    return detallesPaquetes;
    
        
    }
}
