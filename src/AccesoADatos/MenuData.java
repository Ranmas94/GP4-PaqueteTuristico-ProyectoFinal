 
package AccesoADatos;

import Entidades.Menu;
import Entidades.Menu.tipoMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class MenuData {
    private Connection con=null;

    public MenuData() {
        con = Conexion.getConexion();
    }
/*
    // Método para guardar un menú
    public void guardarMenu(Menu menu) {
        String sql = "INSERT INTO menu (tipo, porcentaje) VALUES (?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, menu.getTipo().getDescripcion());
            ps.setDouble(2, menu.getPorcentaje());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                menu.setIdMenu(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Menu guardado");
            }
            
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar el menú: " + ex.getMessage());
        }
    }

    // Método para buscar un menú por id
    public Menu buscarMenuPorId(int id) {
        String sql = "SELECT * FROM menu WHERE idMenu = ?";
        Menu menu = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                menu = new Menu();
                menu.setIdMenu(rs.getInt("idMenu"));
                menu.setTipo(tipoMenu.fromString(rs.getString("tipo")));
                menu.setPorcentaje(rs.getDouble("porcentaje"));
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar el menú: " + ex.getMessage());
        }
        return menu;
    }

    // Método para listar todos los menús
    public List<Menu> listarMenus() {
        String sql = "SELECT * FROM menu";
        List<Menu> menus = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt("idMenu"));
                menu.setTipo(TipoMenu.fromString(rs.getString("tipo")));
                menu.setPorcentaje(rs.getDouble("porcentaje"));
                
                menus.add(menu);
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar menús: " + ex.getMessage());
        }
        return menus;
    }

    // Método para modificar un menú
    public void modificarMenu(Menu menu) {
        String sql = "UPDATE menu SET tipo = ?, porcentaje = ? WHERE idMenu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, menu.getTipo().getDescripcion());
            ps.setDouble(2, menu.getPorcentaje());
            ps.setInt(3, menu.getIdMenu());
            
            int rowsUpdated = ps.executeUpdate();
            
             if (rowsUpdated == 0) {
                JOptionPane.showMessageDialog(null, "Menú modificado correctamente");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el menú: " + ex.getMessage());
        }
    }

    // Método para eliminar un menú por id
    public void eliminarMenu(int id) {
        String sql = "DELETE FROM menu WHERE idMenu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            int rowsDeleted = ps.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Menú eliminado correctamente");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el menú: " + ex.getMessage());
        }
    }*/
    
    public List<String> obtenerOpcionesEnumTipo() {
        List<String> opcionesEnum = new ArrayList<>();
        String sql = "SHOW COLUMNS FROM Menu LIKE 'tipo'";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Extraer los valores del ENUM desde el resultado de la consulta
                String enumValues = rs.getString("Type");
                enumValues = enumValues.substring(enumValues.indexOf("(") + 1, enumValues.indexOf(")"));
                
                // Dividir los valores por coma y limpiar las comillas simples
                for (String value : enumValues.split(",")) {
                    opcionesEnum.add(value.replace("'", ""));
                }
            }

            rs.close();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al obtener opciones del ENUM tipo: " + ex.getMessage());
        }

        return opcionesEnum;
    }
}
    
