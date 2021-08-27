
package modelo.negocio.bd.to;

import java.io.Serializable;

public class EquipoTO implements Serializable{
    
    private int idEqu;
    private String nombre_equ;
    private int ranking;

    public EquipoTO() {
    }

    public EquipoTO(String nombre_equ, int ranking) {
        this.nombre_equ = nombre_equ;
        this.ranking = ranking;
    }

    public EquipoTO(int idEqu, String nombre_equ, int ranking) {
        this.idEqu = idEqu;
        this.nombre_equ = nombre_equ;
        this.ranking = ranking;
    }
    
    

    public int getIdEqu() {
        return idEqu;
    }

    public void setIdEqu(int idEqu) {
        this.idEqu = idEqu;
    }

    public String getNombre_equ() {
        return nombre_equ;
    }

    public void setNombre_equ(String nombre_equ) {
        this.nombre_equ = nombre_equ;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
    
    
    
}
