package week15.march2.assignment;

import java.util.ArrayList;
import java.util.List;

/*
 * Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 */

public class MergeTwoSortedArrays {
	
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
    
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	int indexA = 0, indexB = 0;
		while(indexA < A.size() && indexB < B.size()) {
			if(A.get(indexA) < B.get(indexB)) {
				result.add(A.get(indexA));
				indexA++;
			}
			else {
				result.add(B.get(indexB));
				indexB++;
			}
		}
		if(indexA < A.size()) {
			while(indexA < A.size()) {
				result.add(A.get(indexA));
				indexA++;
			}
		}
		else {
			while(indexB < B.size()) {
				result.add(B.get(indexB));
				indexB++;
			}
		}
		return result;
    
    }

}
