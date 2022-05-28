package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Casa implements Serializable {

    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private int numeroCuartos;
    private Constructora constructora;

    //Constructores
    
    public Casa(Propietario prop, double precioM2, double numM2, double costoF,
            Barrio barr, Ciudad ciu, int numCuartos, Constructora cons) {

        propietario = prop;
        precioMetroCuadrado = precioM2;
        numeroMetrosCuadrados = numM2;
        costoFinal = costoF;
        barrio = barr;
        ciudad = ciu;
        numeroCuartos = numCuartos;
        constructora = cons;
        
    }
    
    public Casa(double precioM2) {

        precioMetroCuadrado = precioM2;
               
    }
    
    //Establecer

    public void establecerPropietario(Propietario n) {
        propietario = n;
    }

    public void establecerPrecioMetroCuadrado(double n) {
        precioMetroCuadrado = n;
    }

    public void establecerNumeroMetrosCuadrados(double n) {
        numeroMetrosCuadrados = n;
    }

    public void establecerCostoFinal() {
        costoFinal = numeroMetrosCuadrados * precioMetroCuadrado;
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
    
    //Obtener

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
