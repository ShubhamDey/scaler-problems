package week15.march2.classwork;

/*
 * Given an array of N distinct elements, sort it using insertion sort.
 */

public class Question4 {
	
	public int[] insertionSort(int[] Array) {
		
		for(int i = 1 ; i < Array.length ; i++) {
			int j, element = Array[i];
			for(j = i - 1 ; j >= 0 ; j--) {
				if(Array[j] > element) {
					Array[j + 1] = Array[j];
				}
				else {
					break;
				}
			}
			Array[j + 1] = element;
		}
		return Array;
		
	}

}
