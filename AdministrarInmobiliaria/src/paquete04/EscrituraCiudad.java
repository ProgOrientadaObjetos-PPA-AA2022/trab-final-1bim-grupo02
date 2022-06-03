
package paquete04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraCiudad {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Ciudad registroCiudad;
    private ArrayList<Ciudad> listaCiudad;

    public EscrituraCiudad(String n) {
        
        nombreArchivo = n;
        establecerListaCiudades();

        try {

            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

            if (obtenerListaCiudades().size() > 0) {
                for (int i = 0; i < obtenerListaCiudades().size(); i++) {
                    establecerRegistroCiudad(obtenerListaCiudades().get(i));
                    establecerSalida();
                }
            }
            
        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRegistroCiudad(Ciudad c) {
        registroCiudad = c;
    }

    public void establecerSalida() {

        try {

            salida.writeObject(registroCiudad);

        } catch (IOException ex) {

            System.err.println("Error al escribir en el archivo.");

        }
    }

    public void establecerListaCiudades() {

        LecturaCiudad l
            = new LecturaCiudad(obtenerNombreArchivo());
        l.establecerCiudades();
        listaCiudad = l.obtenerCiudades();

    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Ciudad> obtenerListaCiudades() {
        return listaCiudad;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {

        try {
            
            if (salida != null) {
                salida.close();
            }
        } 
        catch (IOException ioException) {
            
            System.err.println("Error al cerrar el archivo.");

        } 
    }

}
