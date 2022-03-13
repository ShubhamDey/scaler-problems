package week4.december6.classwork;

/*
 * In how many subarrays index i is present
 */

public class Question6 {

	public int subarrayIndex(int[] Array, int index) {
		
		int count = (index + 1) * (Array.length - index);
		return count;
		
	}

}
