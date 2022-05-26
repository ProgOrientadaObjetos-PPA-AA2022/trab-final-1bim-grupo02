/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa {
    
    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numeroCuartos;
    private Constructora constructora;
    

    public void establecerPropietario(Propietario n) {
        propietario = n;
    }

    public void establecerPrecioMetroCuadrado(double n) {
        precioMetroCuadrado = n;
    }

    public void establecerNumeroMetrosCuadrados(double n) {
        numeroMetrosCuadrados = n;
    }
    
    public void establecerCostoFinal(double n) {
        costoFinal = n;
    }

    public void establecerBarrio(Barrio n) {
        barrio = n;
    }
    
    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }
    
    public void establecerNumeroCuartos(int n) {
        numeroCuartos = n;
    }
    
    public void establecerConstructora(Constructora n) {
        constructora = n;
    }
    
    
    
    public Propietario obtenerPropietario() {
        return propietario;
    }
    
    public double obtenerPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }
    
    public double obtenerNumeroMetroCuadrado() {
        return numeroMetrosCuadrados;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public Barrio obtenerBarrio() {
        return barrio;
    }
    
    public Ciudad obtenerConjuntoMedicos() {
        return ciudad;
    }
    
    public double obtenerNumeroCuartos() {
        return numeroCuartos;
    }
    
    public Constructora obtenerConstructora() {
        return constructora;
    }
}
