/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import modelo.negocio.bd.dao.EquipoDAO;
import modelo.negocio.bd.to.EquipoTO;

/**
 *
 * @author Eduin
 */
public class ControladorAplicativo {
    
    
    public int guardarEquipo(EquipoTO equipo){
        EquipoDAO dao = new EquipoDAO();
        
        return dao.crear(equipo);  
        
    }
    
    public List consultarTodo(){
        EquipoDAO dao = new EquipoDAO();
        return dao.recuperarTodo();
    }
    
    
    
}
