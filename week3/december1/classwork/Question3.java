package week3.december1.classwork;

/*
 * Given N array elements & Q queries, for each query calculate sum of all even indices in given range.
 */

public class Question3 {
	
	public int[] evenIndexRangeSum(int[] Array, int[][] Q) {
		
		int[] result = new int[Q.length];
		int[] prefixEven = new int[Array.length];
		prefixEven[0] = Array[0];
		for(int i = 1 ; i < Array.length ; i++) {
			if(i % 2 == 0) {
				prefixEven[i] = prefixEven[i - 1] + Array[i];
			}
			else {
				prefixEven[i] = prefixEven[i - 1];
			}
		}
		for(int i = 0 ; i < Q.length ; i++) {
			int left = Q[i][0];
			int right = Q[i][1];
			if(left == 0) {
				result[i] = prefixEven[right];
			}
			else {
				result[i] = prefixEven[right] - prefixEven[left - 1];
			}
		}
		return result;
		
	}
	
}
