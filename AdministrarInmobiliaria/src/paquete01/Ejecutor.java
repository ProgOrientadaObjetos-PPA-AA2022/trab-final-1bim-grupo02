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
                        System.out.println("Ingrese el nombre del Propietario: ");
                        nombrePropietario = sc.nextLine();

                        Propietario p = new Propietario(nombrePropietario);
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
                        System.out.println("Ingrese el nombre del Barrio : ");
                        nombreBarrio = sc.nextLine();

                        Barrio b = new Barrio(nombreBarrio);
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
                        System.out.println("Ingrese el nombre de la Ciudad : ");
                        nombreCivdad = sc.nextLine();

                        Ciudad ciu = new Ciudad(nombreCivdad);
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
                        System.out.println("Ingrese el nombre de la Constructora : ");
                        nombreConstructora = sc.nextLine();

                        Constructora cons = new Constructora(nombreConstructora);
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
                        double precioM2Casa;
                        System.out.println("Ingrese el precio del metro cuadrado : ");
                        precioM2Casa = sc.nextDouble();

                        Casa cas = new Casa(precioM2Casa);
                        ListaCasa.add(cas);

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Barrio "
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
                        double precioM2Departamento;
                        System.out.println("Ingrese el precio del metro cuadrado : ");
                        precioM2Departamento = sc.nextDouble();

                        Departamento dep = new Departamento(precioM2Departamento);
                        ListaDepartamento.add(dep);

                        sc.nextLine();

                        System.out.println("Si desea ingresar otro Barrio "
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
