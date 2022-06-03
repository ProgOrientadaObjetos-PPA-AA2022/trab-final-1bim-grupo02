package paquete01;

import java.util.Scanner;
import paquete02.EscrituraPropietario;
import paquete02.LecturaPropietario;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete03.EscrituraBarrio;
import paquete03.LecturaBarrio;
import paquete04.Ciudad;
import paquete04.EscrituraCiudad;
import paquete04.LecturaCiudad;
import paquete05.Constructora;
import paquete05.EscrituraConstructora;
import paquete05.LecturaConstructora;
import paquete06.Casa;
import paquete06.Departamento;
import paquete06.EscrituraCasa;
import paquete06.EscrituraDepartamento;
import paquete06.LecturaCasa;
import paquete06.LecturaDepartamento;

public class Ejecutor {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Ejecutor obj = new Ejecutor();
        
        //File propietarios
        
        String nombreArchivoPropietario = "data/propietarios.dat";   
        EscrituraPropietario archivoPropietario = 
            new EscrituraPropietario(nombreArchivoPropietario);
        
        //File barrio
        
        String nombreArchivoBarrio = "data/barrios.dat";   
        EscrituraBarrio archivoBarrio = 
            new EscrituraBarrio(nombreArchivoBarrio);
        
        //File ciudad
        
        String nombreArchivoCiudad = "data/ciudades.dat";   
        EscrituraCiudad archivoCiudad = 
            new EscrituraCiudad(nombreArchivoCiudad);
        
        //File Constructora
        
        String nombreArchivoConstructora = "data/constructoras.dat";   
        EscrituraConstructora archivoConstructora = 
            new EscrituraConstructora(nombreArchivoConstructora);
        
        //File Casa
        
        String nombreArchivoCasa = "data/casas.dat";   
        EscrituraCasa archivoCasa = 
            new EscrituraCasa(nombreArchivoCasa);
        
        //File Departamento
        
        String nombreArchivoDepartamento = "data/departamentos.dat";   
        EscrituraDepartamento archivoDepartamento = 
            new EscrituraDepartamento(nombreArchivoDepartamento);
                  
        int op, op2;

