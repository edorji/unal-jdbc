
package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class BDMySQL {
    
    private static String user = "root";
    private static String password = "root.";
    private static String url = "jdbc:mysql://localhost:3306/equipo";
    
    private static Connection conn;
    
    public static Connection establecerConexion(){
        try{
            conn = DriverManager.getConnection (url , user , password );
            if(conn != null){
                System.out.println("...CONEXION EXITOSA...");
            }
        }catch(Exception e){
            System.out.println("NO SE PUDO ESTABLECER LA CONEXION" + e.getMessage());
        }finally {
            return conn;
        } 
    }
    
    
}
