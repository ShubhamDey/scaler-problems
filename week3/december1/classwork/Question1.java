package week3.december1.classwork;

/*
 * Given N array elements & Q queries, for each query calculate sum of all elements in given range of L to R.
 */

public class Question1 {

	public int[] rangeSum(int[] Array, int[][] Q) {
		
		int[] prefix = new int[Array.length];
		prefix[0] = Array[0];
		for(int i = 1 ; i < Array.length ; i++) {
			prefix[i] = prefix[i - 1] + Array[i];
		}
		int[] result = new int[Q.length];
		for(int i = 0 ; i < Q.length ; i++) {
			int left = Q[i][0];
			int right = Q[i][1];
			if(left == 0) {
				result[i] = prefix[right];
			}
			else {
				result[i] = prefix[right] - prefix[left - 1];
			}
		}
		return result;
		
	}
	
}
