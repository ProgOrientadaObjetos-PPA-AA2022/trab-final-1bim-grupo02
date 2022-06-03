package paquete03;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaBarrio {

    private ObjectInputStream entrada;
    private ArrayList<Barrio> barrios;
    private String nombreArchivo;
    private String identificador;
    private Barrio barrioBuscado;

    public LecturaBarrio(String n) {

        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());

        if (f.exists()) {

            try {

                entrada = new ObjectInputStream(new FileInputStream(n));

            } catch (IOException ioException) {

                System.err.println("Error al abrir el archivo." + ioException);
            }
        }
    }
    
    public void establecerIdentificador(String n) {
        identificador = n;
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerBarrios() {

        barrios = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        
        if (f.exists()) {

            while (true) {
                try {

                    Barrio registro = (Barrio) entrada.readObject();
                    barrios.add(registro);

                } catch (EOFException endOfFileException) {
                    return;

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }
    
    public void establecerBarrioBuscado() {

        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Barrio registro = (Barrio) entrada.readObject();

                    if (registro.obtenerNombreBarrio().equals(identificador)) {
                        barrioBuscado = registro;
                        break;
                    }

                } catch (EOFException endOfFileException) {
                    return;

                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);

                }
            }
        }
    }

    public ArrayList<Barrio> obtenerBarrios() {
        return barrios;
    }
    
    public String obtenerIdentificador() {
        return identificador;
    }
    
    public Barrio obtenerBarrioBuscado() {
        return barrioBuscado;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Barrios:\n\n";
        for (int i = 0; i < obtenerBarrios().size(); i++) {
            Barrio p = obtenerBarrios().get(i);
            cadena = String.format("%s\n%d._  Nombre: %s\n Referencia: %s\n ",
                    cadena,
                    i + 1,
                    p.obtenerNombreBarrio(),
                    p.obtenerReferencia());                  
        }

        return cadena;
    }

    public void cerrarArchivo() {

        try {

            if (entrada != null) {

                entrada.close();
            }

            System.exit(0);

        } catch (IOException ioException) {

            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
