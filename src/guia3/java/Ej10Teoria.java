
package guia3.java;

import java.util.Scanner;


public class Ej10Teoria {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cont = 0;

        do {
            System.out.println("Ingrese un valor");
            int num = leer.nextInt();

            if (num >= 1 && num <= 20) {

                cont++;
                System.out.print(num + " ");
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
                System.out.println("");

            } else {
                System.out.println("El número ingresado no es válido");
            }

        } while (cont != 4);
    }
}
