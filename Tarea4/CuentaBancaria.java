package Tarea4;
import java.util.Scanner;
public class CuentaBancaria {
    
    private float saldo;

    public CuentaBancaria(float saldo) {
        this.saldo = saldo;  
    }
    
    private void consulta1(){
        System.out.println("El saldo de la cuenta es: " + this.saldo );    
    }
    private void consulta2(){
        System.out.println("El saldo de la cuenta es: " + this.saldo );    
    }
            
    
    private void abonar(float dinero){
         saldo += dinero;
    }
    private void debitar(float dinero){
        saldo -= dinero;
    }

    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public static void main(String[] args) {
    
    CuentaBancaria cuenta1 = new CuentaBancaria(500);
    CuentaBancaria cuenta2 = new CuentaBancaria(300);
        
    Scanner sp = new Scanner(System.in);
    Scanner sp2 = new Scanner(System.in);
    
    while(true){
        
        System.out.println("------------MENÚ------------");
        System.out.println("Ingresá lo querés hacer:");
        System.out.println("1. Consultar cuenta 1");
        System.out.println("2. Consultar cuenta 2");
        System.out.println("3. Abonar a cuenta 1");
        System.out.println("3. Debitar");
        System.out.println("4. Salir");
        System.out.println("----------------------------");
        System.out.println("");
        
        switch(sp.nextInt()){
        
            case 1: cuenta1.consulta1();break;
            case 2: cuenta2.consulta2(); break;
            case 3: 
                System.out.println("Ingresá la cantidad que quiere abonar:");
                if (sp2.nextInt()<0) {
                    System.out.println("No se puede abonar Q 0.00");
                }else{
                cuenta1.abonar((float) sp.nextInt());
            }break;
            case 4:System.exit(0);  break;
            default:System.out.println("Numero invalido"); break;
        }
    }
      
        //cuenta1.saldo= (float)500000.50;
        
        
        //System.out.println(cuenta1.mostrar());
        //cuenta1.abonar((float) 55.1);
        //System.out.println(cuenta1.mostrar());
        //cuenta1.debito((float) 500000.0);
        //System.out.println(cuenta1.mostrar());
        
        
    }
    public static void abonar2(){
    
       Scanner sp = new Scanner(System.in);
       
    
    while(true){
        
        System.out.println("------------ABONAR------------");
        System.out.println("Ingresá lo querés hacer:");
        System.out.println("1. Cuenta 1");
        System.out.println("2. Cuenta 2");
        
        if (true) {
            
        }

        }
    }
    
    
    public static void menu2(){
        while (true){
    Scanner sp = new Scanner(System.in);
    System.out.println("Que cuenta quieres consultar");
    System.out.println("1. Cuenta 1");
    System.out.println("2. Cuenta 2");
    System.out.println("3. Regresar");
        switch(sp.nextInt()){
        
            case 1: System.out.println("El saldo de la cuenta es: " ); break;
            case 2: System.out.println("El saldo de la cuenta es: "); break;
            case 3: ; break;
            
            default: System.out.println("Ingresaste un numero incorrecto."); break;     
            }
        } 
    
    }

    
}
