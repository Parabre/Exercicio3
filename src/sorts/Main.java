package sorts;

import java.util.Arrays;

public class Main {
 public static void main(String[] args) {
	 int vetor[]= { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
	 int vetorms[]= { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
	 int vetorqs[]= { 100, 15, 65, 65, 76, 3, 4, 6, 8, 89 };
	 int vetorrs[]= { 3, 4, 6, 8, 15, 65, 65, 76, 89, 100 };
	 
	 vetor = Sorts.bubbleSort(vetor);
	 vetorms= Sorts.mergeSort(vetorms);
	 vetorqs=sorts.Sorts.quickSort(vetorqs);
			 
	if(Arrays.equals(vetor,vetorrs)) {
		System.out.println("bs");
	}
	if(Arrays.equals(vetorrs,vetorqs)) {
		System.out.println("qs");
	}
	if(Arrays.equals(vetorms,vetorrs)) {
		System.out.println("ms");
	}
	for (int i : vetorms) {
		System.out.println(i);
	}
}
}
