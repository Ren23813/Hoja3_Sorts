package sorts;
import java.util.ArrayList;

public class QuickSort <T extends Comparable <T>> implements IGenericSort<T> {
    
    // Para la lógica de QuickSort se utilizó como referencia a GeeksforGeeks

    @Override
    public T[] sort(T[] arr){
        int n = arr.length;
        quickSort(arr, 0, n-1);
        return arr;
    } 

    private void  quickSort(T[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(T[] arr, int low, int high){
        T pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++){
            if (arr[j].compareTo(pivot) <= 0){
                i++;

                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        

        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


 
}


