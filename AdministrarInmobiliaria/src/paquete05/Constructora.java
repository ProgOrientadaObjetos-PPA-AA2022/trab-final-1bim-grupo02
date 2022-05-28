
package paquete05;

import java.io.Serializable;


public class Constructora implements Serializable {
    
    private String nombreConstructora;
    private String idEmpresa;
    
    //Constructores
    
    public Constructora(String nombreC, String idE) {
        nombreConstructora = nombreC;
        idEmpresa = idE;
    }
    
    //Establecer

    public void establecerNombreConstructora(String n) {
        nombreConstructora = n;
    }

    public void estableceridEmpresa(String n) {
        idEmpresa = n;
    }
    
    //Obtener

    public String obtenerNombreConstructora() {
        return nombreConstructora;
    }

    public String obtenerIdEmpresa() {
        return idEmpresa;
    }
}
