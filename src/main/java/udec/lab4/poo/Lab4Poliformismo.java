/*
    Clase principal, donde se puede escoger el tipo de cliente que va a utilizar el programa.
    El programa solo se dentendrá cuando el usuario lo indique.
*/

package udec.lab4.poo;

import java.util.Scanner;

public class Lab4Poliformismo {

    public static void main(String[] args) {
        
        int opc = 1;
        Scanner s = new Scanner(System.in);
        
        while (opc != 0) {
            System.out.print("\n===== Calculadora clientes =====\n0. Cerrar programa \n1. Calculadora normal\n2. Calculadora especial\nEscoja el tipo de cliente: ");
            opc = s.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Finalizando programa...");
                    System.exit(0);
                case 1:
                    ClienteNormal.principal();
                    break;
                case 2:
                    ClienteEspecial.principal();
                    break;
                default:
                    System.out.println("Valor invalido");
                    opc = 1;
                    break;
            }
        }
    }
}
