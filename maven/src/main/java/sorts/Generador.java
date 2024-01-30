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

    public static void generarRandoms(String nombreArchivo){
        Random random = new Random();
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nombreArchivo)))) {
            for (int i = 0; i < 3000; i++) {
                int randNum = random.nextInt(); 
                writer.write(Integer.toString(randNum)); 
                writer.newLine(); 
            }
            System.out.println("Se han generado y guardado números aleatorios en el archivo " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static Integer[] loadNumsDesdeArchivo(String nombreArchivo) {
        List<Integer> numeros = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(nombreArchivo)))) {
            String line;

            while((line = reader.readLine()) != null){
                numeros.add(Integer.parseInt(line.trim()));
            }

        } 
        catch (IOException e){
            System.err.println("Se produjo error al intentar leer el archivo: " + e.getMessage());
        }
        return numeros.toArray(new Integer[0]);
    }
}

