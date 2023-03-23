
package guia3.java;

import java.util.Scanner;

public class Ej1Teoria {
    
    public static void main(String[] args){
        
        Scanner read=new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro número entero");
        int num2 = read.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num2>25) {
            System.out.println(num2 + " Es mayor a 25");            
                } else if (num1>25) {
                    System.out.println(num1 + " Es mayor a 25");
                } else {
                    System.out.println("Ninguno de los números ingresados es"
                            + " mayor a 25");
                }
    }
}
