package paquete06;


import paquete04.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaCasa {

    private ObjectInputStream entrada;
    private ArrayList<Casa> casitas;
    private String nombreArchivo;

    public LecturaCasa(String n) {

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

    public void establecerCasas() {

        casitas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        
        if (f.exists()) {

            while (true) {
                try {

                    Casa registro = (Casa) entrada.readObject();
                    casitas.add(registro);

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

    public ArrayList<Casa> obtenerCasas() {
        return casitas;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Casas:\n\n";
        for (int i = 0; i < obtenerCasas().size(); i++) {
            Casa p = obtenerCasas().get(i);
            cadena = String.format("%s\n%d._  Nombre propietario: %s\n "
                    + "Apellido Propietario: %s\n Id propietario: %s\n"
                    + "Precio metro^2: %.2f\n Numero metros^2: %.2f\n "
                    + "Costo Final: %.2f\n Nombre barrio: %s\n Referencia: %s\n "
                    + "Nombre ciudad: %s\n Provincia: %s\n Numero de cuartos: %d\n "
                    + "Nombre constructora: %s\n Id empresa: %s\n ",
                    cadena,
                    i + 1,
                    p.obtenerPropietario().obtenerNombres(),
                    p.obtenerPropietario().obtenerApellidos(),
                    p.obtenerPropietario().obtenerIdentificacion(),
                    p.obtenerPrecioMetroCuadrado(),
                    p.obtenerNumeroMetroCuadrado(),
                    p.obtenerCostoFinal(),
                    p.obtenerBarrio().obtenerNombreBarrio(),
                    p.obtenerBarrio().obtenerReferencia(),
                    p.obtenerCiudad().obtenerNombreCiudad(),
                    p.obtenerCiudad().obtenerNombreProvincia(),
                    p.obtenerNumeroCuartos(),
                    p.obtenerConstructora().obtenerNombreConstructora(),
                    p.obtenerConstructora().obtenerIdEmpresa());  
            
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
