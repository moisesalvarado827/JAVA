package Tarea5;

import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {
          
    int numeros[][] = new int [5][4];
    int cantidad =1;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                Scanner sp = new Scanner(System.in); 
                System.out.println("Ingrese su numero: "+cantidad);
                numeros[i][j]=sp.nextInt();
                cantidad++;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("|"+numeros[i][j]);
            }
            
            System.out.println();
            System.out.println("------------");
        }

    }
 
}
