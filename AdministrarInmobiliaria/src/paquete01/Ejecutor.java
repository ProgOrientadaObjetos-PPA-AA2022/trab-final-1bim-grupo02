package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Casa;
import paquete06.Departamento;

public class Ejecutor {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Ejecutor obj = new Ejecutor();

        //ArrayLists
        ArrayList<Propietario> ListaPropietarios = new ArrayList();
        ArrayList<Barrio> ListaBarrio = new ArrayList();
        ArrayList<Ciudad> ListaCiudad = new ArrayList();
        ArrayList<Constructora> ListaConstructora = new ArrayList();
        ArrayList<Casa> ListaCasa = new ArrayList();
        ArrayList<Departamento> ListaDepartamento = new ArrayList();

        //-------------------
        int op, op2, i = 0;

        do {

            i++;

            op = obj.menu();

            switch (op) {

                case 1:

                    do {

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
                        ListaPropietarios.add(p);

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Propietario "
                                + "escriba (1)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;

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
                        ListaBarrio.add(b);

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Barrio "
                                + "escriba (2)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");

                        int r = sc.nextInt();

                        op = r;

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
                        ListaCiudad.add(ciu);

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Barrio "
                                + "escriba (3)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;

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

                        ListaConstructora.add(cons);

                        sc.nextLine();

                        System.out.println("Si desea ingresar otra Constructora "
                                + "escriba (4)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;

                    } while (op == 4);

                    break;

                case 5:

                    do {

                        sc.nextLine();
                        
                        //variables

                        String nombrePropietarioCasa;
                        String apellidoPropietarioCasa;
                        String idPropietarioCasa;
                        double precioM2Casa;
                        double numM2Casa;
                        String nombreBarrioCasa;
                        String referenciaBarrioCasa;
                        String nombreCivdadCasa;
                        String nombreProvinciaCasa;
                        int numCuartosCasa;
                        String nombreConstructoraCasa;
                        String idConstructoraCasa;
                        
                        //------------------------------|
                        
                        //Propietario

                        System.out.println("Ingrese el nombre del Propietario: ");
                        nombrePropietarioCasa = sc.nextLine();

                        System.out.println("Ingrese el apellido del Propietario: ");
                        apellidoPropietarioCasa = sc.nextLine();

                        System.out.println("Ingrese el id del Propietario: ");
                        idPropietarioCasa = sc.nextLine();

                        Propietario propietarioCasa = new Propietario 
                            (nombrePropietarioCasa, apellidoPropietarioCasa,
                            idPropietarioCasa);
                        
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
                                         
                        System.out.println("Ingrese el nombre del Barrio : ");
                        nombreBarrioCasa = sc.nextLine();

                        System.out.println("Ingrese una referencia del Barrio : ");
                        referenciaBarrioCasa = sc.nextLine();

                        Barrio barrioCasa = new Barrio(nombreBarrioCasa,
                                referenciaBarrioCasa);
                        
                        //---------------------|
                        
                        //Ciudad

                        System.out.println("Ingrese el nombre de la Ciudad : ");
                        nombreCivdadCasa = sc.nextLine();

                        System.out.println("Ingrese la provincia de la Ciudad : ");
                        nombreProvinciaCasa = sc.nextLine();

                        Ciudad civdadCasa = new Ciudad(nombreCivdadCasa,
                                nombreProvinciaCasa);

                        sc.nextLine();
                        
                        //--------------------|
                        
                        //Casa

                        System.out.println("Ingrese el numero de cuartos de la "
                                + "Casa: ");
                        numCuartosCasa = sc.nextInt();
                        
                        sc.nextLine();
                        
                        //-----------------|
                        
                        //Constructora
                        
                        System.out.println("Ingrese el nombre de la Constructora : ");
                        nombreConstructoraCasa = sc.nextLine();

                        System.out.println("Ingrese el id de la empresa : ");
                        idConstructoraCasa = sc.nextLine();
                        
                        Constructora constructoraCasa = new Constructora
                        (nombreConstructoraCasa, idConstructoraCasa);
                        
                        //------------------------|
                        
                        //Definición de Casa

                        Casa cas = new Casa(propietarioCasa, precioM2Casa, 
                        numM2Casa, barrioCasa, civdadCasa, numCuartosCasa, 
                        constructoraCasa);
                        
                        cas.establecerCostoFinal();
                        
                        ListaCasa.add(cas);
                        
                        //----------------------|

                        sc.nextLine();

                        System.out.println("Si desea ingresar otra Casa "
                                + "escriba (5)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;

                    } while (op == 5);

                    break;

                case 6:

                    do {

                        sc.nextLine();
                        
                        //variables
                        
                        String nombrePropietarioDepar;
                        String apellidoPropietarioDepar;
                        String idPropietarioDepar;
                        double precioM2Depar;
                        double numM2Depar;
                        double valorAlicuotaM;
                        String nombreBarrioDepar;
                        String referenciaBarrioDepar;
                        String nombreCivdadDepar;
                        String nombreProvinciaDepar;
                        String nombreEdificio;
                        String ubicacionDepar;
                        String nombreConstructoraDepar;
                        String idConstructoraDepar;
                        
                        //---------------------------|
                        
                        //Propietario
                        
                        System.out.println("Ingrese el nombre del Propietario: ");
                        nombrePropietarioDepar = sc.nextLine();

                        System.out.println("Ingrese el apellido del Propietario: ");
                        apellidoPropietarioDepar = sc.nextLine();

                        System.out.println("Ingrese el id del Propietario: ");
                        idPropietarioDepar = sc.nextLine();

                        Propietario propietarioDepar = new Propietario 
                            (nombrePropietarioDepar, apellidoPropietarioDepar,
                            idPropietarioDepar);
                        
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
                        
                        System.out.println("Ingrese el nombre del Barrio : ");
                        nombreBarrioDepar = sc.nextLine();

                        System.out.println("Ingrese una referencia del Barrio : ");
                        referenciaBarrioDepar = sc.nextLine();

                        Barrio barrioDepar = new Barrio(nombreBarrioDepar,
                                referenciaBarrioDepar);
                        
                        //-------------------------|
                        
                        //Ciudad
                        
                        sc.nextLine();
                        
                        System.out.println("Ingrese el nombre de la Ciudad : ");
                        nombreCivdadDepar = sc.nextLine();

                        System.out.println("Ingrese la provincia de la Ciudad : ");
                        nombreProvinciaDepar = sc.nextLine();

                        Ciudad civdadDepar = new Ciudad(nombreCivdadDepar,
                                nombreProvinciaDepar);
                        
                        //--------------------|

                        //Departamento
                        
                        System.out.println("Ingrese el nombre del Edificio :");
                        nombreEdificio = sc.nextLine();
                        
                        System.out.println("Ingrese la ubicación del edificio :");
                        ubicacionDepar = sc.nextLine();
                        
                        //----------------------|
                        
                        //Constructora
                        
                        System.out.println("Ingrese el nombre de la Constructora : ");
                        nombreConstructoraDepar = sc.nextLine();

                        System.out.println("Ingrese el id de la empresa : ");
                        idConstructoraDepar = sc.nextLine();
                        
                        Constructora constructoraDepar = new Constructora
                        (nombreConstructoraDepar, idConstructoraDepar);
                        
                        //---------------------|
                        
                        //Definicion de Departamento

                        Departamento depto = new Departamento(propietarioDepar, 
                        precioM2Depar, numM2Depar, valorAlicuotaM, barrioDepar, 
                        civdadDepar, nombreEdificio, ubicacionDepar, constructoraDepar);
                        
                        depto.establecerCostoFinal();
                        
                        ListaDepartamento.add(depto);
                        
                        //--------------------------------|

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Departamento "
                                + "escriba (6)");
                        System.err.println("Escriba (0) para volver al Menu de "
                                + "ingreso");
                        int r = sc.nextInt();
                        op = r;

                    } while (op == 6);

                default:
                    System.err.println("Error número fuera de rango ingrese "
                            + "otro..");
                    break;

            }

        } while (op == 0);

        if (op == 10) {

            do {

                op2 = obj.menu2();

                switch (op2) {

                    case 1:

                        break;

                    case 2:

                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    case 5:

                        break;

                    case 6:

                        break;

                    case 7:

                        break;

                    default:
                        System.err.println("Error número fuera de rango ingrese"
                                + " otro..");
                        break;

                }

            } while (op2 != 10);

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
        System.out.println("Listar todos:                 [7]:");
        System.out.println("Salir y terminar:             [10]:\n");

        opc = sc.nextInt();
        return opc;
    }

}
