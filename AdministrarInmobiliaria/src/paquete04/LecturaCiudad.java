package paquete04;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaCiudad {

    private ObjectInputStream entrada;
    private ArrayList<Ciudad> ciudades;
    private String nombreArchivo;
    private String identificador;
    private Ciudad CiudadBuscada;

    public LecturaCiudad(String n) {

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

    public void establecerCiudades() {

        ciudades = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        
        if (f.exists()) {

            while (true) {
                try {

                    Ciudad registro = (Ciudad) entrada.readObject();
                    ciudades.add(registro);

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
    
    public void establecerCiudadBuscada() {

        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Ciudad registro = (Ciudad) entrada.readObject();

                    if (registro.obtenerNombreCiudad().equals(identificador)) {
                        CiudadBuscada = registro;
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

    public ArrayList<Ciudad> obtenerCiudades() {
        return ciudades;
    }
    
    public String obtenerIdentificador() {
        return identificador;
    }
    
    public Ciudad obtenerCiudadBuscada() {
        return CiudadBuscada;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Ciudades:\n\n";
        for (int i = 0; i < obtenerCiudades().size(); i++) {
            Ciudad p = obtenerCiudades().get(i);
            cadena = String.format("%s\n%d._  Ciudad: %s\n Provincia: %s\n ",
                    cadena,
                    i + 1,
                    p.obtenerNombreCiudad(),
                    p.obtenerNombreProvincia());                  
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
