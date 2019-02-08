
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class Conexion_BD {
    
        private static Connection conectar=null;

    public Conexion_BD() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/MediLife", "root", "");
            
            
            
            
        } catch (Exception e) {
            System.out.println("No se pudo conectar "+e);
        }
        
    }
    
    public Connection getconnection(){
        return conectar;
    }
    
}
