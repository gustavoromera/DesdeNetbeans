
package javaintro01;

import java.util.Scanner;


public class ejercicio4practica {
    
    public static void main(String[] args) {
         Scanner leer=new Scanner (System.in);
        double c,f;
        System.out.println("Ingrese el valor en grados centigrados");
        c = leer.nextDouble();
        f=32+(9*c/5);
        System.out.println(c + " grados centígrados o " + f + " grados farenheit");
        
    } 
}
