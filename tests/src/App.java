import java.util.Scanner;

import Animal.Animal;
import Gato.Gato;
import Person.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // Person persona = new Person("Guido", "Morabito", 24);
        // persona.setApellido("Kamado");
        // persona.setNombre("Tanshiro");
        // persona.setEdad(18);

        // System.out.println(persona.saludo());
    
        // Gato gatito = new Gato("Siames", 8, false);
        // System.out.println(gatito.hacerSonido());

        // Animal animal = new Animal("vaca", 10, false);
        // System.out.println(animal.hacerSonido());

        // System.out.println(animal.getCantidad());


        int numero1 = 5;
        int numero2 = 0;
        int resultado;

        try {
            resultado = numero1 / numero2;
            System.out.println(resultado);
        } catch (Exception e) {
            e.printStackTrace();
            numero2 = 5;
            resultado = numero1 / numero2;
            System.out.println("Esto va despues de la excepcion " + resultado);
        }
    }
}
