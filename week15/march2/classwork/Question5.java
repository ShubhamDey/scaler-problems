package week15.march2.classwork;

/*
 * Given an array of size N, find the smallest subarray such that if we sort that subarray the complete array is sorted.
 */

public class Question5 {
	
	public int[] findSmallestSubarray(int[] Array) {
		
		int[] copy = Array.clone();
		for(int i = 0 ; i < copy.length ; i++) {
			for(int j = 0 ; j < copy.length - 1; j++) {
				if(copy[j] > copy[j + 1]) {
					int temp = copy[j];
					copy[j] = copy[j + 1];
					copy[j + 1] = temp;
				}
			}
		}
		int start = 0;
		while(copy[start] == Array[start]) {
			start++;
		}
		int end = copy.length - 1;
		while(copy[end] == Array[end]) {
			end--;
		}
		int[] result = new int[end - start + 1];
		int j = 0;
		for(int i = start ; i <= end ; i++) {
			result[j] = Array[i];
			j++;
		}
		return result;
		
	}

}
