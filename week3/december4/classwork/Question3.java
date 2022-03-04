package week3.december4.classwork;

/*
 * Given an array find the length of smallest subarray which contains both min & max of the array.
 */

public class Question3 {
	
	public int minMax(int[] Array) {
		
		int length = Array.length;
		int minElement = Array[0], maxElement = Array[0];
		for(int i = 1 ; i < Array.length ; i++) {
			minElement = Math.min(minElement, Array[i]);
			maxElement = Math.max(maxElement, Array[i]);
		}
		if(maxElement == minElement) {
			return 1;
		}
		int minIndex = -1, maxIndex = -1;
		for(int i = 0 ; i < Array.length ; i++) {
			if(Array[i] == minElement) {
				minIndex = i;
				if(maxIndex != -1) {
					length = Math.min(length, minIndex - maxIndex + 1);
				}
			}
			else if(Array[i] == maxElement) {
				maxIndex = i;
				if(minIndex != -1) {
					length = Math.min(length, maxIndex - minIndex + 1);
				}
			}
		}
		return length;
		
	}
	
	public int minMaxAlternative(int[] Array) {
		
		int length = Integer.MAX_VALUE;
		int minElement = Array[0], maxElement = Array[0];
		for(int i = 1 ; i < Array.length ; i++) {
			minElement = Math.min(minElement, Array[i]);
			maxElement = Math.max(maxElement, Array[i]);
		}
		if(maxElement == minElement) {
			return -1;
		}
		for(int i = 0 ; i < Array.length ; i++) {
			if(Array[i] == minElement) {
				for(int j = i + 1 ; j < Array.length ; j++) {
					if(Array[j] == maxElement) {
						length = Math.min(length, j - i + 1);
						break;
					}
				}
			}
			else if(Array[i] == maxElement) {
				for(int j = i + 1 ; j < Array.length ; j++) {
					if(Array[j] == minElement) {
						length = Math.min(length, j - i + 1);
						break;
					}
				}
			}
		}
		return length;
		
	}

}
