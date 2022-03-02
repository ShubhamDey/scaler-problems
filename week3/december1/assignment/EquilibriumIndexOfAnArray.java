package week3.december1.assignment;

import java.util.ArrayList;

/*
 * You are given an array A of integers of size N. Your task is to find the equilibrium index of the given array
 * Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * 
 * NOTE: Array indexing starts from 0. If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 */

public class EquilibriumIndexOfAnArray {

	public int solve(ArrayList<Integer> A) {
		
		int[] prefix = new int[A.size()];
		prefix[0] = A.get(0);
		for(int i = 1; i < A.size() ; i++) {
			prefix[i] = prefix[i -1] + A.get(i);
		}
		for(int i = 0 ; i < prefix.length ; i++) {
			int leftSum = 0;
			if(i > 0) {
				leftSum = prefix[i - 1];
			}
			int rightSum = prefix[prefix.length - 1] - prefix[i];
			if(leftSum == rightSum) {
				return i;
			}
		}
		return -1;
		
	}
	
}
