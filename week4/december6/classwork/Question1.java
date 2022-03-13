package week4.december6.classwork;

/*
 * Given N array elements, print all subarrays.
 */

public class Question1 {
	
	public void subarray(int[] Array) {
		
		for(int i = 0 ; i < Array.length ; i++) {
			for(int j = i ; j < Array.length ; j++) {
				for(int k = i ; k <= j ; k++) {
					System.out.print(Array[k] + " ");
				}
				System.out.println();
			}
		}
		
	}

}
