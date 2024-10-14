package exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class Exceptions {
    public static void main(String[] args) {
        File inputFile = new File("data.txt");
        File outputFile = new File("output.txt");

        try (
            FileReader fr = new FileReader(inputFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(outputFile);
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Leyendo: " + line);
                bw.write("Procesado: " + line);
                bw.newLine();
            }
            System.out.println("Datos procesados correctamente y guardados en output.txt");

        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ocurrió un error de E/S: " + e.getMessage());
        }
    }
}
