package week3.november29.assignment;

/*
 * Write a program to print maximum and minimum elements of the input array A.
 */

public class MaxAndMinOfAnArray {

	public int[] solve(int[] A) {
		
		int[] result = new int[2];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for(int i = 0 ; i < A.length ; i++) {
			max = Math.max(max, A[i]);
			min = Math.min(min, A[i]);
		}
		result[0] = max;
		result[1] = min;
		return result;
		
	}
	
}
