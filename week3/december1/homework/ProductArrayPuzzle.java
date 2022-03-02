package week3.december1.homework;

import java.util.ArrayList;

/*
 * Given an array of integers A, find and return the product array of same size where i'th element of the product array
 * will be equal to the product of all the elements divided by the i'th element of the array.
 * 
 * Note: It is always possible to form the product array with integer (32 bit) values.
 */

public class ProductArrayPuzzle {

	public ArrayList<Integer> solve(ArrayList<Integer> A) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		int totalProduct = 1;
		for(int i = 0 ; i < A.size() ; i++) {
			totalProduct *= A.get(i);
		}
		for(int i = 0 ; i < A.size() ; i++) {
			result.add(totalProduct / A.get(i));
		}
		return result;
		
	}
	
}
