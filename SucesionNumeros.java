package com.mycompany.sucesionnumeros;

public class SucesionNumeros {

    public static void main(String[] args) {
        int numerosImprimir = 50;
        long numeroAnterior = 0, numeroActual = 1, numeroSiguiente;
        
        System.out.println("Los primeros 50 números de la sucesión de Fibonacci son:");
        System.out.print(numeroAnterior + "\n" + numeroActual + "\n");
        
        for (int i = 0; i <= numerosImprimir; i++) {
            numeroSiguiente = numeroAnterior + numeroActual;
            System.out.print(numeroSiguiente + "\n");
            numeroAnterior = numeroActual;
            numeroActual = numeroSiguiente;
        }
    }
}
