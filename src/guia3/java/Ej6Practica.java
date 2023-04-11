/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.java;

import java.util.Scanner;

/**
 *
 * @author Philip Jacson
 */
public class Ej6Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int num1, num2;
        String opcion;
        System.out.println("Ingrese dos numeros positivos ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        do {
            System.out.println("=========MENU==========");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opcion segun su numero: ");
            opcion = scanner.next();

            switch (opcion) {
                case "1":
                    System.out.println("la suma es " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("La resta de los numeros es " + (num1 - num2));
                    break;
                case "3":
                    System.out.println("La multiplicación de los numeros es " + (num1 * num2));
                    break;
                case "4":
                    System.out.println("La división de los numeros es " + (num1 / num2));
                    break;
                case "5":
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcion = scanner.next();
                    break;
            }
            
            }while (!opcion.equalsIgnoreCase("s")); {
                System.out.println("hasta Luego!");
                        }      
          
    
    
    }

}
