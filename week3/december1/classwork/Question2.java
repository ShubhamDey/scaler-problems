package week3.december1.classwork;

/*
 * Given N array elements & Q queries, count number of equilibrium index.
 * 
 * NOTE: An index (ith index) is call equilibrium index, if sum of elements of (0, i - 1) indices == sum of elements of (i + 1, N - 1) indices
 */

public class Question2 {
	
	public int equilibriumIndex(int[] Array) {
		
		int count = 0;
		int[] left = new int[Array.length];
		int[] right = new int[Array.length];
		int sum = 0;
		for(int i = 0 ; i < Array.length ; i++) {
			left[i] = sum;
			sum += Array[i];
		}
		sum = 0;
		for(int i = Array.length - 1 ; i >= 0 ; i--) {
			right[i] = sum;
			sum += Array[i];
		}
		for(int i = 0 ; i < Array.length ; i++) {
			if(left[i] == right[i]) {
				count++;
			}
		}
		return count;
		
	}

	public int equilibriumIndexAlternative(int[] Array) {
		
		int count = 0;
		int[] prefix = new int[Array.length];
		prefix[0] = Array[0];
		for(int i = 1 ; i < Array.length ; i++) {
			prefix[i] = prefix[i - 1] + Array[i];
		}
		for(int i = 0 ; i < Array.length ; i++) {
			int left = 0;
			if(i > 0) {
				left = prefix[i - 1];
			}
			int right = prefix[Array.length - 1] - prefix[i];
			if(left == right) {
				count++;
			}
		}
		return count;
		
	}
	
}
