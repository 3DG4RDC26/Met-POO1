package models;

public class EdadPromedio {

    private int[] edades;

    // Constructor
    public EdadPromedio(int[] edades) {
        this.edades = edades;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        int suma = 0;
        for (int edad : edades) {
            suma += edad;
        }

        return (double) suma / edades.length;
    }
}