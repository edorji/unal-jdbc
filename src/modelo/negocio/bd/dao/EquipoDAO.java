
package modelo.negocio.bd.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.conexion.BDMySQL;
import modelo.negocio.bd.to.EquipoTO;

public class EquipoDAO {
    
    public int crear(EquipoTO equipo){
        
        String sql = "insert into equipo (nombre_equ, ranking) values (?, ?)";
        int insertados = 0;
        try{
            
            Connection conn = BDMySQL.establecerConexion();
            
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, equipo.getNombre_equ());
            st.setInt(2, equipo.getRanking());
            
            insertados = st.executeUpdate();
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            return insertados;
        }
        
        
        
        
    }
    
    public void recuperarUno(){
    
    }
    
    public List recuperarTodo(){
    
        String sql = "Select * from equipo";
        List resultado = new ArrayList();
        try{
            Connection conn = BDMySQL.establecerConexion();
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery (sql);
            
            while(result.next()){
                EquipoTO equipo = new EquipoTO(result.getInt(1), result.getString(2), result.getInt(3));
                resultado.add(equipo);
            }
            
        }catch(Exception e){
            System.out.println("error: "+e.getMessage());
        }finally{
            return resultado;
        }
        
    }
    
    public void update(){
    
    }
    
    public void delete(){
    
    }
}
