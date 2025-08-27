import model.Estudiante;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Universidad Americana");

        int edad;
        edad = 18;
        System.out.println("Mi edad es: " + edad);
        float promedioPOO1;
        promedioPOO1 = 100f;
        float PromedioPOO1;
        PromedioPOO1 = 90f;
        System.out.println("Mi nota es " + promedioPOO1);
        System.out.println("Mi nota es " + PromedioPOO1);

        double PI = 3.14;
        System.out.println("El valor PI es: " + PI);

        Scanner input = new Scanner(System.in);
        String Nombre;
        System.out.print("Ingrese el nombre: ");
        Nombre = input.nextLine();

        System.out.println("El nombre es: " + Nombre);

        Estudiante Edgard = new Estudiante();
        Edgard.setNombre("Edgard");
        Edgard.setApellidos("Casco");
        Edgard.setCarrera("Ing Sistemas");
        Edgard.setNota(100f);

        System.out.println("El Estudiante es: " + Edgard.getNombre() + " " + Edgard.getApellidos() + "de la carrera" + Edgard.getCarrera() + " " + Edgard.getNota() + "en POO1");


    }
}
