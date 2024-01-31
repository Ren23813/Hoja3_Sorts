
import java.util.*;

public class RadixSort<T extends Comparable<T>> implements IGenericSort<T> {

    /**
     * @param arr
     * @return T[]
     */
    // Obtenido de GeeksforGeeks

    @Override
    public T[] sort(T[] arr) {
        int n = arr.length;
        return radixsort(arr, n);

    }

    private T[] radixsort(T arr[], int n) {
        // Encuentra el número máximo para conocer el número de dígitos
        T mx = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i].compareTo(mx) > 0) {
                mx = arr[i];
            }
        }

        // Ordenamiento
        for (int exp = 1; (int) mx / exp > 0; exp *= 10) {
            ArrayList<T> output = new ArrayList<>(Collections.nCopies(n, null));
            int i;
            int count[] = new int[10];
            Arrays.fill(count, 0);

            // Contar la cantidad de ocurrencias de cada dígito
            for (i = 0; i < n; i++) {
                count[((int) arr[i] / exp) % 10]++;
            }

            // Modificar count[i] para que contenga la posición real del dígito en output
            for (i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Construir el ArrayList de salida
            for (i = n - 1; i >= 0; i--) {
                output.set(count[((int) arr[i] / exp) % 10] - 1, arr[i]);
                count[((int) arr[i] / exp) % 10]--;
            }

            // Se copian los elementos del ArrayList de salida al array original
            for (i = 0; i < n; i++) {
                arr[i] = output.get(i);
            }
        }
        return arr;
    }

}
