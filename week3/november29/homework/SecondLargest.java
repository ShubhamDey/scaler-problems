package week3.november29.homework;

/*
 * You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
 * 
 * NOTE: Return the second largest element. If no such element exist then return -1.
 */

public class SecondLargest {

	public int solve(int[] A) {
		
		if(A.length == 1) {
			return -1;
		}
		else {
			int largest = A[0], secondLargest = Integer.MIN_VALUE;
			for(int i = 1 ; i < A.length ; i++) {
				if(A[i] > largest) {
					secondLargest = largest;
					largest = A[i];
				}
				else if(A[i] > secondLargest && A[i] <= largest) {
					secondLargest = A[i];
				}
				
			}
			return secondLargest;
		}
		
	}
	
}
