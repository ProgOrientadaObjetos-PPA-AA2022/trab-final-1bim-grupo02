/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Propietario {
    private String nombres;
    private String apellidos;
    private String identificacion;
    
    public Propietario(String noms, String apell, String ident) {
        nombres = noms;
        apellidos = apell;
        identificacion = ident;
    }
    
    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerApellidos(String n) {
        apellidos = n;
    }

    public void establecerIdentificacion(String n) {
        identificacion = n;
    }

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
