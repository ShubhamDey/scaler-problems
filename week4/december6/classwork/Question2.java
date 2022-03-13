package week4.december6.classwork;

/*
 * Print start & end index of all subarrays of length = K.
 */

public class Question2 {

	public void lengthKSubarrays(int[] Array, int K) {
		
		for(int i = 0 ; i < Array.length - K + 1 ; i++) {
			System.out.print("[" + i + ", " + (i + K - 1) + "] ");
		}
		System.out.println();
		
	}
	
}
