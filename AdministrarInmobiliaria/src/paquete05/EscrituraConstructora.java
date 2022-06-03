
package paquete05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraConstructora {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Constructora registroConstructora;
    private ArrayList<Constructora> listaConstructora;

    public EscrituraConstructora(String n) {

        nombreArchivo = n;
        establecerListaConstructoras();

        try {

            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

            if (obtenerListaConstructoras().size() > 0) {
                for (int i = 0; i < obtenerListaConstructoras().size(); i++) {
                    establecerRegistroConstructora(obtenerListaConstructoras().get(i));
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

    public void establecerRegistroConstructora(Constructora p) {
        registroConstructora = p;
    }

    public void establecerSalida() {

        try {

            salida.writeObject(registroConstructora);

        } catch (IOException ex) {

            System.err.println("Error al escribir en el archivo.");

        }
    }

    public void establecerListaConstructoras() {

        LecturaConstructora l
            = new LecturaConstructora(obtenerNombreArchivo());
        l.establecerConstructoras();
        listaConstructora = l.obtenerConstructoras();

    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Constructora> obtenerListaConstructoras() {
        return listaConstructora;
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
