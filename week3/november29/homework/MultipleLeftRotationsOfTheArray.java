package week3.november29.homework;

import java.util.ArrayList;

/*
 * Given an array of integers A and multiple values in B which represents number of times array A needs to be left rotated.
 * 
 * Find the rotated array for each value and return the result in the from of a matrix
 * where i'th row represents the rotated array for the i'th value in B.
 */

public class MultipleLeftRotationsOfTheArray {
	
	public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(int i = 0 ; i < B.size() ; i++) {
			int times = B.get(i) % A.size();
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j = times ; j < A.size() ; j++) {
				temp.add(A.get(j));
			}
			for(int j = 0 ; j < times ; j++) {
				temp.add(A.get(j));
			}
			result.add(temp);
		}
		return result;
		
	}

}
