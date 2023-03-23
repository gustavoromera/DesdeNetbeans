
package guia3.java;

import java.util.Scanner;

public class Ej9Teoria {


    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        int cont=0;
        int num=0;
        int suma=0;
        
        do {
            System.out.println("Escriba un número");
            num= leer.nextInt();
            cont++;
            System.out.println("Contador: " + cont);
            
            if (num>=0) {
                suma+=num;
            }
            
        } while (cont != 20 && num != 0);
        
        if (num==0) {
            System.out.println("Se capturó el numero cero");
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
