package sorts;

public class Sorts {
	public static int[] bubbleSort(int[] vetor) {
	    for(int i = 0; i < vetor.length - 1; i++) {
	      for(int j = 0; j < vetor.length - 1 - i; j++) {
	        if(vetor[j] > vetor[j + 1]) {
	          int aux = vetor[j];
	          vetor[j] = vetor[j + 1];
	          vetor[j + 1] = aux;
	        }
	      }
	    }
	    return vetor;
	}
	
	public static int[] mergeSort(int vetor[]) {
		ms(vetor,vetor.length);
		return vetor;
	}
	
	private static void ms(int [] arr, int len){
	      if (len < 2){return;}
	      
	      int mid = len / 2;
	      int [] left_arr = new int[mid];
	      int [] right_arr = new int[len-mid];
	      
	      int k = 0;
	      for(int i = 0;i<len;++i){
	          if(i<mid){
	              left_arr[i] = arr[i];
	          }
	          else{
	              right_arr[k] = arr[i];
	              k = k+1;
	          }
	      }
	      ms(left_arr,mid);
	      ms(right_arr,len-mid);
	      
	      merge(left_arr,right_arr,arr,mid,len-mid);
	  }
	
	private static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){ 
	      int i=0,l=0,r = 0;
	
	      while(l<left_size && r<right_size){
	          
	          if(left_arr[l]<right_arr[r]){
	              arr[i++] = left_arr[l++];
	          }
	          else{
	              arr[i++] = right_arr[r++];
	          }
	      }
	      while(l<left_size){
	          arr[i++] = left_arr[l++];
	      }
	      while(r<right_size){
	        arr[i++] = right_arr[r++];
	      }
	  }
	
	public static int[] quickSort(int vetor[]) {
		qs(vetor,0,vetor.length-1);
		return vetor;
	}
	
	private static void qs(int v[], int esquerda, int direita) {
		int esq = esquerda;
		int dir = direita;
		int pivo = v[(esq + dir) / 2];
		int troca;

		while (esq <= dir) {
			while (v[esq] < pivo) {
				esq = esq + 1;
			}
			while (v[dir] > pivo) {
				dir = dir - 1;
			}
			if (esq <= dir) {
				troca = v[esq];
				v[esq] = v[dir];
				v[dir] = troca;
				esq = esq + 1;
				dir = dir - 1;
			}
		}
		if (dir > esquerda)
			qs(v, esquerda, dir);

		if (esq < direita)
			qs(v, esq, direita);

	}
	
}
