package sorts;
import java.util.ArrayList;
import java.util.Collections; 

public class GnomeSort <T extends Comparable <T>> implements IGenericSort<T>{		//Basado en GeeksforGeeks
	
    @Override
    public T[] sort(T[] arr) {
        int n = arr.length;
        return gnomeSort(arr, n);
    } 
    
    private T[] gnomeSort(T arr[], int n) 
	{ 
		int index = 0; 

		while (index < n) { 
			if (index == 0) 
				index++; 
			if (arr[index].compareTo(arr[index - 1])>0||arr[index].compareTo(arr[index-1])==0) 
				index++; 
			else { 
                ArrayList<T> helpList = new ArrayList<>(Collections.nCopies(n, null));
                helpList.add(arr[index]);
				arr[index] = arr[index - 1]; 
				arr[index - 1] = helpList.get(helpList.size()-1); 
				index--; 
			} 
		} 
		return arr; 
	}    
} 
