package com.mycompany.adivinaelnumero;
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 10;
        
         System.out.println("Adivinemos un numero!!!");
         System.out.println("Debes adivinar un numero del 1 al 100");
         System.out.println(" ");

        while (intentos > 0) {
            System.out.println("Te quedan "+ intentos + " Intentos");
            System.out.print("Ingresa un numero: ");
            int numeroIntroducido = scanner.nextInt();
            intentos--;

            if (numeroIntroducido == numeroAleatorio) {
                System.out.println("Correcto! Adivinaste en "
                        +(10 - intentos) + " intentos.");
                return;
            } else if (numeroIntroducido < numeroAleatorio) {
                System.out.println("Mayor.");
            } else {
                System.out.println("Menor.");
            }
        }

        System.out.println("Perdiste. El número era " + numeroAleatorio);
    }
}
