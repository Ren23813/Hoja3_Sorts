package sorts;

public class Main <T> {
    public static void main(String[] args) {
    Generador.generarRandoms("numeros_random.txt");       //Fue el código que se utilizó para generar los 3000 números random
    Integer[] randomNums = Generador.loadNumsDesdeArchivo("numeros_random.txt");;

    Main <Integer>main = new Main<>();
    RadixSort <Integer>radixSort = new RadixSort<>();
    GnomeSort <Integer>gnomeSort = new GnomeSort<>();
    MergeSort <Integer>mergeSort = new MergeSort<>();
    QuickSort <Integer>quickSort = new QuickSort<>();
    CocktailSort <Integer>cocktailSort = new CocktailSort<>();

    //Integer[] ordenado = {11,9,6,4444,55555,333,999999999,0};
    main.print(radixSort.sort(randomNums));
    System.out.println("");
    main.print(gnomeSort.sort(randomNums));
    System.out.println("");
    main.print(mergeSort.sort(randomNums));
    System.err.println("");
    main.print(quickSort.sort(randomNums));
    System.err.println("");
    main.print(cocktailSort.sort(randomNums));
    }

    void print(T arr[]) {
		for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
	}
}
