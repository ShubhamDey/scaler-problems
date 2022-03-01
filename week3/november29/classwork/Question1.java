package week3.november29.classwork;

/*
 * Given N array elements, count number of elements having atleast 1 element greater than itself
 */

public class Question1 {

	public int countElements(int[] Array) {
		
		int maxCount = 0, maxElement = Integer.MIN_VALUE;
		for(int i = 0 ; i < Array.length ; i++) {
			if(Array[i] >= maxElement) {
				maxElement = Array[i];
			}
		}
		for(int i = 0 ; i < Array.length ; i++) {
			if(Array[i] == maxElement) {
				maxCount++;
			}
		}
		return Array.length - maxCount;
		
	}
	
	public int countElementsAlternative(int[] Array) {
		
		int maxCount = 0, maxElement = Integer.MIN_VALUE;
		for(int i = 0 ; i < Array.length ; i++) {
			if(Array[i] > maxElement) {
				maxElement = Array[i];
				maxCount = 1;
			}
			else if(Array[i] == maxElement) {
				maxCount++;
			}
		}
		return Array.length - maxCount;
		
	}
	
}
