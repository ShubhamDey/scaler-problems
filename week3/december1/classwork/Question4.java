package week3.december1.classwork;

/*
 * Given N array elements & Q queries, for each query calculate sum of all odd indices in given range.
 */

public class Question4 {
	
	public int[] oddIndexRangeSum(int[] Array, int[][] Q) {
		
		int[] result = new int[Q.length];
		int[] prefixOdd = new int[Array.length];
		prefixOdd[0] = 0;
		for(int i = 1 ; i < Array.length ; i++) {
			if(i % 2 != 0) {
				prefixOdd[i] = prefixOdd[i - 1] + Array[i];
			}
			else {
				prefixOdd[i] = prefixOdd[i - 1];
			}
		}
		for(int i = 0 ; i < Q.length ; i++) {
			int left = Q[i][0];
			int right = Q[i][1];
			if(left == 0) {
				result[i] = prefixOdd[right];
			}
			else {
				result[i] = prefixOdd[right] - prefixOdd[left - 1];
			}
		}
		return result;
		
	}
	
}
