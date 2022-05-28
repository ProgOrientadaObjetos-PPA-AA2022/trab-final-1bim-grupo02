
package paquete03;

import java.io.Serializable;

public class Barrio implements Serializable {
    
    private String nombreBarrio;
    private String referencia;
    
    //Constructores
    
    public Barrio(String nombreB, String ref) {
        nombreBarrio = nombreB;
        referencia = ref;
    }
    
    public Barrio(String nombreB) {
        
        nombreBarrio = nombreB;
        
    }
    
    //Establecer

    public void establecerNombreBarrio(String n) {
        nombreBarrio = n;
    }

    public void establecerReferencia(String n) {
        referencia = n;
    }
    
    //Obtener

    public String obtenerNombreBarrio() {
        return nombreBarrio;
    }

    public String obtenerReferencia() {
        return referencia;
    }
}
