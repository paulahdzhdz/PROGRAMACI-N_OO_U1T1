package com.mycompany.calcularpagosmensuales;
import java.util.Scanner;

public class CalcularPagosMensuales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de meses a pagar: ");
        int numeroMeses = scanner.nextInt();

        double pagoMensual = 100.0;
        double totalPagado = 0;

        for (int i = 1; i <= numeroMeses; i++) {
            System.out.println("Mes " + i + ": $" + pagoMensual);
            totalPagado += pagoMensual;
            pagoMensual *= 2; 
        }

        System.out.println("\nMonto total pagado despues de " 
                + numeroMeses + " meses: $" + totalPagado);
    }
}
