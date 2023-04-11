
package guia3.java;

import java.util.Scanner;

public class Ej9Extra {

    public static void main(String[] args) {
Scanner read=new Scanner(System.in);

        System.out.println("Ingrese el dividendo");
        
double cont1;
double num1, num2, aux;
cont1= 0;
num1 = read.nextDouble();
System.out.println("Ingrese el divisor");
num2 = read.nextDouble();
  aux = num1;
while(aux>=num2){
    aux = aux-num2;
    cont1++;
}
        System.out.println("El cociente es "+ cont1+ "el residuo es "+ aux);
    
}
}