package com.mycompany.alumnomayorpromedio;
import java.util.Scanner;

public class AlumnoMayorPromedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAlumnos = 20;
        int[] numeroControl = new int[numeroAlumnos];
        double[] promedios = new double[numeroAlumnos];

        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.print("Ingrese el numero de control del alumno " + (i + 1) + ": ");
            numeroControl[i] = scanner.nextInt();

            double calificaciones = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese la calificacion de la unidad " + (j + 1) + ": ");
                calificaciones += scanner.nextDouble();
            }
            promedios[i] = calificaciones / 5; 
        }

        int  mayorPromedio= 0;
        for (int i = 1; i < numeroAlumnos; i++) {
            if (promedios[i] > promedios[mayorPromedio]) {
                mayorPromedio = i;
            }
        }

        System.out.println("\nEl alumno con el mayor promedio Tiene el numero de control " 
            + numeroControl[mayorPromedio] + " con un promedio de " + promedios[mayorPromedio]);

    }
}
