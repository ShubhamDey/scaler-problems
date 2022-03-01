package week3.november29.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * You are given a constant array A.
 * You are required to return another array which is the reversed form of input array.
 */

public class ReverseTheArray {

	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A) {
    
        ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = A.size() - 1 ; i >= 0 ; i--) {
			result.add(A.get(i));
		}
		return result;
    
    }
    
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solveAlternative(final List<Integer> A) {
    
        ArrayList<Integer> result = new ArrayList<Integer>();
		result.addAll(A);
		Collections.reverse(result);
		return result;
    
    }
	
}
