package paquete06;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class LecturaDepartamento {

    private ObjectInputStream entrada;
    private ArrayList<Departamento> depars;
    private String nombreArchivo;

    public LecturaDepartamento(String n) {

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

    public void establecerDepartamentos() {

        depars = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        
        if (f.exists()) {

            while (true) {
                try {

                    Departamento registro = (Departamento) entrada.readObject();
                    depars.add(registro);

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

    public ArrayList<Departamento> obtenerDepartamentos() {
        return depars;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        String cadena = "Lista de Departamentos:\n\n";
        for (int i = 0; i < obtenerDepartamentos().size(); i++) {
            Departamento p = obtenerDepartamentos().get(i);
            cadena = String.format("%s\n%d._  Nombre propietario: %s\n "
                    + "Apellido Propietario: %s\n Id propietario: %s\n"
                    + "Precio metro^2: %.2f\n Numero metros^2: %.2f\n "
                    + "Costo alicuota mensual: %.2f\n "
                    + "Costo Final: %.2f\n Nombre barrio: %s\n Referencia: %s\n "
                    + "Nombre ciudad: %s\n Provincia: %s\n Nombre del edificio: %s\n "
                    + "Ubicacion departamento/edificio: %s\n "
                    + "Nombre constructora: %s\n Id empresa: %s\n ",
                    cadena,
                    i + 1,
                    p.obtenerPropietario().obtenerNombres(),
                    p.obtenerPropietario().obtenerApellidos(),
                    p.obtenerPropietario().obtenerIdentificacion(),
                    p.obtenerPrecioMetroCuadrado(),
                    p.obtenerNumeroMetroCuadrado(),
                    p.obtenerValorAlicuotaMensual(),
                    p.obtenerCostoFinal(),
                    p.obtenerBarrio().obtenerNombreBarrio(),
                    p.obtenerBarrio().obtenerReferencia(),
                    p.obtenerCiudad().obtenerNombreCiudad(),
                    p.obtenerCiudad().obtenerNombreProvincia(),
                    p.obtenerNombreEdificio(),
                    p.obtenerUbicacionDepartamentoEdificio(),
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
