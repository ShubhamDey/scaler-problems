package week3.november29.homework;

import java.util.ArrayList;

/*
 * You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
 * You have to put the odd and even elements of array A in 2 separate arrays and print the new arrays.
 * 
 * NOTE: Array elements should have same relative order as in A.
 */

public class SeperateOddEven {

	public ArrayList<ArrayList<Integer>> solve(int T, ArrayList<ArrayList<Integer>> A){
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(int i = 0 ; i < T ; i++) {
			ArrayList<Integer> odd = new ArrayList<Integer>();
			ArrayList<Integer> even = new ArrayList<Integer>();
			for(int j = 0 ; j < A.get(i).size() ; j++) {
				if(A.get(i).get(j) % 2 == 0) {
					even.add(A.get(i).get(j));
				}
				else {
					odd.add(A.get(i).get(j));
				}
			}
			result.add(odd);
			result.add(even);
		}
		return result;
		
	}
	
}
