
package Tarea2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("INGRESE EL DIA: ");
        int d = sp.nextInt();
        System.out.println("INGRESE EL MES: ");
        int m = sp.nextInt(); 
        System.out.println("INGRESE EL AÑO: ");
        int a = sp.nextInt();
        
        if (d>31 || d<1) {
            System.out.println("LA FECHA ES INCORRECTA.");
        }else if (m > 12 || m<1) {
            System.out.println("LA FECHA ES INCORRECTA");
        }else if (m == 2 && d>28) {
            System.out.println("LA FECHA ES INCORRECTA");
        }else if (m==4 || m==6 || m==9 || m==11 && d>30) {
            System.out.println("LA FECHA ES INCORRECTA");
        }else if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12 && d>31) {
            System.out.println("LA FECHA ES INCORRECTA");
        }
        else if (a < 1582) {
            System.out.println("LA FECHA ES INCORRECTA");
        }else{
            System.out.println("LA FECHA ES: " + d+"/"+m+"/"+a);
        }
        
    }
}
