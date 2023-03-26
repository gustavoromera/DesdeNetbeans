
package javaintro01;

import java.util.Scanner;


public class ejercicio5practica {
    
    public static void main(String[] args) {
         Scanner leer=new Scanner (System.in);
         System.out.println("Ingrese un número");
         int num = leer.nextInt();
         System.out.println("El doble es: " + num*2);
         System.out.println("El triple es: " + num*3);
         double raiz = Math.sqrt(num);
         System.out.println("La raiz cuadrada es: " + raiz);
    
}
}
