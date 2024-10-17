package Validacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validacion {
    Scanner scanner = new Scanner(System.in);
    int edad = -1;
    boolean correct = false;

    public int validacion(){
        while (!correct) {
            try {
                System.out.println("Inrese su edad 0 a 120: ");
                edad = scanner.nextInt();
                if (edad >= 0 && edad <= 120) {
                    correct = true;
                } else System.out.println("edad de 0 a 120");
            } catch (InputMismatchException e) {
                System.out.println("ingrese un entero");
                System.out.println(e);
                scanner.next();
            }
        }
        System.out.println("la edad es de :" + edad + " años");
        return edad;
    }
}
