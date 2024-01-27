package sorts;
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
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
}

