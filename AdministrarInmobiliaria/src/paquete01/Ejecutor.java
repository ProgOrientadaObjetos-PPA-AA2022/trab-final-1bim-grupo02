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

        int op, i = 0;

        do {
            
            i++;

            op = obj.menu();

            switch (op) {

                case 1:
                    String nombreP;
                    System.out.println("Ingrese el nombre del propietario: ");
                    nombreP = sc.nextLine();
                    ArrayList<Propietario> ListaPropietarios = null;                    
                    Propietario p = new Propietario(nombreP);
                    ListaPropietarios.add(p);
                    break;


                case 2:
                    String nombreB;
                    System.out.println("Ingrese el nombre del barrio: ");
                    nombreB = sc.nextLine();
                    ArrayList<Barrio> ListaBarrios = null;
                    Barrio b = new Barrio(nombreB);
                    ListaBarrios.add(b);
                    break;


                case 3:
                    String nombreC;
                    System.out.println("Ingrese el nombre de la ciudad: ");
                    nombreC = sc.nextLine();
                    ArrayList<Ciudad> ListaCiudad = null;
                    Ciudad c = new Ciudad(nombreC);
                    ListaCiudad.add(c);
                    
                    break;


                case 4:
                    String nombreCt;
                    System.out.println("Ingrese el nombre de la constructora: ");
                    nombreCt = sc.nextLine();
                    ArrayList<Constructora> ListaConstructura = null;
                    Constructora ct = new Constructora(nombreCt);
                    ListaConstructura.add(ct);
                    break;


                case 5:
                    double precioM2Casa;
                    System.out.println("Ingrese el precio del metro cuadrado : ");
                    sc.nextLine();
                    precioM2Casa = sc.nextDouble();
                    ArrayList<Casa> ListaCasa;
                    Casa cas = new Casa(precioM2Casa);
                    break;

                case 6:
                    double precioM2Depto;
                    System.out.println("Ingrese el precio del metro cuadrado : ");
                    sc.nextLine();
                    precioM2Depto = sc.nextDouble();
                    ArrayList<Departamento> ListaDepartamento;
                    Departamento depto = new Departamento(precioM2Depto);
                    break;

                default:
                    System.err.println("Error número fuera de rango ingrese "
                        + "otro..");
                    break;

            }
            
        } while (op < 7);       
        
        do {

            op = obj.menu2();

            switch (op) {

                case 11:

                    break;

                case 12:

                    break;

                case 13:

                    break;

                case 14:

                    break;

                case 15:

                    break;

                case 16:

                    break;
                    
                case 17:

                    break;

                default:
                    System.err.println("Error número fuera de rango ingrese"
                        + " otro..");
                    break;

            }
            
        } while (op >= 7 && op != 18);

    }

    public int menu() {

        int opc;
        System.out.println("Ingresar Propietario:           [1]");
        System.out.println("Ingresar Barrio:                [2]");
        System.out.println("Ingresar Ciudad:                [3]");
        System.out.println("Ingresar Constructora:          [4]");
        System.out.println("Ingresar Casa:                  [5]");
        System.out.println("Ingresar Departamento:          [6]");       
        System.out.println("Terminar Ingresos:              [7]\n");

        opc = sc.nextInt();
        return opc;
    }
    
    public int menu2() {

        int opc;
        System.out.println("Listar Propietario:           [11]");
        System.out.println("Listar Barrio:                [12]");
        System.out.println("Listar Ciudad:                [13]");
        System.out.println("Listar Constructora:          [14]");
        System.out.println("Listar Casa:                  [15]");
        System.out.println("Listar Departamento:          [16]");
        System.out.println("Listar todos:                 [17]");
        System.out.println("Salir:                        [18]\n");

        opc = sc.nextInt();
        return opc;
    }

}
