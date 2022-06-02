
package paquete02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraArchivoSecuencial1 {

    private String nombreArchivo = "data/propietarios.dat";
    private ObjectOutputStream salida;
    private Propietario registroPropietario;
    private ArrayList<Propietario> listaPropietario;

    public EscrituraArchivoSecuencial1(String n) {
        n = "data/propietarios.dat";
        nombreArchivo = n;
        establecerListaPropietarios();

        try {

            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

            if (obtenerListaPropietarios().size() > 0) {
                for (int i = 0; i < obtenerListaPropietarios().size(); i++) {
                    establecerRegistroPropietario(obtenerListaPropietarios().get(i));
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

    public void establecerRegistroPropietario(Propietario p) {
        registroPropietario = p;
    }

    public void establecerSalida() {

        try {

            salida.writeObject(registroPropietario);

        } catch (IOException ex) {

            System.err.println("Error al escribir en el archivo.");

        }
    }

    public void establecerListaPropietarios() {

        LecturaArchivoSecuencial1 l
            = new LecturaArchivoSecuencial1(obtenerNombreArchivo());
        l.establecerPropietarios();
        listaPropietario = l.obtenerPropietarios();

    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Propietario> obtenerListaPropietarios() {
        return listaPropietario;
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
