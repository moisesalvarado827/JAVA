
package Tarea2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("INGRESE SU PRIMER NUMERO: ");
        float n1 = sp.nextFloat();
        System.out.println("INGRESE SU SEGUNDO NUMERO: ");
        float n2 = sp.nextFloat();
        
        if (n1 > n2) {
            System.out.println("SUS NUMEROS SON: " + n1 + " y " + n2);
        }else if (n1 < n2) {
            System.out.println("SUS NUMEROS SON: " + n2 + " y " + n1);
        }else{
            System.out.println("LOS NUMEROS SON IGUALES");
        }
    }
}
