
package Tarea3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
 
        while (true){
        Scanner sp = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n1 = sp.nextInt();
        if (n1 > 0) {
            System.out.println("El cuadrado del numero es: " + (n1*n1));
            }else{
                System.out.println("Su numero es negativo.");
                break;
        }
       }
    }
}
