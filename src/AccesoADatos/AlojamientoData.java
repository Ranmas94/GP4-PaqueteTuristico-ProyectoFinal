/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Alojamiento;
import Entidades.Destino;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lourdes
 */
public class AlojamientoData {
    private Connection con = null;
    
    public AlojamientoData(){
       con = Conexion.getConexion();
    }
    
    
    //Guardar alojamiento
    public void guardarAlojamiento(Alojamiento alojamiento){
        String sql = "INSERT INTO alojamiento(idDestino,nombre,direccion,capacidad,nroAmbiente,cama,banios,precioPorNoche) "
                + "VALUES (?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alojamiento.getIdDestino().getIdDestino());
            ps.setString(2, alojamiento.getNombre());
            ps.setString(3, alojamiento.getDireccion());
            ps.setInt(4, alojamiento.getCapacidad());
            ps.setInt(5, alojamiento.getNroAmbientes());
            ps.setInt(6,alojamiento.getCamas());
            ps.setInt(7, alojamiento.getBanios());
            ps.setDouble(9, alojamiento.getPrecioPorNoche());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while(rs.next()){
                alojamiento.setIdAlojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento guardado con éxito.");
            }
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al guardar alojamiento. "+ ex);
        }
    }
    
    //modificar cliente
    public void modificarAlojamiento(Alojamiento alojamiento){
        String sql = "UPDATE alojamiento SET idDestino = ?, nombre = ?, direccion = ?, capacidad = ?, nroAmbiente = ?, camas = ?, banio = ?, precioPorNoche = ?"
                + "WHERE = idAlojamiento = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
   
            ps.setInt(1, alojamiento.getIdDestino().getIdDestino()); 
            ps.setString(2, alojamiento.getNombre());
            ps.setString(3, alojamiento.getDireccion());
            ps.setInt(4, alojamiento.getCapacidad());
            ps.setInt(5, alojamiento.getNroAmbientes());
            ps.setInt(6, alojamiento.getCamas());
            ps.setInt(7, alojamiento.getBanios());
            ps.setDouble(8, alojamiento.getPrecioPorNoche());
            
            ps.setInt(9, alojamiento.getIdAlojamiento());

        // Ejecutar la actualización
        int filasAfectadas = ps.executeUpdate();
        
        if (filasAfectadas > 0) {
            System.out.println("Alojamiento actualizado correctamente.");
        } else {
            System.out.println("No se encontró un alojamiento con el ID especificado.");
        }
        
        // Cerrar el PreparedStatement
        ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al modificar alojamiento. "+ ex.getMessage());
        }
    }
    
    public List<Alojamiento> buscarAlojamientoCapacidad(int capacidad, int idDestino){
        List<Alojamiento> alojamientos = new ArrayList<>();
        
        String sql = "SELECT nombre,direccion, nroAmbientes ,cama, banios, precioPorNoche"
                + "FROM alojamiento"
                + "WHERE alojamiento.idDestino = ? AND alojamiento.capacidad >= ? ";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idDestino);
            ps.setInt(2, capacidad);

            // Ejecutar la consulta
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 Alojamiento alojamiento = new Alojamiento();
            alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
           
            Destino destino = new Destino();
            destino.setIdDestino(rs.getInt("idDestino"));
            alojamiento.setIdDestino(destino); 
            
            alojamiento.setNombre(rs.getString("nombre"));
            alojamiento.setDireccion(rs.getString("direccion"));
            alojamiento.setCapacidad(rs.getInt("capacidad"));
            alojamiento.setNroAmbientes(rs.getInt("nroAmbientes"));
            alojamiento.setCamas(rs.getInt("camas"));
            alojamiento.setBanios(rs.getInt("banios"));
            alojamiento.setPrecioPorNoche(rs.getDouble("precioPorNoche"));
            
            // Agregar el objeto Alojamiento a la lista
            alojamientos.add(alojamiento);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error buscar alojamiento por capacidad. "+ ex.getMessage());
        }

       
       return alojamientos;
    }
    
    
}
