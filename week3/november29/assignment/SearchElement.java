package week3.november29.assignment;

import java.util.ArrayList;

/*
 * You are given an integer T (Number of test cases).
 * For each test case, you are given array A and an integer B. You have to tell whether B is present in array A or not.
 * 
 * NOTE: For each test case, print on a separate line 1 if the element exists, else print 0.
 */

public class SearchElement {

	public int solve(int T, ArrayList<ArrayList<Integer>> A, int B) {
		
		for(int i = 0 ; i < T ; i++) {
			for(int j = 0 ; j < A.get(0).size() ; j++) {
				if(A.get(i).get(j) == B) {
					return 1;
				}
			}
		}
		return 0;
		
	}
	
}