        do {

            

            op = obj.menu();

            switch (op) {

                case 1:

                    do {                       
                        
                        sc.nextLine();
                                                 
                        String nombrePropietario;
                        String apellidoPropietario;
                        String idPropietario;

                        System.out.println("Ingrese el nombre del Propietario: ");
                        nombrePropietario = sc.nextLine();

                        System.out.println("Ingrese el apellido del Propietario: ");
                        apellidoPropietario = sc.nextLine();

                        System.out.println("Ingrese el id del Propietario: ");
                        idPropietario = sc.nextLine();

                        Propietario p = new Propietario(nombrePropietario,
                                apellidoPropietario, idPropietario);                        

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Propietario "
                                + "escriba (1)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;                      
                        
                        archivoPropietario.establecerRegistroPropietario(p);
                        archivoPropietario.establecerSalida();
                        
                        if (op == 0) {
                            archivoPropietario.cerrarArchivo();
                        }
                        
                    } while (op == 1);                                      

                    break;

                case 2:

                    do {

                        sc.nextLine();

                        String nombreBarrio;
                        String referenciaBarrio;

                        System.out.println("Ingrese el nombre del Barrio : ");
                        nombreBarrio = sc.nextLine();

                        System.out.println("Ingrese una referencia del Barrio : ");
                        referenciaBarrio = sc.nextLine();

                        Barrio b = new Barrio(nombreBarrio, referenciaBarrio);                       

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Barrio "
                                + "escriba (2)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");

                        int r = sc.nextInt();

                        op = r;
                        
                        archivoBarrio.establecerRegistroBarrio(b);
                        archivoBarrio.establecerSalida();
                        
                        if (op == 0) {
                            archivoBarrio.cerrarArchivo();
                        }

                    } while (op == 2);

                    break;

                case 3:

                    do {

                        sc.nextLine();

                        String nombreCivdad;
                        String nombreProvincia;

                        System.out.println("Ingrese el nombre de la Ciudad : ");
                        nombreCivdad = sc.nextLine();

                        System.out.println("Ingrese la provincia de la Ciudad : ");
                        nombreProvincia = sc.nextLine();

                        Ciudad ciu = new Ciudad(nombreCivdad, nombreProvincia);

                        sc.nextLine();

                        System.out.println("Si desea ingresar otra Ciudad "
                                + "escriba (3)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;
                        
                        archivoCiudad.establecerRegistroCiudad(ciu);
                        archivoCiudad.establecerSalida();
                        
                        if (op == 0) {
                            archivoCiudad.cerrarArchivo();
                        }

                    } while (op == 3);

                    break;

                case 4:

                    do {

                        sc.nextLine();

                        String nombreConstructora;
                        String idConstructora;

                        System.out.println("Ingrese el nombre de la Constructora : ");
                        nombreConstructora = sc.nextLine();

                        System.out.println("Ingrese el id de la empresa : ");
                        idConstructora = sc.nextLine();

                        Constructora cons = new Constructora(nombreConstructora,
                                idConstructora);

                        sc.nextLine();

                        System.out.println("Si desea ingresar otra Constructora "
                                + "escriba (4)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;
                        
                        archivoConstructora.establecerRegistroConstructora(cons);
                        archivoConstructora.establecerSalida();
                        
                        if (op == 0) {
                            archivoConstructora.cerrarArchivo();
                        }

                    } while (op == 4);

                    break;

                case 5:

                    do {

                        sc.nextLine();                                            
                      
                        double precioM2Casa;
                        double numM2Casa;                       
                        int numCuartosCasa;                        
                        
                        //------------------------------|
                        
                        //Propietario

                        String propietarioBuscadoC;
                        
                        System.out.println("Ingrese el id del propietario: ");
                        propietarioBuscadoC = sc.nextLine();
                        
                        Propietario propietarioBusC;                    
                        
                        LecturaPropietario lecturaPropieatarioBC = 
                        new LecturaPropietario(nombreArchivoPropietario);
                        
                        lecturaPropieatarioBC.establecerIdentificador
                        (propietarioBuscadoC);
                        lecturaPropieatarioBC.establecerPropietarioBuscado();
                        
                        propietarioBusC = lecturaPropieatarioBC.
                            obtenerPropietarioBuscado();
                        
                        Propietario proC = new Propietario(
                                propietarioBusC.obtenerNombres(), 
                                propietarioBusC.obtenerApellidos(),
                                propietarioBusC.obtenerIdentificacion());
                        
                        if (propietarioBusC == null){
                            
                            System.out.println("Propietario no encontrado.."
                                    + "ingrese uno en el menu de ingreso");
                    
                        }
                        
                        //-----------------------|

                        //Casa
                        
                        sc.nextLine();
                        
                        System.out.println("Ingrese el precio del metro cuadrado : ");
                        precioM2Casa = sc.nextDouble();

                        System.out.println("Ingrese el numero de metros cuadrados : ");
                        numM2Casa = sc.nextDouble();
                        
                        //----------------------|
                        
                        //Barrio

                        sc.nextLine();
                                         
                        String barrioBuscadoC;
                        
                        System.out.println("Ingrese el nombre del barrio a "
                                + "buscar: ");
                        barrioBuscadoC = sc.nextLine();
                        
                        Barrio barrioBusC;                    
                        
                        LecturaBarrio lecturaBarrioBC = 
                        new LecturaBarrio(nombreArchivoBarrio);
                        
                        lecturaBarrioBC.establecerIdentificador(barrioBuscadoC);
                        
                        lecturaBarrioBC.establecerBarrioBuscado();
                        
                        barrioBusC = lecturaBarrioBC.obtenerBarrioBuscado();
                                                                      
                        Barrio barC = new Barrio(
                            barrioBusC.obtenerNombreBarrio(), 
                            barrioBusC.obtenerReferencia());
                            
                        if (barrioBusC == null){
                            
                            System.out.println("Barrio no encontrado.."
                                    + "ingrese uno en el menu de ingreso");
                    
                        }
                        
                        //---------------------|
                        
                        //Ciudad

                        sc.nextLine();
                                         
                        String ciudadBuscadaC;
                        
                        System.out.println("Ingrese el nombre de la ciudad "
                                + "a buscar : ");
                        ciudadBuscadaC = sc.nextLine();
                        
                        Ciudad ciudadBusC;                    
                        
                        LecturaCiudad lecturaCiudadBC = 
                        new LecturaCiudad(nombreArchivoCiudad);
                        
                        lecturaCiudadBC.establecerIdentificador(ciudadBuscadaC);
                        
                        lecturaCiudadBC.establecerCiudadBuscada();
                        
                        ciudadBusC = lecturaCiudadBC.obtenerCiudadBuscada();
                        
                        Ciudad ciuC = new Ciudad(
                            ciudadBusC.obtenerNombreCiudad(), 
                            ciudadBusC.obtenerNombreProvincia());
                            
                        if (ciudadBusC == null){
                            
                            System.out.println("Ciudad no encontrada.."
                                    + " ingrese una en el menu de ingreso");
                    
                        }
                        
                        //--------------------|
                        
                        //Casa

                        System.out.println("Ingrese el numero de cuartos de la "
                                + "Casa: ");
                        numCuartosCasa = sc.nextInt();
                        
                        sc.nextLine();
                        
                        //-----------------|
                        
                        //Constructora
                        
                        sc.nextLine();
                                         
                        String constBuscadaC;
                        
                        System.out.println("Ingrese el id de la constructora "
                                + "a buscar : ");
                        constBuscadaC = sc.nextLine();
                        
                        Constructora consBusC;                    
                        
                        LecturaConstructora lecturaConstBC = 
                        new LecturaConstructora(nombreArchivoConstructora);
                        
                        lecturaConstBC.establecerIdentificador(constBuscadaC);
                        
                        lecturaConstBC.establecerConstructoraBuscada();
                        
                        consBusC = lecturaConstBC.obtenerConstructoraBuscada();              
                            
                        Constructora consC = new Constructora(
                            consBusC.obtenerNombreConstructora(), 
                            consBusC.obtenerIdEmpresa());
                            
                        if (consBusC == null){
                            
                            System.out.println("Constructora no encontrada.."
                                    + " ingrese una en el menu de ingreso");
                    
                        }
                        
                        //------------------------|
                        
                        //Definición de Casa

                        Casa cas = new Casa(proC, precioM2Casa, 
                        numM2Casa, barC, ciuC, numCuartosCasa, 
                        consC);
                        
                        cas.establecerCostoFinal();                       
                        
                        //----------------------|

                        sc.nextLine();

                        System.out.println("Si desea ingresar otra Casa "
                                + "escriba (5)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;
                        
                        archivoCasa.establecerRegistroCasa(cas);
                        archivoCasa.establecerSalida();
                        
                        if (op == 0) {
                            archivoCasa.cerrarArchivo();
                        }

                    } while (op == 5);

                    break;

                case 6:

                    do {

                        sc.nextLine();
                        
                        //variables
                                              
                        double precioM2Depar;
                        double numM2Depar;
                        double valorAlicuotaM;
                        String nombreEdificio;
                        String ubicacionDepar;
                        
                        //---------------------------|
                        
                        //Propietario
                        
                        String propietarioBuscadoD;
                        
                        System.out.println("Ingrese el id del propietario: ");
                        propietarioBuscadoD = sc.nextLine();
                        
                        Propietario propietarioBusD;                    
                        
                        LecturaPropietario lecturaPropieatarioBD = 
                        new LecturaPropietario(nombreArchivoPropietario);
                        
                        lecturaPropieatarioBD.establecerIdentificador
                        (propietarioBuscadoD);
                        lecturaPropieatarioBD.establecerPropietarioBuscado();
                        
                        propietarioBusD = lecturaPropieatarioBD.
                            obtenerPropietarioBuscado();
                        
                        Propietario proD = new Propietario(
                                propietarioBusD.obtenerNombres(), 
                                propietarioBusD.obtenerApellidos(),
                                propietarioBusD.obtenerIdentificacion());
                        
                        if (propietarioBusD == null){
                            
                            System.out.println("Propietario no encontrado.."
                                    + "ingrese uno en el menu de ingreso");
                    
                        }
                        
                        //------------------------|
                        
                        //Departamento
                        
                        sc.nextLine();
                                              
                        System.out.println("Ingrese el precio del metro cuadrado : ");
                        precioM2Depar = sc.nextDouble();
                        
                        System.out.println("Ingrese el numero de metros cuadrados : ");
                        numM2Depar = sc.nextDouble();
                        
                        System.out.println("Ingrese el valor alicuota mensual : ");
                        valorAlicuotaM = sc.nextDouble();
                        
                        //----------------------------|
                        
                        //Barrio
                        
                        sc.nextLine();
                                         
                        String barrioBuscadoD;
                        
                        System.out.println("Ingrese el nombre del barrio a "
                                + "buscar: ");
                        barrioBuscadoD = sc.nextLine();
                        
                        Barrio barrioBusD;                    
                        
                        LecturaBarrio lecturaBarrioBD = 
                        new LecturaBarrio(nombreArchivoBarrio);
                        
                        lecturaBarrioBD.establecerIdentificador(barrioBuscadoD);
                        
                        lecturaBarrioBD.establecerBarrioBuscado();
                        
                        barrioBusD = lecturaBarrioBD.obtenerBarrioBuscado();
                                                                      
                        Barrio barD = new Barrio(
                            barrioBusD.obtenerNombreBarrio(), 
                            barrioBusD.obtenerReferencia());
                            
                        if (barrioBusD == null){
                            
                            System.out.println("Barrio no encontrado.."
                                    + "ingrese uno en el menu de ingreso");
                    
                        }
                        
                        //-------------------------|
                        
                        //Ciudad
                        
                        sc.nextLine();
                                         
                        String ciudadBuscadaD;
                        
                        System.out.println("Ingrese el nombre de la ciudad "
                                + "a buscar : ");
                        ciudadBuscadaD = sc.nextLine();
                        
                        Ciudad ciudadBusD;                    
                        
                        LecturaCiudad lecturaCiudadBD = 
                        new LecturaCiudad(nombreArchivoCiudad);
                        
                        lecturaCiudadBD.establecerIdentificador(ciudadBuscadaD);
                        
                        lecturaCiudadBD.establecerCiudadBuscada();
                        
                        ciudadBusD = lecturaCiudadBD.obtenerCiudadBuscada();
                        
                        Ciudad ciuD = new Ciudad(
                            ciudadBusD.obtenerNombreCiudad(), 
                            ciudadBusD.obtenerNombreProvincia());
                            
                        if ( ciudadBusD == null ) {
                            
                            System.out.println("Ciudad no encontrada.."
                                    + " ingrese una en el menu de ingreso");
                    
                        }
                        
                        //--------------------|

                        //Departamento
                        
                        System.out.println("Ingrese el nombre del Edificio :");
                        nombreEdificio = sc.nextLine();
                        
                        System.out.println("Ingrese la ubicación del edificio :");
                        ubicacionDepar = sc.nextLine();
                        
                        //----------------------|
                        
                        //Constructora
                        
                        sc.nextLine();
                                         
                        String construcBuscadaD;
                        
                        System.out.println("Ingrese el id de la constructora "
                                + "a buscar : ");
                        construcBuscadaD = sc.nextLine();
                        
                        Constructora constBusD;                    
                        
                        LecturaConstructora lecturaConstBD = 
                        new LecturaConstructora(nombreArchivoConstructora);
                        
                        lecturaConstBD.establecerIdentificador(construcBuscadaD);
                        
                        lecturaConstBD.establecerConstructoraBuscada();
                        
                        constBusD = lecturaConstBD.obtenerConstructoraBuscada();              
                            
                        Constructora consD = new Constructora(
                            constBusD.obtenerNombreConstructora(), 
                            constBusD.obtenerIdEmpresa());
                            
                        if (constBusD == null){
                            
                            System.out.println("Constructora no encontrada.."
                                    + " ingrese una en el menu de ingreso");
                    
                        }
                        
                        //---------------------|
                        
                        //Definicion de Departamento

                        Departamento depto = new Departamento(proD, 
                        precioM2Depar, numM2Depar, valorAlicuotaM, barD, 
                        ciuD, nombreEdificio, ubicacionDepar, consD);
                        
                        depto.establecerCostoFinal();                      
                        
                        //--------------------------------|

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Departamento "
                                + "escriba (6)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;
                        
                        archivoDepartamento.establecerRegistroDepartmento(depto);
                        archivoDepartamento.establecerSalida();
                        
                        if (op == 0) {
                            archivoDepartamento.cerrarArchivo();
                        }

                    } while (op == 6);

                default:
                    
                    break;

            }

        } while (op == 0);
        
        
        if (op == 10) {

            do {

                op2 = obj.menu2();

                switch (op2) {

                    case 1:
                        
                        LecturaPropietario lecturaPropietario = 
                        new LecturaPropietario(nombreArchivoPropietario);
                        lecturaPropietario.establecerPropietarios();
                        System.out.println(lecturaPropietario);
                        
                        break;

                    case 2:
                        
                        LecturaBarrio lecturaBarrio = 
                        new LecturaBarrio(nombreArchivoBarrio);
                        lecturaBarrio.establecerBarrios();
                        System.out.println(lecturaBarrio);

                        break;

                    case 3:
                        
                        LecturaCiudad lecturaCiudad = 
                        new LecturaCiudad(nombreArchivoCiudad);
                        lecturaCiudad.establecerCiudades();
                        System.out.println(lecturaCiudad);

                        break;

                    case 4:
                        
                        LecturaConstructora lecturaConstructora = 
                        new LecturaConstructora(nombreArchivoConstructora);
                        lecturaConstructora.establecerConstructoras();
                        System.out.println(lecturaConstructora);

                        break;

                    case 5:
                        
                        LecturaCasa lecturaCasa = 
                        new LecturaCasa(nombreArchivoCasa);
                        lecturaCasa.establecerCasas();
                        System.out.println(lecturaCasa);

                        break;

                    case 6:
                        
                        LecturaDepartamento lecturaDepar = 
                        new LecturaDepartamento(nombreArchivoDepartamento);
                        lecturaDepar.establecerDepartamentos();
                        System.out.println(lecturaDepar);

                        break;

                    case 7:
                        
                        op = 0;

                        break;
                        
                    default:
                        
                        break;

                }

            } while (op2 != 0);

        }

    }

    public int menu() {

        int opc;
        System.out.println("Ingresar Propietario:           [1]:");
        System.out.println("Ingresar Barrio:                [2]:");
        System.out.println("Ingresar Ciudad:                [3]:");
        System.out.println("Ingresar Constructora:          [4]:");
        System.out.println("Ingresar Casa:                  [5]:");
        System.out.println("Ingresar Departamento:          [6]:");
        System.out.println("Terminar Ingresos:              [10]:\n");

        opc = sc.nextInt();
        return opc;
    }

    public int menu2() {

        int opc;
        System.out.println("Listar Propietario:           [1]:");
        System.out.println("Listar Barrio:                [2]:");
        System.out.println("Listar Ciudad:                [3]:");
        System.out.println("Listar Constructora:          [4]:");
        System.out.println("Listar Casa:                  [5]:");
        System.out.println("Listar Departamento:          [6]:");
        System.out.println("Regresar al menu de ingreso:  [7]:");
        System.out.println("Salir y terminar:             [0]:\n");

        opc = sc.nextInt();
        return opc;
    }

}
