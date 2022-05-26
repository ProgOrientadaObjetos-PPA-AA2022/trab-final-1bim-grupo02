/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class Barrio {
    private String nombreBarrio;
    private String referencia;
    
    public Barrio(String nombreB, String ref) {
        nombreBarrio = nombreB;
        referencia = ref;
    }

    public void establecerNombreBarrio(String n) {
        nombreBarrio = n;
    }

    public void establecerReferencia(String n) {
        referencia = n;
    }

    public String obtenerNombreBarrio() {
        return nombreBarrio;
    }

    public String obtenerReferencia() {
        return referencia;
    }
}
