package week15.march2.classwork;

/*
 * Given an array of N distinct elements & K, find the kth largest element.
 */

public class Question1 {
	
	public int stableSort(int[] Array, int K) {
		
		for(int i = 0 ; i < K ; i++) {
			int element = 0, index = 0;
			for(int j = 0 ; j < Array.length - i ; j++) {
				if(Array[j] > element) {
					element = Array[j];
					index = j;
				}
			}
			int temp = Array[Array.length - 1 - i];
			Array[Array.length - 1 - i] = element;
			Array[index] = temp;
		}
		return Array[Array.length - K];
		
	}

}
