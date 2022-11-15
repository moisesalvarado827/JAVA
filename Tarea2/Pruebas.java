
package Tarea2;

import java.util.Scanner;

public class Pruebas {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("INGRESE EL DIA: ");
        int d = sp.nextInt();
        System.out.println("INGRESE EL MES: ");
        int m = sp.nextInt(); 
        System.out.println("INGRESE EL AÑO: ");
        int a = sp.nextInt();
        
        switch (m){
        
        case 1: 
            if (d<=31) {
                if (a>0) {
                    System.out.println("La fecha es correcta");
                }
            }else{
                System.out.println("Dia  incorrecto");
            }
            break;
        case 2: break;
        case 3: break;
        case 4:
            if (d<=30) {
                if (a>0) {
                    System.out.println("La fecha es correcta");
                }
            }
         break;
        case 5: break;
        case 6: break;
        case 7: break;
        case 8: break;
        case 9: break;
        case 10: break;
        case 11: break;
        case 12: break;
        } 
        
    }
}
