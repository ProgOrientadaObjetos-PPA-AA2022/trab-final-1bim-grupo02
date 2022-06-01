
package paquete04;

import java.io.Serializable;

public class Ciudad implements Serializable {
    
    private String nombreCiudad;
    private String nombreProvincia;
    
    //Constructores
    
    public Ciudad(String nombreC, String provinciaC) {
        nombreCiudad = nombreC;
        nombreProvincia = provinciaC;
    }
       
    //Establecer
    
    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }

    public void establecerNombreProvincia(String n) {
        nombreProvincia = n;
    }
    
    //Obtener

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public String obtenerNombreProvincia() {
        return nombreProvincia;
    }
}
