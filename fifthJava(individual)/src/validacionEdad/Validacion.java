package validacionEdad;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Validacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = leerEdadValida(scanner);
        System.out.println("Edad válida ingresada: " + edad);
    }
    public static int leerEdadValida(Scanner scanner) {
        int edad = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingresa tu edad (entre 0 y 120): ");
                edad = scanner.nextInt();

                if (edad >= 0 && edad <= 120) {
                    entradaValida = true;
                } else {
                    System.out.println("Error: La edad debe estar entre 0 y 120. Inténtalo nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor ingresa un número entero válido.");
                scanner.next(); 
            }
        }
        return edad;
    }
}

