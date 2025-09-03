package models;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números deseas ingresar? ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        InversorNumeros inversor = new InversorNumeros(numeros);
        int[] numerosInvertidos = inversor.obtenerInverso();

        System.out.println("\nNúmeros en orden inverso:");
        for (int num : numerosInvertidos) {
            System.out.println(num);
        }

        scanner.close();
    }
}