/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

/**
 *
 * @author Philip Jacson
 */
public class JavaIntro01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 8;
        int num2 = 2;
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma );
        suma+=2;
        System.out.println("La nueva suma es: " + suma );
        String nombre1 = "Monica";
        boolean verific = num1 == num2;
        System.out.println("num1 es igual a num2:  " + verific );
        boolean verific2= num1 > num2;
        System.out.println("num1 es mayor que num2: " + verific2 );
        double dec = suma / num1;
        System.out.println("La suma de num1 y num2 dividido num1 es: " + dec );
        num1++;
        num2--;
        System.out.println("num1 ahora vale: " + num1 + " y num2 ahora vale: " + num2);
        char letra = 'a';
        System.out.println("La letra guardada es: " + letra );
        byte min128max127 = -128;
        System.out.println("El numero ingresado en byte es : " + min128max127 );
        
      

        
        // TODO code application logic here
    }
    
}
