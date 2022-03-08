package week15.march2.assignment;

import java.util.ArrayList;

/*
 * Given an array A of size N, groot wants you to pick 2 indices i and j such that
 * 1) 1 <= i, j <= N
 * 2) A[i] % A[j] is maximum among all possible pairs of (i, j).
 * Help Groot in finding the maximum value of A[i] % A[j] for some i, j.
 */

public class MaxMod {

	public int solve(ArrayList<Integer> A) {
    
		for(int i = 0 ; i < A.size() ; i++) {
			for(int j = 0 ; j < A.size() - 1 ; j++) {
				if(A.get(j) > A.get(j + 1)) {
					int temp = A.get(j);
					A.set(j, A.get(j + 1));
					A.set(j + 1, temp);
				}
			}
		}
		int j = A.size() - 1;
		int i = A.size() - 2;
		int k;
		for(k = i ; k >= 0 ; k--) {
			if(A.get(j) > A.get(k)) {
				break;
			}
		}
		if(k != -1) {
			return A.get(k) % A.get(j);
		}
		else {
			return A.get(i) % A.get(j);
		}
	
	}
	
}
