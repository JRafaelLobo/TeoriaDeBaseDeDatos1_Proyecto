package teoria_1_proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

public class DB_Manager {
//Datos

    public Connection con = null;

    public DB_Manager() {
    }

    public void crearConexion() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bienesraicesdb", "root", "laikaluz");
            System.out.println("Se conecto :D!");
        } catch (SQLException e) {
            System.err.println("No se conecto :(!");
            e.printStackTrace();
        }
    }

    public void crearTabla() {
        // Tabla de prueba para probar conexion
        if (con != null) {
            try {
                Statement statement = con.createStatement();
                String createTableSQL = "CREATE TABLE IF NOT EXISTS users ("
                        + "id INT AUTO_INCREMENT PRIMARY KEY,"
                        + "username VARCHAR(50) NOT NULL,"
                        + "email VARCHAR(100) NOT NULL,"
                        + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
                        + ")";
                statement.executeUpdate(createTableSQL);
                System.out.println("Table 'users' created successfully.");
            } catch (SQLException ex) {
                Logger.getLogger(DB_Manager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.err.println("Connection is null. Unable to create table.");
        }
    }

    public void HacerConsulta(String consulta) {
//        if (con != null) {
//            try {
//                //Statement statement = con.createStatement();
//                //PreparedStatement statement = connection.prepareStatement(sql);
//                //statement.(consulta);
//                System.out.println("La Consulta se ha hecho con exito");
//            } catch (SQLException ex) {
//                Logger.getLogger(DB_Manager.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } else {
//            System.err.println("Connection is null. Unable to make consult");
//        }
    }

}
