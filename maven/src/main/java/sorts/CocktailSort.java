package sorts;

public class CocktailSort<T extends Comparable<T>> implements IGenericSort<T> {

    // Para la lógica de QuickSort se utilizó como referencia a GeeksforGeeks

    /**
     * @param arr
     * @return T[]
     */
    @Override
    public T[] sort(T[] arr) {
        int n = arr.length;
        cocktailSort(arr);
        return arr;
    }

    private void cocktailSort(T[] a) {
        boolean swapped = true;
        int start = 0;
        int end = a.length;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end - 1; ++i) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    T temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    T temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            start = start + 1;
        }
    }

    void printArray(T[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
