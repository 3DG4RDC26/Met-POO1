package run;

import models.Person;

public class Main {

    public static void main(String[] args) {
        Person persona = new Person();

        persona.firstName = "Juan";
        persona.setLastName("Rivas");
        persona.setCountry("Nicaragua");
        System.out.println(persona.toString());


    }
}
