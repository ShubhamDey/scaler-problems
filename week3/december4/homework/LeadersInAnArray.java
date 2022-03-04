package week3.december4.homework;

import java.util.ArrayList;

/*
 * Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
 * An element is a leader if it is strictly greater than all the elements to its right side.
 * 
 * NOTE: The rightmost element is always a leader. Ordering in the output doesn't matter. 
 * 
 * Return an integer array denoting all the leader elements of the array.
 */

public class LeadersInAnArray {
	
	public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int max = A.get(A.size() - 1);
        result.add(max);
        for(int i = A.size() - 2 ; i >= 0 ; i--){
            if(A.get(i) > max){
                result.add(A.get(i));
                max = A.get(i);
            }
        }
        return result;

    }

}
