package models;

public class InversorNumeros {

    private int[] numeros;

    public InversorNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] obtenerInverso() {
        int[] invertido = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }

        return invertido;
    }
}