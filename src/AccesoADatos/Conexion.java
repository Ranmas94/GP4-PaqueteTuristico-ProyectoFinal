
package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefani Nair Escobar
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="turismogp4";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;

    public Conexion() {
    }

   public static Connection getConexion() {
    if (connection == null) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection(URL+DB, USUARIO,PASSWORD);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la BD " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex.getMessage());
        }
    }
    return connection;
}
    public static void main(String[] args) {
        
        Connection con = getConexion();
        if (con != null) {
            System.out.println("Conexión exitosa!");
        } else {
            System.out.println("Fallo en la conexión.");
        }
    }
  
}
