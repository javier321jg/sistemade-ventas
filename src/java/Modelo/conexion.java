
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    public static String url = "jdbc:mysql://localhost/sdsad?serverTimezone=UTC";
    public static String usuario = "root";
    public static String clave = "";
    public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName(clase);
            conexion = DriverManager.getConnection(url, usuario, clave);
            //System.out.println("Conexion Establecida");
            //JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
            
}
