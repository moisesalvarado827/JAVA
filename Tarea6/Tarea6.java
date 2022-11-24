package Tarea6;
public class Tarea6 {
    public static void main(String[] args) {
        int tablero[][]=new int[8][8];
        int valor = 64;
        boolean cambio = false;
        
        for (int i = 0; i < tablero.length; i++) {
             if (cambio) {
               for (int j =0; j <tablero[i].length; j++) {
               tablero[i][j] = valor;
               valor--;
            } 
               cambio = false;
            }else{
            
            for (int j = tablero[i].length -1; j >= 0; j--) {
               tablero[i][j] = valor;
               valor--;
            }
            cambio=true;
            }
             
            
        }
        System.out.println("------------------------");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j]<10) {
                    System.out.print("| "+tablero[i][j]);
                }else{
                System.out.print("|"+tablero[i][j]);
                }
            }
        System.out.println("");
            System.out.println("------------------------");
        }
    }
}
