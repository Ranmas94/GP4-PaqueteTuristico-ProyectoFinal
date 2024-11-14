/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

/**
 *
 * @author Ranma
 */

import Entidades.Destino;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DestinoData {
    private Connection con = null;

    public DestinoData() {
        con = Conexion.getConexion();
    }

    // Guardar Destino
    public void guardarDestino(Destino destino) {
        String sql = "INSERT INTO destino(ciudad, lugar) VALUES (?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, destino.getCiudad());
            ps.setString(2, destino.getLugar());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            while (rs.next()) {
                destino.setIdDestino(rs.getInt(1));
                
            }

            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar guardar destino. " + ex);
        }
    }

    // Actualizar Destino
    public void actualizarDestino(Destino destino) {
        String sql = "UPDATE destino SET ciudad = ?, lugar = ? WHERE idDestino = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, destino.getCiudad());
            ps.setString(2, destino.getLugar());
            ps.setInt(3, destino.getIdDestino());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Destino modificado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar modificar destino. " + ex);
        }
    }

    // Borrar Destino
    public void borrarDestino(int idDestino) {
        String sql = "DELETE FROM destino WHERE idDestino = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDestino);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Destino eliminado");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar eliminar destino. " + ex);
        }
    }

    // Listar Destinos
    public List<Destino> listarDestinos() {
        String sql = "SELECT idDestino, ciudad, lugar FROM destino";
        ArrayList<Destino> destinos = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Destino dest = new Destino();
                dest.setIdDestino(rs.getInt("idDestino"));
                dest.setCiudad(rs.getString("ciudad"));
                dest.setLugar(rs.getString("lugar"));
                destinos.add(dest);
            }

            ps.close();
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Destino: " + ex);
        }
        return destinos;
    }
    
    public Destino buscarDestino(int id){
        String sql = "SELECT * FROM destino WHERE idDestino = ?";
        Destino destino = null;
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                 destino = new Destino();
                destino.setIdDestino(id);
                destino.setCiudad(rs.getString("ciudad"));
                destino.setLugar(rs.getString("lugar"));
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Destino: " + ex);
        }
        return destino;
    }
    
}
