
package paquete06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraDepartamento {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Departamento registroDepartamento;
    private ArrayList<Departamento> listaDepartamento;

    public EscrituraDepartamento(String n) {
        
        nombreArchivo = n;
        establecerListaDepartamentos();

        try {

            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));

            if (obtenerListaDepartamentos().size() > 0) {
                for (int i = 0; i < obtenerListaDepartamentos().size(); i++) {
                    establecerRegistroDepartmento(obtenerListaDepartamentos().get(i));
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

    public void establecerRegistroDepartmento(Departamento c) {
        registroDepartamento = c;
    }

    public void establecerSalida() {

        try {

            salida.writeObject(registroDepartamento);

        } catch (IOException ex) {

            System.err.println("Error al escribir en el archivo.");

        }
    }

    public void establecerListaDepartamentos() {

        LecturaDepartamento l
            = new LecturaDepartamento(obtenerNombreArchivo());
        l.establecerDepartamentos();
        listaDepartamento = l.obtenerDepartamentos();

    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<Departamento> obtenerListaDepartamentos() {
        return listaDepartamento;
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
