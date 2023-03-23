/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package guia3.java;

import java.util.Scanner;


public class Ej8Teoria {

    public static void main(String[] args) {
       
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Escriba una nota");
        float nota = leer.nextFloat();
        
        while (nota>10 || nota<0) {
            System.out.println("La nota ingresada debe estar entre 0 y 10");
            System.out.println("Vuelva a escribir la nota");
            nota = leer.nextFloat();
    }
        System.out.println("La nota ingresada es: " + nota);       
}
}

