import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import Animal.Animal;
import Calculadora.Calculadora;
import DividirPorZeroExceptions.DividirPorZeroExceptions;
import Gato.Gato;
import Person.Person;
import PersonCompare.PersonCompare;
import newTest.NewTest;

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

        // ----------------------EXCEPCIONES --------------------------------

        // int numero1 = 10;
        // int numero2 = 0;
        // int resultado;

        // Calculadora calculadora = new Calculadora();

        // try {
        // resultado = calculadora.dividir(numero1, numero2);
        // System.out.println(resultado);
        // } catch (DividirPorZeroExceptions e) { // antes estaba el Exception, ahora
        // ponemos nuestra propia excepcion
        // e.printStackTrace();
        // System.out.println("Esto va despues de la excepcion ");
        // } finally { // sin importar que pase el try o el catch, se ejecuta
        // System.out.println("---------Se ejecuta de todas formas----------");
        // }

        // -------------------------- COLECCIONES --------------------------------------

        // SET ---------
        // Set<String> superheroes = new HashSet<>(); No Org
        // Set<String> superheroes = new TreeSet<>(); Orden Natural abc o int menor a
        // mayor
        // Set<String> superheroes = new LinkedHashSet<>(); // Orden de insercion
        // superheroes.add("Spiderman");
        // superheroes.add("Batman");
        // superheroes.add("Superman");
        // superheroes.add("Ironman");
        // superheroes.add("Thor");
        // superheroes.add("Starlord");

        // superheroes.add("Hulk");
        // if (superheroes.contains("Batman")) {
        // System.out.println("Esta en la fiesta");
        // }

        // superheroes.remove("Spiderman");

        // if (!superheroes.contains("Spiderman")) {
        // System.out.println("No esta en la fiesta");
        // }

        // superheroes.add("Hulk"); // No acepta duplicados entonces lo omite

        // if (superheroes.isEmpty()) {
        // System.out.println("La fiesta termino");
        // } else {
        // System.out.println("La fiesta sigue " + superheroes.size() + " supers");
        // }

        // for (String superHeroe : superheroes) {
        // System.out.println("Esta en la fiesta " + superHeroe);
        // }

        // LIST --------------
        // List<String> superheroes = new ArrayList<>(); // Ordenada, eficiente para get
        // y sets
        List<String> superheroes = new LinkedList<>(); // la modificacion sea muy
        // rapida
        // List<String> superheroes = new Vector<>(); // Sirve para multihilo, que se
        // haga todo de forma sincronizada
        superheroes.add("Spiderman");
        superheroes.add("Batman");
        superheroes.add("Superman");
        superheroes.add("Ironman");
        superheroes.add("Thor");
        superheroes.add("Starlord");

        superheroes.add("Hulk");

        // Collections.sort(superheroes);

        if (superheroes.contains("Batman")) {
        System.out.println("Esta en la fiesta");
        }

        // superheroes.remove("Spiderman");
        superheroes.remove(1); // por indice tamb se puede borrar

        superheroes.set(1, "Bruce Wayne"); // modifica x indice

        if (!superheroes.contains("Spiderman")) {
        System.out.println("No esta en la fiesta");
        }

        superheroes.add("Hulk"); // No acepta duplicados entonces lo omite

        if (superheroes.isEmpty()) {
        System.out.println("La fiesta termino");
        } else {
        System.out.println("La fiesta sigue " + superheroes.size() + " supers");
        }

        for (String superHeroe : superheroes) {
        System.out.println("Esta en la fiesta " + superHeroe);
        }

        superheroes.sort(null);

        // MAP ----------------
        // doble valor
        // Map<String, Integer> inventario = new TreeMap<>(); // orden alfabetico
        // Map<String, Integer> inventario = new LinkedHashMap<>(); // orden agregado
        // Map<String, Integer> inventario = new HashMap<>(); // sin orden
        // inventario.put("Banana", 100);
        // inventario.put("Lechuga", 150);
        // inventario.put("Tomate", 150);
        // inventario.put("Naranja", 120);

        // System.out.println("Inventario :");

        // // keySet nos da un array con todas las keys (string)
        // for (String fruta : inventario.keySet()) {
        // System.out.println(fruta + " Precio : $"+inventario.get(fruta)); //
        // inventario.get(fruta); //la clave (double)
        // }

        // String frutaBuscada = "Naranja";
        // if (inventario.containsKey(frutaBuscada)) {
        // System.out.println("Si se encontro la fruta " + frutaBuscada);
        // inventario.remove(frutaBuscada);
        // System.out.println("-----------------------");
        // for (String fruta : inventario.keySet()) {
        // System.out.println(fruta + " Precio : $"+inventario.get(fruta)); //
        // inventario.get(fruta); //la clave (double)
        // }
        // } else {
        // System.out.println("No se encontro la fruta");
        // }

        // ORDENAMIENTO ---------------

        NewTest test1 = new NewTest("hola", "chau");
        NewTest test2 = new NewTest("hola", "chau");
        NewTest test3 = new NewTest("chau", "chau");
        // PersonCompare edad1 = new PersonCompare(43);
        // PersonCompare edad2 = new PersonCompare(40);


        if (test1.equals(test3)) {
            System.out.println("Son iguales");
        } else System.out.println("no son iguales");

        // System.out.println(edad1.compareTo(edad2)); // si da 0 son iguales
    }
}
