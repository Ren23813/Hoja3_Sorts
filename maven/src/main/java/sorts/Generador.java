package sorts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Generador {

    /**
     * @param nombreArchivo
     */
    public static void generarRandoms(String nombreArchivo) {
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombreArchivo)))) {
            for (int i = 0; i < 3000; i++) {
                int randNum = random.nextInt(Integer.MAX_VALUE);
                writer.write(Integer.toString(randNum));
                writer.newLine();
            }
            System.out.println("Se han generado y guardado números aleatorios en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static Integer[] loadNumsDesdeArchivo(String nombreArchivo, List<Integer> existingList,
            int numberOfElements) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(nombreArchivo)))) {
            String line;

            int count = 0;

            while ((line = reader.readLine()) != null && count < numberOfElements) {
                existingList.add(Integer.parseInt(line.trim()));
                count++;
            }

        } catch (IOException e) {
            System.err.println("Se produjo error al intentar leer el archivo: " + e.getMessage());
        }
        return existingList.toArray(new Integer[0]);
    }
    
    public static void writeOrdenados(Integer lista [], String nombreArchivo){
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombreArchivo)))) {
            for (int i = 0; i < lista.length; i++) {
                writer.write(Integer.toString(lista[i]));
                writer.newLine();
            }
            System.out.println("Se han guardado los números ordenados en el archivo: " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}
