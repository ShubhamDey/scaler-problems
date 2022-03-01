package week3.november29.classwork;

/*
 * Given an array, reverse entire array without using extra space
 */

public class Question3 {

	public int[] reverseArray(int[] Array) {
		
		int start = 0, end = Array.length - 1;
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
