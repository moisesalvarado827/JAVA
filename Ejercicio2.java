
package Tarea2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        float n1 = sp.nextFloat();
        
        if (n1 > 0) {
            System.out.println("SU NUMERO ES POSITIVO");
        }else if (n1 < 0) {
            System.out.println("SU NUMERO ES NEGATIVO");
        }else{
            System.out.println("EL CERO '0' ES UN NUMERO NEUTRO");
        }
    }
}
