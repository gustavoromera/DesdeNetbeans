/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo 
siguiente:
*/

package guia3.java;

import java.util.Scanner;

public class Ej8practica {


    public static void main(String[] args) {
       
        Scanner leer=new Scanner (System.in);
        
        System.out.println("Introduce el tamaño del cuadrado");
        int tam= leer.nextInt();
        
        for (int i = 1; i <= tam; i++) {
            System.out.print(" * ");
            for (int j = 2; j <= tam; j++) {
                if (i==1 || i==tam){
                    System.out.print(" * ");
                } else {
                    if (j!=tam) {
                        System.out.print("   ");                        
                    } else {
                        System.out.print(" * ");
                    }
                }
                
            }
            System.out.println("");
            
        }
    }
    
}
