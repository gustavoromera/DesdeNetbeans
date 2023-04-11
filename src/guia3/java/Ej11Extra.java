
package guia3.java;

import java.util.Scanner;

public class Ej11Extra {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un num entero");
        int num = leer.nextInt();
         int c=0;
        while(num>0){
           num=num/10;
           c++;
        }
        System.out.println("La cantidad de digitos es: " + c);
        
    }

}
