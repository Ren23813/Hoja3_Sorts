package sorts;

import java.util.ArrayList;

public class MergeSort<T extends Comparable<T>> implements IGenericSort<T> {

	/**
	 * @param arr
	 * @return T[]
	 */
	// Basado en GeeksforGeeks

	@Override
	public T[] sort(T[] arr) {
		int n = arr.length;
		return mergeSort(arr, 0, n - 1);
	}

	private void merge(T arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		ArrayList<T> helpList = new ArrayList<>();
		ArrayList<T> helpList2 = new ArrayList<>();

		for (int i = 0; i < n1; ++i)
			helpList.add(arr[l + i]);
		for (int j = 0; j < n2; ++j)
			helpList2.add(arr[m + 1 + j]);

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (helpList.get(i).compareTo(helpList2.get(j)) < 0 || helpList.get(i).compareTo(helpList2.get(j)) == 0) {
				arr[k] = helpList.get(i);
				i++;
			} else {
				arr[k] = helpList2.get(j);
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = helpList.get(i);
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = helpList2.get(j);
			j++;
			k++;
		}
	}

	private T[] mergeSort(T arr[], int l, int r) {
		if (l < r) {

			// Encontrar punto medio
			int m = l + (r - l) / 2;

			// Ordenar mitades
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			// Hacer merge a las mitades
			merge(arr, l, m, r);
		}
		return arr;
	}
}
