
package paquete02;

import java.io.Serializable;

public class Propietario implements Serializable {
    
    private String nombres;
    private String apellidos;
    private String identificacion;
    
    //Constructores
    
    public Propietario(String noms, String apell, String ident) {
        nombres = noms;
        apellidos = apell;
        identificacion = ident;
    }
     
    //Establecer
    
    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String n) {
        apellidos = n;
    }

    public void establecerIdentificacion(String n) {
        identificacion = n;
    }
    
    //Obtener

    public String obtenerNombres() {
        return nombres;
    }
    
    public String obtenerApellidos() {
        return apellidos;
    }
    
    public String obtenerIdentificacion() {
        return identificacion;
    }
}
