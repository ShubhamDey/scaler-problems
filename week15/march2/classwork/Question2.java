package week15.march2.classwork;

/*
 * Given an array of N distinct elements, sort it using selection sort.
 */

public class Question2 {
	
	public int[] selectionSort(int[] Array) {
		
		for(int i = 0 ; i < Array.length ; i++) {
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
		return Array;
		
	}

}
