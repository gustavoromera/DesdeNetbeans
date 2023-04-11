
package guia3.java;

import java.util.Scanner;


public class Ej10Extra {

  
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2,mult,resp;
        num1= (int) Math.floor(Math.random()*10);
        num2= (int) Math.floor(Math.random()*10);
        mult=num1*num2;
        System.out.println(mult);
        System.out.println("Ingrese su respuesta");
        resp=leer.nextInt();
        while(resp!=mult){
            System.out.println("Respuesta incorrecta, ingrese su respuesta nuevamente");
            resp=leer.nextInt();
            
            
        }
        System.out.println("Respuesta correcta, gracias x jugar");
    }

}