/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author Philip Jacson
 */
public class ejercicio1practica {
    
    public static void main(String[] args) {
        int num1,resultado;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        num1=leer.nextInt();
        
        System.out.println("Ingrese el primer numero");
        int num2=leer.nextInt();
        
        resultado= num1+num2;
        
        System.out.println("El resultado de la suma es: " + resultado);
        
    }
    
}
