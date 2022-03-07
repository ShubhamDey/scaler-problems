package week15.march2.classwork;

import java.util.ArrayList;

/*
 * Given an array of size N, sort the given array.
 * 
 * NOTE : All odd & even valued elements are present in sorted order in the array
 */

public class Question6 {
	
	public int[] sortArray(int[] Array) {
		
		ArrayList<Integer> odd = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		for(int i = 0 ; i < Array.length ; i++) {
			if(Array[i] % 2 == 0) {
				even.add(Array[i]);
			}
			else {
				odd.add(Array[i]);
			}
		}
		int oddIndex = 0, evenIndex = 0, resultIndex = 0;
		while(oddIndex < odd.size() && evenIndex < even.size()) {
			if(odd.get(oddIndex) < even.get(evenIndex)) {
				Array[resultIndex] = odd.get(oddIndex);
				oddIndex++;
			}
			else {
				Array[resultIndex] = even.get(evenIndex);
				evenIndex++;
			}
			resultIndex++;
		}
		if(oddIndex < odd.size()) {
			while(oddIndex < odd.size()) {
				Array[resultIndex] = odd.get(oddIndex);
				oddIndex++;
				resultIndex++;
			}
		}
		else {
			while(evenIndex < odd.size()) {
				Array[resultIndex] = even.get(evenIndex);
				evenIndex++;
				resultIndex++;
			}
		}
		return Array;
		
	}

}
