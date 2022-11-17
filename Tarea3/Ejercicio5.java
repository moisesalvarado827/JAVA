
package Tarea3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int suma = 0;
        int n1;
        do{
        Scanner sp = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        n1 = sp.nextInt();
        suma = suma + n1;
        }while(n1 !=0);
        System.out.println("La suma total es: " + suma);
    }
}
