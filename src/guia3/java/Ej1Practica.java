
package guia3.java;

import java.util.Scanner;

public class Ej1Practica {


    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Escriba un número entero");
        int num = leer.nextInt();
        num = num % 2;
        
        if(num == 0){
            System.out.println("El número ingresado es PAR");
        } else {
            System.out.println("El número ingresado es IMPAR");
        }
        
        
    }
    
}
