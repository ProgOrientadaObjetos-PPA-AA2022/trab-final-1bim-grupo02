
package paquete06;

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento implements Serializable { 
    
    private Propietario propietario;
    private double precioMetroCuadrado;
    private double numeroMetrosCuadrados;
    private double valorAlicuotaMensual;
    private double costoFinal;
    private Barrio barrio;
    private Ciudad ciudad;
    private String nombreEdificio;
    private String ubicacionDepartamentoEdificio;
    private Constructora constructora;
    
    //Constructores
    
    public Departamento(Propietario prop, double precioM2, double numM2,
            double ValorAli, double costoF, 
            Barrio barr, Ciudad ciu, String nombreEdif, String ubiDeptoEdi,
            Constructora cons) {

        propietario = prop;
        precioMetroCuadrado = precioM2;
        numeroMetrosCuadrados = numM2;
        valorAlicuotaMensual = ValorAli;
        costoFinal = costoF;
        barrio = barr;
        ciudad = ciu;  
        nombreEdificio = nombreEdif;
        ubicacionDepartamentoEdificio = ubiDeptoEdi;
        constructora = cons;
        
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
    
    public void establecerValorAlicuotaMensual(double n) {
        valorAlicuotaMensual = n;
    }

    public void establecerCostoFinal(double n) {
        costoFinal = (numeroMetrosCuadrados * precioMetroCuadrado) 
                + (valorAlicuotaMensual * 12);
    }

    public void establecerBarrio(Barrio n) {
        barrio = n;
    }
    
    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }
    
    public void establecerNombreEdificio(String n) {
        nombreEdificio = n;
    }
    
    public void establecerUbicacionDepartamentoEdificio(String n) {
        ubicacionDepartamentoEdificio = n;
    }
    
    public void establecerConstructora(Constructora n) {
        constructora = n;
    }
    
    //Obtener
    
    public Propietario obtenerPropietrio() {
        return propietario;
    }
    
    public double obtenerPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }
    
    public double obtenerNumeroMetroCuadrado() {
        return numeroMetrosCuadrados;
    }
    
    public double obtenerValorAlicuotaMensual() {
        return valorAlicuotaMensual;
    }
    
    public double obtenerCostoFinal() {
        return costoFinal;
    }
    
    public Barrio obtenerBarrio() {
        return barrio;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }
    
    public String obtenerUbicacionDepartamentoEdificio() {
        return ubicacionDepartamentoEdificio;
    }
    
    public Constructora obtenerConstructora() {
        return constructora;
    }
}
