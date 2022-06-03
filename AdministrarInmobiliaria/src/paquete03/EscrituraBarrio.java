
package paquete03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraBarrio {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Barrio registroBarrio;
    private ArrayList<Barrio> listaBarrio;

    public EscrituraBarrio(String n) {
        
        nombreArchivo = n;
        establecerListaBarrios();

        try {

            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

            if (obtenerListaBarrios().size() > 0) {
                for (int i = 0; i < obtenerListaBarrios().size(); i++) {
                    establecerRegistroBarrio(obtenerListaBarrios().get(i));
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

    public void establecerRegistroBarrio(Barrio b) {
        registroBarrio = b;
    }

    public void establecerSalida() {

        try {

            salida.writeObject(registroBarrio);

        } catch (IOException ex) {

            System.err.println("Error al escribir en el archivo.");

        }
    }

    public void establecerListaBarrios() {

        LecturaBarrio l
            = new LecturaBarrio(obtenerNombreArchivo());
        l.establecerBarrios();
        listaBarrio = l.obtenerBarrios();

    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Barrio> obtenerListaBarrios() {
        return listaBarrio;
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
