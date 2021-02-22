/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjava_g02;
import java.util.Scanner;
/**
 *
 * @author jairo
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Mensaje: ");
        String msg = entrada.next();
        
        imprimirMsg(msg);
        
        System.out.print("A: ");
        int a = entrada.nextInt();
        System.out.print("B: ");
        int b = entrada.nextInt();
        
        dividir(a,b);
    }
    
    /**
     * 
     * @param txt parametro que indica el texto a imprimir tipo String
     */
    public static void imprimirMsg(String txt){
        System.out.print(txt);
        System.out.println(" Bienvenido a Programacion II");
        System.out.printf("Hola soy %s el docente y tengo %d años\n", "Jairo", 20);
        
    }
    
    public static void dividir(int a, int b){
        
        double res = (double)a / b;
        System.out.printf("El cociente de  %d / %d = %.2f\n",a,b,res);
        
    }
    
}
