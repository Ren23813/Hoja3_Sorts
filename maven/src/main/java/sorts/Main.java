package sorts;

import java.util.ArrayList;
import java.util.List;

public class Main<T> {

    /**
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> existingList = new ArrayList<>();
        Generador.loadNumsDesdeArchivo("numeros_random.txt", existingList); // Fue el código que se utilizó para generar
                                                                            // los 3000 números
                                                                            // random

        Main<Integer> main = new Main<>();
        RadixSort<Integer> radixSort = new RadixSort<>();
        GnomeSort<Integer> gnomeSort = new GnomeSort<>();
        MergeSort<Integer> mergeSort = new MergeSort<>();
        QuickSort<Integer> quickSort = new QuickSort<>();
        CocktailSort<Integer> cocktailSort = new CocktailSort<>();

        System.out.println("----------------------------------- SORT NUMBERS ----------------------------------- ");
        // Integer[] ordenado = {11,9,6,4444,55555,333,999999999,0};
        System.out.println("\n\n    RADIX SORT:");
        main.print(radixSort.sort(existingList.toArray(new Integer[0])));
        System.out.println("\n\n    GNOME SORT:");
        main.print(gnomeSort.sort(existingList.toArray(new Integer[0])));
        System.out.println("\n\n    MERGE SORT:");
        main.print(mergeSort.sort(existingList.toArray(new Integer[0])));
        System.out.println("\n\n    QUICK SORT:");
        main.print(quickSort.sort(existingList.toArray(new Integer[0])));
        System.out.println("\n\n    COCKTAIL SORT:");
        main.print(cocktailSort.sort(existingList.toArray(new Integer[0])));
    }

    void print(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
