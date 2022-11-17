package Tarea3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        while (true){
        Scanner sp = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n1 = sp.nextInt();
        if (n1 == 0) {
            break;
            }else if (n1%2 == 0) {
                System.out.println("Su numero es par");
                System.out.println("");
                
            }else{
                 System.out.println("Su numero es impar");
                System.out.println("");
            }
       }
    }
}
