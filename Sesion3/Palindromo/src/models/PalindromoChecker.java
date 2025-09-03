package models;

public class PalindromoChecker {

    public static boolean esPalindromo(String palabra) {
        palabra = palabra.replaceAll("\\s+", "").toLowerCase();

        int izquierda = 0;
        int derecha = palabra.length() - 1;

        while (izquierda < derecha) {
            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }
}