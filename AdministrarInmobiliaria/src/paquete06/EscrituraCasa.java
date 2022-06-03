
package paquete06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraCasa {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Casa registroCasa;
    private ArrayList<Casa> listaCasa;

    public EscrituraCasa(String n) {
        
        nombreArchivo = n;
        establecerListaCasas();

        try {

            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

            if (obtenerListaCasas().size() > 0) {
                for (int i = 0; i < obtenerListaCasas().size(); i++) {
                    establecerRegistroCasa(obtenerListaCasas().get(i));
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

    public void establecerRegistroCasa(Casa c) {
        registroCasa = c;
    }

    public void establecerSalida() {

        try {

            salida.writeObject(registroCasa);

        } catch (IOException ex) {

            System.err.println("Error al escribir en el archivo.");

        }
    }

    public void establecerListaCasas() {

        LecturaCasa l
            = new LecturaCasa(obtenerNombreArchivo());
        l.establecerCasas();
        listaCasa = l.obtenerCasas();

    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Casa> obtenerListaCasas() {
        return listaCasa;
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
