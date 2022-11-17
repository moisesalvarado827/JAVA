
package Tarea3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        while (true){
        Scanner sp = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n1 = sp.nextInt();
            if (n1 > 0) {
                System.out.println("Su numero es positivo");
                System.out.println("");
                }else if (n1 < 0) {
                System.out.println("Su numero es negativo.");
                System.out.println("");
            }else{
                System.out.println("Su numero es 0. ");
                    break;
                }
        }
    }
}


