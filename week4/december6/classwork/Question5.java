package week4.december6.classwork;

/*
 * Print all subarray sums starting at index 2.
 */

public class Question5 {

	public void subarraySumIndex(int[] Array) {
		
		int index = 2;
		int sum = 0;
		for(int i = index ; i < Array.length ; i++) {
			sum += Array[i];
			System.out.print(sum + " ");
		}
		System.out.println();
		
	}

}
