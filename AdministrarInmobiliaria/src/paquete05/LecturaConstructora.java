package paquete05;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaConstructora {

    private ObjectInputStream entrada;
    private ArrayList<Constructora> constructoras;
    private String nombreArchivo;
    private String identificador;
    private Constructora constBuscada;

    public LecturaConstructora(String n) {
        
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

    public void establecerConstructoras() {

        constructoras = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());

        if (f.exists()) {

            while (true) {
                try {

                    Constructora registro = (Constructora) entrada.readObject();
                    constructoras.add(registro);

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

    public void establecerConstructoraBuscada() {

        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {

            while (true) {
                try {
                    Constructora registro = (Constructora) entrada.readObject();

                    if (registro.obtenerIdEmpresa().equals(identificador)) {
                        constBuscada = registro;
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

    public ArrayList<Constructora> obtenerConstructoras() {
        return constructoras;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerIdentificador() {
        return identificador;
    }

    public Constructora obtenerConstructoraBuscada() {
        return constBuscada;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Constructoras:\n";
        for (int i = 0; i < obtenerConstructoras().size(); i++) {
            Constructora p = obtenerConstructoras().get(i);
            cadena = String.format("%s\n%d._  Nombre: %s\n id Empresa: %s\n ",
                    cadena,
                    i + 1,
                    p.obtenerNombreConstructora(),
                    p.obtenerIdEmpresa());
                    
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
