package week3.november29.classwork;

/*
 * Given N array elements and start & end indexes, reverse entire array from start index to end index
 */

public class Question4 {

	public int[] reverseArrayStartEnd(int[] Array, int start, int end) {
		
		while(start <= end) {
			int temp = Array[start];
			Array[start] = Array[end];
			Array[end] = temp;
			start++;
			end--;
		}
		return Array;
		
	}
	
}
