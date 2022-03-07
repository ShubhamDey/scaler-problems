package week15.march2.assignment;

import java.util.ArrayList;
import java.util.List;

/*
 * Find the Bth smallest element in given array A .
 * 
 * NOTE: Users should try to solve it in <= B swaps.
 */

public class KthSmallestElement {

	// DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
    
    	ArrayList<Integer> list = new ArrayList<Integer>(A);
    	for(int i = 0 ; i < B ; i++) {
    		int smallest = Integer.MAX_VALUE, index = 0;
    		for(int j = i ; j < list.size() ; j++) {
    			if(list.get(j) < smallest) {
    				smallest = list.get(j);
    				index = j;
    			}
    		}
    		int temp = list.get(i);
    		list.set(i, smallest);
    		list.set(index, temp);
    	}
    	return list.get(B - 1);
    
    }
	
}
