package week15.march2.classwork;

/*
 * Given an array of N distinct elements, sort it using bubble sort.
 */

public class Question3 {
	
	public int[] bubbleSort(int[] Array) {
		
		for(int i = 0 ; i < Array.length ; i++) {
			for(int j = 0 ; j < Array.length - 1; j++) {
				if(Array[j] > Array[j + 1]) {
					int temp = Array[j];
					Array[j] = Array[j + 1];
					Array[j + 1] = temp;
				}
			}
		}
		return Array;
		
	}

}
