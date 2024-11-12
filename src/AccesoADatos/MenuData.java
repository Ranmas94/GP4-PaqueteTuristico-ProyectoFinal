 
package AccesoADatos;

import Entidades.MenuPension;
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
    // Método para guardar un menú
    public void guardarMenu(MenuPension menu) {
        String sql = "INSERT INTO menu (tipo, porcentaje) VALUES (?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, menu.getTipo());
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
    public MenuPension buscarMenuPorId(int id) {
        String sql = "SELECT * FROM menu WHERE idMenu = ?";
        MenuPension menu = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                menu = new MenuPension();
                menu.setIdMenu(rs.getInt("idMenu"));
                menu.setTipo((rs.getString("tipo")));
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
    public List<MenuPension> listarMenus() {
        String sql = "SELECT * FROM menu";
        List<MenuPension> menus = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                MenuPension menu = new MenuPension();
                menu.setIdMenu(rs.getInt("idMenu"));
                menu.setTipo((rs.getString("tipo")));
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

   public void modificarMenu(MenuPension menu) {
        String sql = "UPDATE menu SET tipo = ?, porcentaje = ? WHERE idMenu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, menu.getTipo());
            ps.setDouble(2, menu.getPorcentaje());
            ps.setInt(3, menu.getIdMenu());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Menú modificado con éxito");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar menú: " + ex.getMessage());
        }
    }

     // Método para eliminar un menú
    public void eliminarMenu(int idMenu) {
        String sql = "DELETE FROM menu WHERE idMenu = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMenu);
            
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Menú eliminado con éxito");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar menú: " + ex.getMessage());
        }
    }

    public MenuPension buscarMenuPorTipo(String tipo) {
    String sql = "SELECT * FROM menu WHERE tipo = ?";
    MenuPension menu = null;

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, tipo);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            menu = new MenuPension();
            menu.setIdMenu(rs.getInt("idMenu"));
            menu.setTipo(rs.getString("tipo"));
            menu.setPorcentaje(rs.getDouble("porcentaje"));
        }

        rs.close();
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al buscar el menú por tipo: " + ex.getMessage());
    }
    return menu;
}
    
    public void modificarMenuPorcentaje(double porcentaje, int id) {
        String sql = "UPDATE menu SET porcentaje = ? WHERE idMenu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, porcentaje);
            ps.setInt(2, id);
          

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Menú modificado con éxito");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar menú: " + ex.getMessage());
        }
    }
    
   
    // Método para obtener solo los tipos de menú
public List<String> obtenerTiposMenu() {
    String sql = "SELECT tipo FROM menu";
    List<String> tiposMenu = new ArrayList<>();

    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            tiposMenu.add(rs.getString("tipo"));
        }

        rs.close();
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al obtener tipos de menú: " + ex.getMessage());
    }
    return tiposMenu;
}
}
    
