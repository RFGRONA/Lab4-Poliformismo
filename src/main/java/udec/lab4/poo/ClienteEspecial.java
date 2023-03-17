/*
    Cliente especial: realiza operaciones básicas y su resultado se divide por dos. Ingresa dos numeros y escoge la operación a realizar.
    ! Ya que la interface indica que los métodos retornan resultados enteros, al realizar la división por 2 la parte decimal será ignorada.
*/

package udec.lab4.poo;

import java.util.Scanner;

public class ClienteEspecial {

    static void principal() {
        
        int opc = 1, num1 = 0, num2 = 0;
        
        CalculadoraEspecial cal = new CalculadoraEspecial();
        Scanner s = new Scanner(System.in);
        
        System.out.println("----- Los resultados serán divididos entre dos sin parte decimal -----");
        while (opc != 0) {
            System.out.print("\n===== Calculadora Especial =====\n\t0. Devolverse \n\t1. Suma \n\t2. Resta \n\t3. Multiplicación \n\t4. División \n\t5. Raíz cuadrada\nIngrese una opción: ");
            opc = s.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Regresando...");
                    break;
                case 1:
                    System.out.println("Ingrese los numeros: ");
                    num1 = s.nextInt();
                    num2 = s.nextInt();
                    System.out.println(cal.sumarEnteros(num1, num2));
                    break;
                case 2:
                    System.out.println("Ingrese los numeros: ");
                    num1 = s.nextInt();
                    num2 = s.nextInt();
                    System.out.println(cal.restarEnteros(num1, num2));
                    break;
                case 3:
                    System.out.println("Ingrese los numeros: ");
                    num1 = s.nextInt();
                    num2 = s.nextInt();
                    System.out.println(cal.multiplicarEnteros(num1, num2));
                    break;
                case 4:
                    System.out.println("Ingrese los numeros: ");
                    num1 = s.nextInt();
                    num2 = s.nextInt();
                    System.out.println(cal.dividirEnteros(num1, num2));
                    break;
                case 5:
                    System.out.println("Ingrese el numero: ");
                    num1 = s.nextInt();
                    System.out.println(cal.calcularRaizCuadrada(num1));
                    break;
                default:
                    System.out.println("Valor invalido");
                    opc = 1;
                    break;
            }
        }
    }
}
