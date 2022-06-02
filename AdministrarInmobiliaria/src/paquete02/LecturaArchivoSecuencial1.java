package paquete02;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaArchivoSecuencial1 {

    private ObjectInputStream entrada;
    private ArrayList<Propietario> propietarios;
    private String nombreArchivo = "data/propietario.dat";
    private String identificador;
    private Propietario propietarioBuscado;

    public LecturaArchivoSecuencial1(String n) {
        
        n = "data/propietario.dat";
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

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerPropietarios() {

        propietarios = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());

        if (f.exists()) {

            while (true) {
                try {

                    Propietario registro = (Propietario) entrada.readObject();
                    propietarios.add(registro);

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

    public void establecerIdentificador(String n) {
        identificador = n;
    }

    public void establecerPropietarioBuscado() {

        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Propietario registro = (Propietario) entrada.readObject();

                    if (registro.obtenerIdentificacion().equals(identificador)) {
                        propietarioBuscado = registro;
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

    public ArrayList<Propietario> obtenerPropietarios() {
        return propietarios;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerIdentificador() {
        return identificador;
    }

    public Propietario obtenerPropietarioBuscado() {
        return propietarioBuscado;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Propietarios\n";
        for (int i = 0; i < obtenerPropietarios().size(); i++) {
            Propietario p = obtenerPropietarios().get(i);
            cadena = String.format("%s%d._  Nombre: %s\n Apellidos: %s\n "
                    + "Id: %s\n", cadena,
                    i + 1,
                    p.obtenerNombres(),
                    p.obtenerApellidos(),
                    p.obtenerIdentificacion());
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
