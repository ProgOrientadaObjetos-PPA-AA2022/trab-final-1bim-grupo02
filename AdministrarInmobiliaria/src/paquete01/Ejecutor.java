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

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Ejecutor obj = new Ejecutor();

        int op, c = 0;

        do {
            
            c++;

            op = obj.menu();

            switch (op) {

                case 1:
                    ArrayList<Propietario> ListaPropietarios;
                    break;

                case 2:
                    ArrayList<Barrio> ListaBarrios;
                    break;

                case 3:
                    ArrayList<Ciudad> ListaCiudad;
                    break;

                case 4:
                    ArrayList<Constructora> ListaConstructura;
                    break;

                case 5:
                    ArrayList<Casa> ListaCasa;
                    break;

                case 6:
                    ArrayList<Departamento> ListaDepartamento;
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
