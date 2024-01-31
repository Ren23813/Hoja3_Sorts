import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class SortingTest {
    @Test  
    public void ordenCorrectoGnomeSort(){
        List<Integer> checkList1 = new ArrayList<>();
        List<Integer> checkList2 = new ArrayList<>();
        GnomeSort <Integer> gnomeSort = new GnomeSort<>();
        assertArrayEquals(Generador.loadNumsDesdeArchivo("numeros_ordenados.txt", checkList1, 3000), gnomeSort.sort(Generador.loadNumsDesdeArchivo("numeros_random.txt", checkList2, 3000)));  
    } 

    @Test  
    public void ordenCorrectoRadixSort(){
        RadixSort <Integer> radixSort = new RadixSort<>();
        List<Integer> almacen1 = new ArrayList<>();
        List<Integer> almacen2 = new ArrayList<>();
       

        Integer[] checkList1 = new Integer[3000];
        Integer[] checkList2 = new Integer[3000];
        checkList1 = Generador.loadNumsDesdeArchivo("numeros_ordenados.txt", almacen1, 3000);
        checkList2 = radixSort.sort(Generador.loadNumsDesdeArchivo("numeros_random.txt", almacen2, 3000));
        assertTrue(checkList1[0].equals(checkList2[0]));
    } 

    @Test  
    public void ordenCorrectoCocktailSort(){
        List<Integer> checkList1 = new ArrayList<>();
        List<Integer> checkList2 = new ArrayList<>();
        CocktailSort <Integer> cocktailSort = new CocktailSort<>();
        assertArrayEquals(Generador.loadNumsDesdeArchivo("numeros_ordenados.txt", checkList1, 3000), cocktailSort.sort(Generador.loadNumsDesdeArchivo("numeros_random.txt", checkList2, 3000)));  
    } 

    @Test  
    public void ordenCorrectoMergeSort(){
        List<Integer> checkList1 = new ArrayList<>();
        List<Integer> checkList2 = new ArrayList<>();
        MergeSort <Integer> mergeSort = new MergeSort<>();
        assertArrayEquals(Generador.loadNumsDesdeArchivo("numeros_ordenados.txt", checkList1, 3000), mergeSort.sort(Generador.loadNumsDesdeArchivo("numeros_random.txt", checkList2, 3000)));  
    } 

    @Test  
    public void ordenCorrectoQuickSort(){
        List<Integer> checkList1 = new ArrayList<>();
        List<Integer> checkList2 = new ArrayList<>();
        QuickSort<Integer> quickSort = new QuickSort<>();
        assertArrayEquals(Generador.loadNumsDesdeArchivo("numeros_ordenados.txt", checkList1, 3000), quickSort.sort(Generador.loadNumsDesdeArchivo("numeros_random.txt", checkList2, 3000)));  
    } 
}
