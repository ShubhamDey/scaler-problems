package week3.december4.classwork;

/*
 * Given an array of N elements, you have to find all the leaders in the array. An element is a leader if it is strictly greater than all the 
 * elements on it's right side.
 * 
 *  NOTE: The last element Array[N - 1] is always considered as a leader.
 */

public class Question2 {
	
	public int leaders(int[] Array) {
		
		int count = 1, max = Array[Array.length - 1];
		for(int i = Array.length - 2 ; i >= 0 ; i--) {
			if(Array[i] > max) {
				max = Array[i];
				count++;
			}
		}
		return count;
		
	}
	
	public int leadersAlternative(int[] Array) {
		
		int count = 0;
		for(int i = 0 ; i < Array.length ; i++) {
			int element = Array[i], max = Array[i];
			for(int j = i + 1 ; j < Array.length ; j++) {
				max = Math.max(max, Array[j]);
			}
			if(element == max) {
				count++;
			}
		}
		return count;
		
	}

}
