package week3.november29.classwork;

/*
 * Given an array of N elements, rotate array clockwise by K times without using extra space
 */

public class Question5 {

	public int[] rotateArray(int[] Array, int K) {
		
		//	If rotation is to be done more times than size of array, fix K to avoid ArrayIndexOutOfBoundsException
		//	If rotation is done K times, & K == Size of array. There is no point in rotating the array
		if(K > Array.length) {
			K = K % Array.length;
		}
		
		//	Step 1, Reverse entire array
		int start = 0, end = Array.length - 1;
		while(start <= end) {
			int temp = Array[start];
			Array[start] = Array[end];
			Array[end] = temp;
			start++;
			end--;
		}
		// Step 2, Reverse first K elements from the reversed array
		start = 0;
		end = K - 1;
		while(start <= end) {
			int temp = Array[start];
			Array[start] = Array[end];
			Array[end] = temp;
			start++;
			end--;
		}
		// Step 3, Reverse the remaining array from index K to end
		start = K;
		end = Array.length - 1;
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
