/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea3;

import java.util.Scanner;

/**
 *
 * @author Moisés
 */
public class Pruebas {
    public static void main(String[] args) {
        int x=(int) (Math.random()*(100-1)-1);

        
        while (true){
        Scanner sp = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n1 = sp.nextInt();
            if (n1 > x) {
                System.out.println("El numero es mayor");
                System.out.println("");
                }else if (n1 < x) {
                System.out.println("El numero es menor");
                System.out.println("");
            }else if (n1 == x) {
                System.out.println("Has ganado!. El numero correcto era: " + x);
            }
        }
    }
}
