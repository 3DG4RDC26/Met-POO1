package models;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas edades deseas ingresar? ");
        int cantidad = scanner.nextInt();

        int[] edades = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa la edad #" + (i + 1) + ": ");
            int edad = scanner.nextInt();

            if (edad < 0) {
                System.out.println("Edad inválida. Intenta de nuevo.");
                i--;
                continue;
            }

            edades[i] = edad;
        }

        EdadPromedio calculadora = new EdadPromedio(edades);
        double promedio = calculadora.calcularPromedio();

        System.out.println("\nEl promedio de edades es: " + promedio);

        scanner.close();
    }
}