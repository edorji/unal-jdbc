
package vista;

import controlador.ControladorAplicativo;
import java.util.Arrays;
import java.util.List;
import modelo.conexion.BDMySQL;
import modelo.negocio.bd.to.EquipoTO;

public class Principal {
    
    public static void main(String [] args){
        
        //guardarEquipo();
        
        consultarTodosLosEquipos();
        
    }
    
    public static void guardarEquipo(){
        String nombreEquipo = "Magdalena";
        int rankingEquipo = 3;
        
        EquipoTO equipo = new EquipoTO(nombreEquipo, rankingEquipo);
        
        
        ControladorAplicativo control = new ControladorAplicativo();
        int guardados = control.guardarEquipo(equipo);
        
        System.out.println("Se almacenaron los siguientes equipos: "+guardados);
        
    }
    
    public static void consultarTodosLosEquipos(){
        ControladorAplicativo control = new ControladorAplicativo();
        List<EquipoTO> equipos = control.consultarTodo();
        for(EquipoTO equipo : equipos){
            System.out.println(equipo.getIdEqu());
            System.out.println(equipo.getNombre_equ());
            System.out.println(equipo.getRanking());
            System.out.println("---------------");
        }
        
    }
    
}
