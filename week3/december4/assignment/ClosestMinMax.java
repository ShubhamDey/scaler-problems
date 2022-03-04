package week3.december4.assignment;

import java.util.ArrayList;

/*
 * Given an A A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the A
 * and at least one occurrence of the minimum value of the A.
 */

public class ClosestMinMax {
	
	public int solve(ArrayList<Integer> A) {
		
		int length = A.size();
		int minElement = A.get(0), maxElement = A.get(0);
		for(int i = 1 ; i < A.size() ; i++) {
			minElement = Math.min(minElement, A.get(i));
			maxElement = Math.max(maxElement, A.get(i));
		}
		if(maxElement == minElement) {
			return 1;
		}
		int minIndex = -1, maxIndex = -1;
		for(int i = 0 ; i < A.size() ; i++) {
			if(A.get(i) == minElement) {
				minIndex = i;
				if(maxIndex != -1) {
					length = Math.min(length, minIndex - maxIndex + 1);
				}
			}
			else if(A.get(i) == maxElement) {
				maxIndex = i;
				if(minIndex != -1) {
					length = Math.min(length, maxIndex - minIndex + 1);
				}
			}
		}
		return length;
		
	}

}
