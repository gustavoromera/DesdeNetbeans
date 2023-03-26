
package javaintro01;

import java.util.Scanner;


public class ejercicio3practica {
    
    public static void main(String[] args) {
        
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        String minus = frase.toLowerCase();
        String mayus = frase.toUpperCase();
        
        System.out.println(minus);
        System.out.println(mayus);
    }
    
}
