package week4.december6.classwork;

/*
 * Print total sum of all subarrays using contribution technique
 */

public class Question7 {

	public int contributionTech(int[] Array) {
		
		int sum = 0;
		for(int i = 0 ; i < Array.length ; i++) {
			int left = i + 1;
			int right = Array.length - i;
			sum += left * right * Array[i];
		}
		return sum;
		
	}

}
